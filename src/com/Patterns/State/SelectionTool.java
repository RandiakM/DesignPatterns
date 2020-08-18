package com.Patterns.State;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed Rectangle");
    }
}
