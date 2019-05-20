
class Decipherer {

    public static String decriptage(String message) {
        int lMess = message.length() / 2;
        String sousTitre = message.substring(5,(lMess+5));
        String change = sousTitre.replace("@#?", " ");
        String inverser = new StringBuilder(change).reverse().toString();
        return inverser;
    }

    public static void main(String[] args) {
        String message = "0@sn9sirppa@#?ia'jgtvryko1";
        String message1 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message2 = "aopi?sedohtém@#?sedhtmg+p9l!";
        System.out.println(decriptage(message)+" "+(decriptage(message1))+" " +(decriptage(message2))+".");
    }

}