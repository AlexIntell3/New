public class Main
{ public static void main(String[] args) {
    System.out.println("Задание 1");
    int a=1000;
    byte b=(byte)20;
    short c=(short)500;
    long d=10_000L;
    float e=5.1f;
    double f=6.00000009d;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    System.out.println("Задание 2");
    double h=27.12;
    long i=987_678_965_549L;
    float j=2.786f;
    short k=(short) 569;
    byte l=(byte)-159;
    int m=(int)27897;
    byte n=(byte)67;
    System.out.println(h);
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(l);
    System.out.println(m);
    System.out.println(n);

    System.out.println("Задание 3");
   int class1pupil=23;
   int class2pupil=27;
   int class3pupil=30;
   int totalShits=480;
   int totalPupil=class1pupil+class2pupil+class3pupil;
    System.out.println("На каждого ученика рассчитано "+totalShits/totalPupil+" листов бумаги");


    System.out.println("Задание 4");
    int productivity=16/2;
    int bottles20=20*productivity;
    int bottlesDay=24*60*productivity;
    int bottles3Day=bottlesDay*3*productivity;
    int bottlesMonth=bottlesDay*30*productivity;
    System.out.println("За 20 минут машина произвела "+bottles20+" штук бутылок");
    System.out.println("За сутки машина произвела "+bottlesDay+" штук бутылок");
    System.out.println("За 3 дня машина произвела "+bottles3Day+" штук бутылок");
    System.out.println("За 1 месяц машина произвела "+bottlesMonth+" штук бутылок");

    System.out.println("Задание 5");
    int totalPaint=120;
    int whitePaintToOneClass=2;
    int brownPaintToOneClass=4;
    int totalClasses=totalPaint/(whitePaintToOneClass+brownPaintToOneClass);
    int totalWhitePint=totalClasses*whitePaintToOneClass;
    int totalBrownPaint=totalClasses*brownPaintToOneClass;
    System.out.println("В школе где "+totalClasses+" классов,нужно "+totalWhitePint+" банок белой краски и "+totalBrownPaint+" банок коричневаой краски.");

    System.out.println("Задание 6");
    //Бананы — 5 штук (1 банан — 80 грамм).
    //Молоко — 200 мл (100 мл = 105 грамм).
    // Мороженое-пломбир — 2 брикета по 100 грамм.
    // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).

    int bananasQuantity=5;
    int oneBananasWeightGr=80;
    int milkMl=200/100;
    int oneMilkGr=105;
    int iceCreamQuantity=2;
    int oneIceCreamGr=100;
    int egsQuantity=4;
    int oneEggWeight=70;
    int totalBreakfastGr=((bananasQuantity*oneBananasWeightGr)+(milkMl*oneMilkGr)+(iceCreamQuantity*oneIceCreamGr)+(egsQuantity*oneEggWeight));
    float totalBreakfastKg=totalBreakfastGr/1000F;
    System.out.println("Завтрак в гр.: "+totalBreakfastGr);
    System.out.println("Завтрак в кг.: "+totalBreakfastKg);

    System.out.println("Задание 7");
    int weightWantLossKg=7;
    int weightWantLossGr=weightWantLossKg*1000;
    int oneDayWeightLossGrWay1=250;
    int oneDayWeightLossGrWay2=500;
    int avgDayWeightLossGr=(oneDayWeightLossGrWay1+oneDayWeightLossGrWay2)/2;
    int totalDayWeightLossWay1=weightWantLossGr/oneDayWeightLossGrWay1;
    int totalDayWeightLossWay2=weightWantLossGr/oneDayWeightLossGrWay2;
    int totalAvgDayWeightLoss=weightWantLossGr/avgDayWeightLossGr;
    System.out.println("Если спортсмен будет терять по 250 гр. в день ему потребуется "+totalDayWeightLossWay1+" дней");
    System.out.println("Если спортсмен будет терять по 500 гр. в день ему потребуется "+totalDayWeightLossWay2+" дней");
    System.out.println("Если спортсмен будет терять среднее значение гр.между двумя вариантами в день ему потребуется "+totalAvgDayWeightLoss+" дней.");

    System.out.println("Задание 8");
    float mashaOldSalary=67_760;
    float denisOldSalary=83_690;
    float kristinaOldSalary=76_230;
    float increaseCoeff=1.1F;
    float newMashaSalary=mashaOldSalary*increaseCoeff;
    float newDenisSalary=denisOldSalary*increaseCoeff;
    float newKristinaSalary=kristinaOldSalary*increaseCoeff;
    float annualDiffMashaSalary=12*(newMashaSalary-mashaOldSalary);
    float annualDiffDenisSalary=12*(newDenisSalary-denisOldSalary);
    float annualDiffKristinaSalary=12*(newKristinaSalary-kristinaOldSalary);
    System.out.println("Маша теперь получает "+newMashaSalary+" рублей.Годовой доход вырос на "+annualDiffMashaSalary+" рублей");
    System.out.println("Маша теперь получает "+newDenisSalary+" рублей.Годовой доход вырос на "+annualDiffDenisSalary+" рублей");
    System.out.println("Маша теперь получает "+newKristinaSalary+" рублей.Годовой доход вырос на "+annualDiffKristinaSalary+" рублей");



}
}