package com.labcorp;

public abstract interface Employee {
    static final int MAX_WORK_DAYS = 260;

    public void Work(int workDays) throws Exception;
    public void TakeVacation(float vacationDays) throws Exception;
}
