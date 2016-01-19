package co.adrianblan.caligraphy;

/** Utility functions */
public class Utils {

    /** Returns the value of val, clamped between min and max */
    public static float clamp (float val, float min, float max) {
        return Math.max(min, Math.min(val, max));
    }

    /** Normalizes a value from [min, max] to [0, 1] */
    public static float normalize(float val, float min, float max) {
        float clampedVal = clamp(val, min, max);

        float offset = 0f - min;
        float scale = 1f / (max + offset);

        return (clampedVal + offset) * scale;
    }
}