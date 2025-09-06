
class Computer {

    public void playMusic() {
        System.out.println("music playin.g....");
    }

    public String getMeAPen(int cost) { // if we are return a value we need to type of it in the place of void
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

public class Methods {

    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String pen = obj.getMeAPen(2);
        System.out.println(pen);

    }

}
