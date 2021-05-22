import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Grocery } from 'src/app/model/grocery';
import { HttpClientService } from 'src/app/service/http-client.service';

@Component({
  selector: 'app-grocery',
  templateUrl: './grocery.component.html',
  styleUrls: ['./grocery.component.css']
})
export class GroceryComponent implements OnInit {

  grocery: Array<Grocery>;
  groceryRecieved: Array<Grocery>;
  action: string;
  selectedGrocery: Grocery;
  
  constructor(private httpClientService: HttpClientService,
    private activedRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.refreshData();
     
   }

   refreshData(){
    this.httpClientService.getGrocery().subscribe(
      response => this.handleSuccessfulResponse(response)
    );

     this.activedRoute.queryParams.subscribe(
      (params) => {
        // get the url parameter named action. this can either be add or view.
        this.action = params['action'];
	// get the parameter id. this will be the id of the book whose details 
	// are to be displayed when action is view.
	const id = params['id'];
	// if id exists, convert it to integer and then retrive the book from
	// the books array
        if (id) {
          this.selectedGrocery = this.grocery.find(grocery => {
            return grocery.id === +id;
          });
        }
      }
    );
  }
   handleSuccessfulResponse(response) {
    this.grocery = new Array<Grocery>();
    this.groceryRecieved = response;
    for (const book of this.groceryRecieved) {
    
      const grocerywithRetrievedImageField = new Grocery();
      grocerywithRetrievedImageField.id = book.id;
      grocerywithRetrievedImageField.name = book.name;
      //populate retrieved image field so that book image can be displayed
      grocerywithRetrievedImageField.retrievedImage = 'data:image/jpeg;base64,' + book.picByte;
      grocerywithRetrievedImageField.details = book.details;
      grocerywithRetrievedImageField.price = book.price;
      grocerywithRetrievedImageField.picByte=book.picByte;
      this.grocery.push(grocerywithRetrievedImageField);
    }
  }


  addGrocery() {
    this.selectedGrocery = new Grocery();
    this.router.navigate(['admin', 'grocery'], { queryParams: { action: 'add' } });
  }
  viewGrocery(id: number) {
    this.router.navigate(['admin', 'grocery'], { queryParams: { id, action: 'view' } });
  }
}
  


    // this.grocerys = new Array<Grocery>();

    // const grocery2 = new Grocery();
    // grocery2.id = 2;
    // grocery2.name = 'Mutten biryani';
    // grocery2.details = 'Dhum cooked mutten biryani  ';
    // grocery2.price = 200;

    // const grocery3= new Grocery();
    // grocery3.id = 2;
    // grocery3.name = 'ice creem';
    // grocery3.details = 'chocklet icecream  ';
    // grocery3.price = 100;

    // this.grocerys.push(grocery2);
    // this.grocerys.push(grocery3);
  


