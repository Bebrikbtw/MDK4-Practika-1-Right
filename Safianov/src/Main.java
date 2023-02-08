public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        System.out.println("Задание - 1");
        Phone phone1 = new Phone("89307454607", "Xiaomi note 8T", 420);
        Phone phone2 = new Phone("89005840095", "Iphone 11", 222);
        Phone phone3 = new Phone("89307463408", "Iphone xs", 648);
        phone1.receiveCall("Иван");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Владимир");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Олег");
        System.out.println(phone3.GetNumber());
        phone1.receiveCall("Иван", "89307454607");
        phone2.receiveCall("Владимир", "89005840095");
        phone3.receiveCall("Олег", "89307463408");
        String[] nums = new String[]{"89307454607", "89005840095", "89307463408"};
        Phone.sendMessage(nums);
        System.out.println("");
        System.out.println("Задание - 2");
        Person nn = new Person();
        Person Ivan = new Person("Сафьянов Иван Павлович", 17);
        Ivan.move(Ivan.fullName);
        Ivan.talk(Ivan.fullName);
    }
}