package moe.sota.decompiler.models;

import moe.sota.decompiler.services.TypeService;
import moe.sota.decompiler.types.Type;
import lombok.Getter;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Getter
public class FileModel extends BaseModel {

    private final JarFile jarFile;
    private final JarEntry jarEntry;
    @Nullable
    private final Type type;

    public FileModel(JarFile jarFile, @NotNull JarEntry jarEntry) {
        super(jarEntry.getName(), false);
        this.jarFile = jarFile;
        this.jarEntry = jarEntry;
        type = TypeService.getType(this);
        setIcon(type != null ? type.getIcon() : "icons/file.png");
    }

    @SneakyThrows
    public byte[] getBytes() {
        return jarFile.getInputStream(jarEntry).readAllBytes();
    }

}