package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNTER = Color.values().length;

    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLOR_COUNTER)].name();
    }
}
