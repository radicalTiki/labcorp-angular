package com.labcorp;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeImpl implements Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    public long id;

    float MAX_VACATION = 10;

    @Getter
    @Setter
    float workingDays = 0;

    @Getter
    @Setter
    float vacationDays = 0;

    EmployeeImpl(float maxVacation) {
        this.MAX_VACATION = maxVacation;
        this.vacationDays = maxVacation;
    }

    @Override
    public void Work(int workDays) throws Exception {
        if (workDays < 0 || workDays > MAX_WORK_DAYS ||
                workingDays + workDays > MAX_WORK_DAYS) {
            throw new Exception("Invalid Work Days, range is 0-" + MAX_WORK_DAYS);
        }
        this.workingDays = workDays;
    }

    @Override
    public void TakeVacation(float vacationDays) throws Exception {
        if (vacationDays > MAX_VACATION || this.vacationDays + vacationDays > MAX_VACATION) {
            throw new Exception("Invalid Vacation Days, range is 0-" + MAX_VACATION);
        }
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "Employee: working days: " + this.workingDays + " vacation days: " + this.vacationDays;
    }
}
