package com.example.lightcontrol;

public interface Command {
    void execute();
    void undo();
}