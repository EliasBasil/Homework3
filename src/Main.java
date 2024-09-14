public class Main {
    public static void main(String[] args) {
        // Задача 1
        int intVariable = 12_345;
        byte byteVariable = 124;
        short shortVariable = 10_000;
        long longVariable = 901_234_567_890L;
        float floatVariable = 54.812f;
        double doubleVariable = 23754.986123445;
        System.out.println(intVariable);
        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(longVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        // Задача 2
        float firstVariable = 27.12f;
        long secondVariable = 987_678_965_549L;
        float thirdVariable = 2.786f;
        short fourthVariable = 569;
        short fifthVariable = -159;
        short sixthVariable = 27_897;
        byte seventhVariable = 67;

        // Задача 3
        short lyudmila = 23;
        short anna = 27;
        short ekaterina = 30;
        short totalSheets = 480;
        short sheetsPerStudent = (short) (totalSheets / (lyudmila + anna + ekaterina));
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        // Задача 4
        byte bottlesPerMinute = (byte) (16 / 2);
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        // Задача 5
        byte totalPaint = 120;
        byte paintPerClassroom = (byte) (2 + 4);
        byte numberOfClassrooms = (byte) (totalPaint / paintPerClassroom);
        byte totalWhitePaint = (byte) (numberOfClassrooms * 2);
        byte totalBrownPaint = (byte) (numberOfClassrooms * 4);
        System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + totalWhitePaint
                + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача 6
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        int totalWeightInGrams = bananas * bananaWeight + milkWeight * milk / 100 +
                iceCreamWeight * iceCream + eggWeight * eggs;
        System.out.println("Вес завтрака в граммах: " + totalWeightInGrams);
        float totalWeightInKilograms = totalWeightInGrams / 1_000f;
        System.out.println("Вес завтрака в килограммах: " + totalWeightInKilograms);

        // Задача 7
        short weightToLose = 7_000;
        short weightLossSlow = 250;
        short weightLossFast = 500;
        short daysSlow = (short) (weightToLose / weightLossSlow);
        short daysFast = (short) (weightToLose / weightLossFast);
        System.out.println("При быстром похудении потребуется " + daysFast + " дней");
        System.out.println("При медленном похудении потребуется " + daysSlow + " дней");
        byte daysMedian = (byte) ((daysSlow + daysFast) / 2);
        System.out.println("В среднем для похудения потребуется " + daysMedian + " день");

        // Задача 8
        int mashaBefore = 67_760;
        float mashaAfter = mashaBefore * 1.1f;
        float mashaDifference = mashaAfter - mashaBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " +
                mashaDifference + " рублей");
        int denisBefore = 83_690;
        float denisAfter = denisBefore * 1.1f;
        float denisDifference = denisAfter - denisBefore;
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " +
                denisDifference + " рублей");
        int christinaBefore = 76_230;
        float christinaAfter = christinaBefore * 1.1f;
        float christinaDifference = christinaAfter - christinaBefore;
        System.out.println("Кристина теперь получает " + christinaAfter + " рублей. Годовой доход вырос на " +
                christinaDifference + " рублей");
    }
}