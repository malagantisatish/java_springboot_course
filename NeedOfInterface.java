
interface Computer {

    void code();
}

class Laptop implements Computer {

    public void code() {
        System.out.println("code, compile,run");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {

    public void devApp(Computer laptop) {
        laptop.code();
    }
}

public class NeedOfInterface {

    public static void main(String[] args) {
        Developer satish = new Developer();
        Computer macLaptop = new Laptop();
        Computer benqDesktop = new Desktop();
        satish.devApp(benqDesktop);
    }

}
