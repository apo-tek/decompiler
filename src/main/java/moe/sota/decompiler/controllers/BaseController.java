package moe.sota.decompiler.controllers;

import lombok.AccessLevel;
import lombok.Getter;

import java.awt.*;

public abstract class BaseController<T extends Component> {

    @Getter(AccessLevel.PROTECTED)
    public T view;

    public BaseController(T view) {
        this.view = view;
    }

    public Component getComponent() {
        return view;
    }

}