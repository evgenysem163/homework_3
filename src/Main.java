import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int numberOfPears = 15;
      byte ram = 127;
      short fixingBolt = 150;
      long hugeNumber = 335000;
      float bigWeight = 180.5f;
      double km = 120.4;

        System.out.println("Значение переменной  numberOfPears  с типом int равно " + numberOfPears);
        System.out.println("Значение переменной ram с типом byte равно " + ram );
        System.out.println("Значение переменной fixingBolt с типом short равно " + fixingBolt);
        System.out.println("Значение переменной hugeNumber с типом long равно " + hugeNumber);
        System.out.println("Значение переменной bigWeight с типом float равно " + bigWeight);
        System.out.println("Значение переменной km с типом double равно " + km);

        float circle = 27.12f;
        long ship = 98767896549L;
        double money = 2.786;
        int parrot = 569;
        int quail = - 159;
        int pen = 27897;
        short window = 69;

        int lyudmilaPavlovna = 23;
        int annaSergeyevna = 27;
        int еkaterinaAndreevna = 30;
        int sheet = 480;
        int total = lyudmilaPavlovna + annaSergeyevna + еkaterinaAndreevna / sheet;
      System.out.println( " на каждого ученика расчитано " +  total + " листов бумаги ");

        int bottle = 16;
        int minute = 2;
        int oneMinute = bottle / minute;
//      System.out.println(oneMinute);
       int twentyTime = 20;
      System.out.println( " производительность машины за 20 минут " + oneMinute * twentyTime);
       int day = 1440;
      System.out.println(" производительность машины за сутки " + oneMinute * day );
      int threeDays = 3420;
      System.out.println(" производительность машины за трое суток " + oneMinute * threeDays );
      int month = 35340;
      System.out.println(" производительность машины за месяц " + oneMinute * month);


      // school
      int dye = 120;
      int white = 2;
      int brown = 4;
      int oneClass = white + brown;
      int totalСlasses = dye / oneClass;
//      System.out.println(totalСlasses);
      int whiteClass = totalСlasses * white;
      int brownClass = totalСlasses * brown;
      System.out.println("В школе, где " + totalСlasses + " классов, нужно " + whiteClass + " банок белой краски и " + brownClass + " банок коричневой краски");

      double bananas = 5 * 80;
//      System.out.println(bananas);
      double milk  = 210;
      double iceCream = 200;
      double rawEggs = 4 * 70;
      double weight = milk + bananas + iceCream + rawEggs ;
      System.out.println( " в граммах " + weight);
      System.out.println(" в килограммах " + weight / 1000);

      int weightKg = 7 * 1000;
      int conditionOne = weightKg / 250;
      int conditionTwo = weightKg / 500;
      System.out.println("спортсмен будет терять в первом условии " + conditionOne  + " в день ");
      System.out.println("спортсмен будет терять во втором условии " + conditionTwo + " в день ");
      System.out.println("чтобы добиться результата похудения спортсменну может потребоваться " + (conditionOne + conditionTwo)  / 2   + " дней " );

       int masha = 67760;
       int denis = 83690;
       int kristina = 76230;
      double masha1  = masha * 12;
      double denis1 = denis * 12;
      double kristina1 = kristina * 12;
      System.out.println("Зарплата Mаши  в год  до повышения " + masha1);
      System.out.println("Зарплата Дениса в год до повышения " + denis1);
      System.out.println("Зарплата Кристины в год до повышения " + kristina1);

       float x = 1.1f;
       double x1 = x * masha;
      double x2 = x * denis;
      double x3 = x * kristina;

      double monthMasha  = x1 * 12;
      double monthDenis = x2 * 12;
      double monthKristina = x3 * 12;

      System.out.println("Маша теперь получает " + x1 + " рублей Годовой доход вырос на " + monthMasha + " рублей ");
      System.out.println("Денис теперь получает " + x2 + " рублей. Годовой доход выросв на " + monthDenis + " рублей ");
      System.out.println("Кристина теперь получает " + x3 + " рублей. Годовой доход вырос на " + monthKristina + " рублей ");


      System.out.println("разница между годовым доходом с нынешней зарплатой и после повышения " + (monthMasha - masha1));
      System.out.println("разница между годовым доходом с нынешней зарплатой и после повышения " + (monthDenis - denis1));
      System.out.println("разница между годовым доходом с нынешней зарплатой и после повышения " + (monthKristina - kristina1));








    }
}