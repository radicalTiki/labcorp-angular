import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  Employees: Employee[];

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.employeeService.findAll().subscribe(data => {
      this.Employees = data;
    });
  }
}
