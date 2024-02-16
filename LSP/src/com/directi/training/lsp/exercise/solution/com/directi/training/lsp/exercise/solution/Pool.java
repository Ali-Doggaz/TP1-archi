package com.directi.training.lsp.exercise.solution;
import java.util.ArrayList;
import java.util.List;

public class Pool
{
    public void run()
    {
        List<IDuck> ducks = new ArrayList<IDuck>();
        ducks.add(new Duck());
        ducks.add(new ElectronicDuck());
        
        quack(ducks);
        swim(ducks);
    }

    private void quack(List<IDuck> ducks )
    {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(List<IDuck> ducks )
    {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
