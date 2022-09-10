package com.labcorp;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends EmployeeImpl {
    static final float MAX_VACATION = 15;

    SalariedEmployee() {
        super(MAX_VACATION);
    }
}
