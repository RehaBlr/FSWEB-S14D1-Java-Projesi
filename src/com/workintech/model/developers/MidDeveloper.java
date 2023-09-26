package com.workintech.model.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + " mid developer begins to work.");
    }
}
