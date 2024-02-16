package com.directi.training.dip.exercise.solution;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        GeneralEncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
