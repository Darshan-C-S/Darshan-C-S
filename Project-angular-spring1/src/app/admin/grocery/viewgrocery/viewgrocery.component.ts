import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Grocery } from 'src/app/model/grocery';
import { HttpClientService } from 'src/app/service/http-client.service';

@Component({
  selector: 'app-viewgrocery',
  templateUrl: './viewgrocery.component.html',
  styleUrls: ['./viewgrocery.component.css']
})
export class ViewgroceryComponent implements OnInit {

  constructor(private httpClientService: HttpClientService, private router: Router) { }

  @Input()
  grocery: Grocery;
  @Output()
  groceryDeletedEvent = new EventEmitter();
  ngOnInit() {
  }
  deleteGrocery() {
    this.httpClientService.deleteGrocery(this.grocery.id).subscribe(
      (book) => {
        this.groceryDeletedEvent.emit();
        this.router.navigate(['admin', 'grocery']);
      }
    );
  }
  editGrocery() {
    this.router.navigate(['admin', 'grocery'], { queryParams: { action: 'edit', id: this.grocery.id } });
  }

}


