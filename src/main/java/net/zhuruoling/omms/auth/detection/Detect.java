package net.zhuruoling.omms.auth.detection;

public class Detect implements Detection {
    private boolean isBlacklist;
    private boolean isBlocked;
    public boolean detect(DetectionContext detectionContext) {
        if (isBlacklist) {
            return true;
        }
        return false;
    }

    public void checkBlacklist() {
        // 数据库 or 文件 or other?
    }
}
