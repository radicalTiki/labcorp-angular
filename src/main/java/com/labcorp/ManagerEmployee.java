package com.labcorp;

import javax.persistence.Entity;

@Entity
public class ManagerEmployee extends EmployeeImpl {
    static final float MAX_VACATION = 30;

    ManagerEmployee() {
        super(MAX_VACATION);
    }
}
