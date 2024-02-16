package com.directi.training.lsp.exercise.solution;
import java.util.ArrayList;
import java.util.List;

public class Pool
{
    public void run()
    {
        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new Duck());
        ducks.add(new ElectronicDuck());
        
        quack(ducks);
        swim(ducks);
    }

    private void quack(List<Duck> ducks )
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(List<Duck> ducks )
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
