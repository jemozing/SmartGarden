package com.unicornsved.smartgarden.placeholder;

import com.unicornsved.smartgarden.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {
    public static String flowerName[] = {
            "Кактус",
            "Подсолнух",
            "Роза",
            "Лук",
            "Чеснок",
            "Ландыш",
            "Гвоздика",
            "Хризантема",
            "Пионы",
            "Азалия",
            "Астры"
    };
    /**
     * An array of sample (placeholder) items.
     */
    public static final List<Flower> ITEMS = new ArrayList<Flower>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, Flower> ITEM_MAP = new HashMap<String, Flower>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
    }

    private static void addItem(Flower item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    private static Flower createPlaceholderItem(int position) {
        return new Flower(flowerName[new Random().nextInt(flowerName.length)], "Item " + position, "04.04", new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(36), position);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class Flower {
        private int sun;
        private int humidity;
        private int temp;
        public final String name, date, place;
        private final static int IMAGE_FLOWER[] = {
                R.drawable.bush,
                R.drawable.cactus,
                R.drawable.cactus1,
                R.drawable.cactus2,
                R.drawable.flowerpot,
                R.drawable.flowerpot1,
                R.drawable.flowerpot2,
                R.drawable.flowerpot3,
                R.drawable.plantpot,
                R.drawable.plantpot1,
                R.drawable.plantpot2,
                R.drawable.plantpot3
        };
        public final static int IMAGE_TEMP = R.drawable.temperature;
        public final static int IMAGE_SUN = R.drawable.sun;
        public final static int IMAGE_HUM = R.drawable.wateringcan;
        public int FlowIm;
        private int position;

        public Flower(String name, String place, String date, int sun, int humidity) {
            this.sun = sun;
            this.humidity = humidity;
            this.name = name;
            this.date = date;
            this.place = place;
        }

        public Flower(String name, String place, String date, int sun, int humidity, int temp, int position) {
            this.sun = sun;
            this.humidity = humidity;
            this.name = name;
            this.date = date;
            this.place = place;
            this.position = position;
            this.temp = temp;
        }

        public int randomImageFlower(){
            FlowIm = IMAGE_FLOWER[new Random().nextInt(IMAGE_FLOWER.length)];
            return FlowIm;
        }


        @Override
        public String toString() {
            return place;
        }

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public double getSun() {
            return sun;
        }

        public void setSun(int sun) {
            this.sun = sun;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }
}