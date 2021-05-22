import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Grocery } from 'src/app/model/Grocery';
import { Pay } from 'src/app/model/Pay';
import { HttpClientService } from 'src/app/service/http-client.service';

@Component({
  selector: 'app-form-validation',
  templateUrl: './form-validation.component.html',
  styleUrls: ['./form-validation.component.css']
})
export class FormValidationComponent implements OnInit {
 
  @Input()
 // pay: Pay
  @Output()
  payAddedEvent = new EventEmitter();
  pay: Pay={} as Pay;
  id: number;
  fname: string;
  lname: string;
  country: string;
  address: string;
  constructor(private httpClientService: HttpClientService,
    private router: Router) { }

  ngOnInit() {
    

  }
    
  addPay() {
    this.httpClientService.createPay(this.pay).subscribe(
      (pay) => {
        console.log(pay);
      }
    );
  }
  

}
