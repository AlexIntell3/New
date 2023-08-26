public class Main
{ public static void main(String[] args) {
    var dog=8.0;
    var cat=3.6;
    var paper=763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    dog=dog+4;
    cat=cat+4;
    paper=763789+4;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    dog=dog-3.5;
    cat=cat-1.6;
    paper=paper-7639;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    var friend=19;
    System.out.println(friend);
    friend=friend+2;
    System.out.println(friend);
    friend=friend+7;
    System.out.println(friend);

    var frog=3.5;
    System.out.println(frog);
    frog=frog*10;
    System.out.println(frog);
    frog=frog/3.5;
    System.out.println(frog);
    frog=frog+4;
    System.out.println(frog);

    var boxer1=78.2;
    var boxer2=82.7;
    System.out.println(boxer1+boxer2);
    var diffVeight=boxer2-boxer1;
    System.out.println(diffVeight);

    var diff1Way=boxer2-boxer1;
    System.out.println(diff1Way);
    var diff2Way=boxer2%boxer1;
    System.out.println(diff2Way);

    var allHours=640;
    var dayHours=8;
    var employes=allHours/dayHours;
    System.out.println("Всего работников в компании "+employes+" человек");
    employes=employes+94;
    allHours=employes*8;
    System.out.println("Если в компании работает  "+employes+" человек,то всего "+allHours+" часов работы может быть поделено между сотрудниками.");

}
}