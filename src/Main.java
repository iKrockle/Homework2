public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task4
        var friend = 19;
        System.out.println(friend);
        friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);
        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);
        //task6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1+boxer2);
        System.out.println(boxer2-boxer1);
        //task7
        System.out.println(boxer2-boxer1);
        System.out.println(boxer2%boxer1);
        //task8
        var time = 640;
        System.out.println("Всего работников в компании — "+time/8+" человек");
        System.out.println("Если в компании работает "+(time/8+94)+" человек, то всего "+
                (time/8+94)*8+" часов работы может быть поделено между сотрудниками");
    }
}