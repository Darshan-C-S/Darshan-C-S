import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/User';
import { Grocery } from '../model/grocery';
import { Pay } from '../model/Pay';


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
  

  constructor(private httpClient: HttpClient) {
  }

  getUsers() {
    return this.httpClient.get<User[]>('http://localhost:8080/users/get');
  }
  addUser(newUser: User) {
    return this.httpClient.post<User>('http://localhost:8080/users/add', newUser);   
  }
  deleteUser(id) {
    return this.httpClient.delete<User>('http://localhost:8080/users/' + id);
  }
  getGrocery() {
    return this.httpClient.get<Grocery[]>('http://localhost:8080/grocery/get');
  }
  addGrocery(newGrocery: Grocery) {
    return this.httpClient.post<Grocery>('http://localhost:8080/grocery/add', newGrocery);
  }
  deleteGrocery(id) {
    return this.httpClient.delete<Grocery>('http://localhost:8080/grocery/' + id);
  }
  updateGrocery(updatedBook: Grocery) {
    return this.httpClient.put<Grocery>('http://localhost:8080/grocery/update', updatedBook);
  }
  createPay(pay: Pay) {
    return this.httpClient.post<Pay>('http://localhost:8080/pay/add', pay);
  }
}

