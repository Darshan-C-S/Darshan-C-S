import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { FooterComponent } from './footer/footer.component';
import { UsersComponent } from './admin/users/users.component';
import { HttpClientModule } from '@angular/common/http';
import { AdduserComponent } from './admin/users/adduser/adduser.component';
import { FormsModule } from '@angular/forms';
import { ViewuserComponent } from './admin/users/viewuser/viewuser.component';

import { GroceryComponent } from './admin/grocery/grocery.component';
import { AddgroceryComponent } from './admin/grocery/addgrocery/addgrocery.component';
import { ViewgroceryComponent } from './admin/grocery/viewgrocery/viewgrocery.component';
import { ShopgroceryComponent } from './shopgrocery/shopgrocery.component';
import { LoginComponent } from './login/login.component';
import { FormValidationComponent } from './admin/form/form-validation/form-validation.component';
import { HomeComponent } from './home/home.component';
import { VegComponent } from './admin/veg/veg.component';
import { AddvegComponent } from './admin/veg/addveg/addveg.component';
import { ViewvegComponent } from './admin/veg/viewveg/viewveg.component';
import { ShopVegComponent } from './shop-veg/shop-veg.component';



@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FooterComponent,
    UsersComponent,
    AdduserComponent,
    ViewuserComponent,
 
    GroceryComponent,
    AddgroceryComponent,
    ViewgroceryComponent,
    ShopgroceryComponent,
    LoginComponent,
    FormValidationComponent,
    HomeComponent,
    VegComponent,
    AddvegComponent,
    ViewvegComponent,
    ShopVegComponent
 
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
