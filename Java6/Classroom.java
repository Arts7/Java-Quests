public class Classroom {

    public static void main(String[] args){
        Wilder jeanclaude = new Wilder("Jean-Claude",true);
        Wilder arthur = new Wilder("Arthur",false);

        System.out.println(jeanclaude.whoAmI());
        System.out.println(arthur.whoAmI());

        arthur.setAware(true);
        System.out.println(arthur.whoAmI());
    }
}