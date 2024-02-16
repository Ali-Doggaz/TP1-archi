package com.directi.training.ocp.exercise.solution;

public class ResourceAllocator
{
    public int allocate(Resource resource)
    {  
        int resourceId = resource.getFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markSlotFree(resourceId);
    }
}
