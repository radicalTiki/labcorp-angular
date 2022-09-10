import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from './employee';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class EmployeeService {

  private employeesUrl: string;

  constructor(private http: HttpClient) {
    this.employeesUrl = 'http://localhost:8080/employee';
  }

  public findAll(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.employeesUrl);
  }

  public save(user: Employee) {
    return this.http.post<Employee>(this.employeesUrl, user);
  }
}
