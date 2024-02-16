package com.directi.training.lsp.exercise.solution;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck can't quack when off...");
            //throw new RuntimeException("Electronic duck can't quack when off...");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {            
            System.out.println("Electronic duck can't swim when off...");
            // throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

}
