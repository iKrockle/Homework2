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
        var sumWeight = boxer1+boxer2;
        var diffWeight = boxer2-boxer1;
        System.out.println(sumWeight);
        System.out.println(diffWeight);
        //task7
        diffWeight = boxer2-boxer1;
        System.out.println(diffWeight);
        diffWeight = boxer2%boxer1;
        System.out.println(diffWeight);
        //task8
        var time = 640;
        var people = time/8;
        var morePeople = people+94;
        var moreTime = morePeople*8;
        System.out.println("Всего работников в компании — "+people+" человек");
        System.out.println("Если в компании работает "+morePeople+" человек, то всего "+
                moreTime+" часов работы может быть поделено между сотрудниками");
    }
}