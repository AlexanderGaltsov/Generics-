public class Main {
    public static void main(String[] args){

        MagicBox <String> magicBox = new MagicBox<>(5);
        magicBox.add("Петя");
        magicBox.add("Саша");
        magicBox.add("Коля");
        magicBox.add("Паша");
        magicBox.add("Андрей");

        System.out.println(magicBox.add("Юра"));
        magicBox.print();

    }
}
