import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormValidationComponent } from './admin/form/form-validation/form-validation.component';
import { GroceryComponent } from './admin/grocery/grocery.component';
import { UsersComponent } from './admin/users/users.component';
import { VegComponent } from './admin/veg/veg.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ShopVegComponent } from './shop-veg/shop-veg.component';
import { ShopgroceryComponent } from './shopgrocery/shopgrocery.component';

const routes: Routes = [
  { path: 'admin/users', component: UsersComponent },
  { path: 'admin/grocery', component: GroceryComponent },
  { path: 'shop', component: ShopgroceryComponent },
  { path: 'login', component:LoginComponent},
  { path: 'admin/form', component: FormValidationComponent},
  { path: 'home', component: HomeComponent},
  {path: 'admin/veg' , component : VegComponent},
  {path : 'shop2', component:ShopVegComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
