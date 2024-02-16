package com.directi.training.ocp.exercise.solution;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:17:04 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Resource
{
    public int getFreeSlot()
    {
        return 0;
    }
    
    public abstract void markSlotFree(int resourceId);
    public abstract void markSlotBusy(int resourceId);

}
