package moe.sota.decompiler.agent;

import java.lang.instrument.Instrumentation;

public class Main {

    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello World!");
    }

}