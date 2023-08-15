package net.zhuruoling.omms.auth.util.system.file;

import java.nio.file.Path;

public record FileSystemDescriptor(String displayName, Path mountPoint) {
}
