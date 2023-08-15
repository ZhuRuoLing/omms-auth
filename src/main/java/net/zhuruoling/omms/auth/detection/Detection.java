package net.zhuruoling.omms.auth.detection;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Detection {
    boolean detect(DetectionContext detectionContext);
}
