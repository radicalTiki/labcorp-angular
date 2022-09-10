package com.labcorp;

import javax.persistence.Entity;

@Entity
public class HourlyEmployee extends EmployeeImpl {
    static final float MAX_VACATION = 10;

    HourlyEmployee() {
        super(MAX_VACATION);
    }
}
