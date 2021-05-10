import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8080/api/v1/employees";

  constructor(private httpClient: HttpClient) { }
  
  getEmployeesList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee: Employee): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, employee);
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
  }

  updateEmployee(id: number, employee: Employee): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}

//    private baseUrl = 'http://localhost:8080/springboot-crud-rest/api/v1/employees';

//    constructor(private http: HttpClient) { }

//    getEmployeeList(id: number): Observable<any> {
//      return this.http.get(`${this.baseUrl}/${id}`);
//    }

//    createEmployee(employee: Object): Observable<Object> {
//      return this.http.post(`${this.baseUrl}`, employee);
//    }

//    updateEmployee(id: number, value: any): Observable<Object> {
//      return this.http.put(`${this.baseUrl}/${id}`, value);
//    }

//    deleteEmployee(id: number): Observable<any> {
//      return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
//    }

//    getEmployeesList(): Observable<any> {
//      return this.http.get(`${this.baseUrl}`);
//  }
 
