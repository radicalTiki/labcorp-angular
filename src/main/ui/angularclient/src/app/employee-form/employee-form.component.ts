import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-form',
  templateUrl: './Employee-form.component.html',
  styleUrls: ['./Employee-form.component.css']
})
export class EmployeeFormComponent {

  Employee: Employee;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private EmployeeService: EmployeeService) {
    this.Employee = new Employee();
  }

  onSubmit() {
    this.EmployeeService.save(this.Employee).subscribe(result => this.gotoEmployeeList());
  }

  gotoEmployeeList() {
    this.router.navigate(['/employeeList']);
  }
}
