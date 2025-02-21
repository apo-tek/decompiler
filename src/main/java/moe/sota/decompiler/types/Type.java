package moe.sota.decompiler.types;

import lombok.Getter;
import moe.sota.decompiler.models.FileModel;

@Getter
public abstract class Type {

    private final String icon;
    private final String syntax;

    public Type(String icon, String syntax) {
        this.icon = icon;
        this.syntax = syntax;
    }

    public abstract boolean isFormat(FileModel fileModel);

}