import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Grocery } from '../model/grocery';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-shopgrocery',
  templateUrl: './shopgrocery.component.html',
  styleUrls: ['./shopgrocery.component.css']
})
export class ShopgroceryComponent implements OnInit {

  grocery: Array<Grocery>;
  groceryRecieved: Array<Grocery>;
  cartGrocery: any;
  selectedGrocery: Grocery;

  constructor(private router: Router, private httpClientService: HttpClientService) { }

  ngOnInit() {
    this.httpClientService.getGrocery().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
    let data = localStorage.getItem('cart');
    //if this is not null convert it to JSON else initialize it as empty
    if (data !== null) {
      this.cartGrocery = JSON.parse(data);
    } else {
      this.cartGrocery = [];
    }
  }
  handleSuccessfulResponse(response) {

    this.grocery = new Array<Grocery>();
    this.groceryRecieved = response;
    for (const grocery of this.groceryRecieved) {

      const grocerywithRetrievedImageField = new Grocery();
      grocerywithRetrievedImageField.id = grocery.id;
      grocerywithRetrievedImageField.name = grocery.name;
      grocerywithRetrievedImageField.retrievedImage = 'data:image/jpeg;base64,' + grocery.picByte;
      grocerywithRetrievedImageField.details = grocery.details;
      grocerywithRetrievedImageField.price = grocery.price;
      grocerywithRetrievedImageField.picByte = grocery.picByte;
      this.grocery.push(grocerywithRetrievedImageField);


    }
  }
  addToCart(groceryId) {
    //retrieve book from books array using the book id
    let grocery = this.grocery.find(grocery=> {
      return grocery.id === +groceryId;
    });
    let cartData = [];
    //retrieve cart data from localstorage
    let data = localStorage.getItem('cart');
    //prse it to json 
    if (data !== null) {
      cartData = JSON.parse(data);
    }
    // add the selected book to cart data
    cartData.push(grocery);
    //updated the cartBooks
    this.updateCartData(cartData);
    //save the updated cart data in localstorage
    localStorage.setItem('cart', JSON.stringify(cartData));
    //make the isAdded field of the book added to cart as true
    grocery.isAdded = true;
  }
  updateCartData(cartData) {
    this.cartGrocery = cartData;
  }
  goToCart() {
    this.router.navigate(['/cart']);
  }
  emptyCart() {
    this.cartGrocery = [];
    localStorage.clear();
  }
  payGrocery() {
    this.selectedGrocery = new Grocery();
    this.router.navigate(['admin','form']), { queryParams: { action: 'add' } };
  }

}
