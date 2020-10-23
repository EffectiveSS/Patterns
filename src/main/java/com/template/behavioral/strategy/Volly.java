package com.template.behavioral.strategy;

public class Volly {

    private Activity activity;

    public Volly(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.doActivity();
    }

}
