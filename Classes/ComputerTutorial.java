class Computer {

    public void playMusic() {
        System.out.println("Playing Music....");
    }

    public String getMeaPen(int cost) {
        if (cost <= 10) {
            return "Nothing";
        }

        return "Pen..";
    }
}

public class ComputerTutorial {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.playMusic();

        String result = computer.getMeaPen(2);

        System.out.println(result);
    }

}
