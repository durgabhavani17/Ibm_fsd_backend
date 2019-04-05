import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Employee } from  './models/employee.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {

  constructor(private http:HttpClient) {}

  private employeeUrl = 'http://localhost:8082/SpringRESTEmployeeCRUDEx/employees';
  //private employeeUrl = '/api';

  public getEmployees() {
    return this.http.get<Employee[]>(this.employeeUrl);
  }
  public getEmployeeById(employee) {
    return this.http.get<Employee>(this.employeeUrl+ '/' +employee.id);
  }

  public deleteEmployee(employee) {
    return this.http.delete(this.employeeUrl + "/"+ employee.id);
  }

  public createEmployee(employee) {
    return this.http.post<Employee>(this.employeeUrl, employee);
  }
  public updateEmployee(employee)
  {
    return this.http.put(this.employeeUrl + "/" +employee.id,employee);
  }

}
