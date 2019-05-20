import java.util.Arrays;
class Movies {
    public static void main(String[] args){
        String[] movies = {
            "Indiana Jones et la Dernière Croisade", 
            "Indiana Jones et le Royaume du Crâne de Cristal", 
            "Indiana Jones et le Temple maudit"
        };

        String[] actors1 = {
            "Harrison Ford",
            "Sean Connery",
            "Alison Doody"
        };

        String[] actors2 = {
            "Harrison Ford",
            "Cate Blanchett",
            "Shia LaBeouf"
        };

        String[] actors3 = {
            "Harrison Ford",
            "Kate Capshaw",
            "Jonathan Ke Quan"
        };

        String[][] actors = {
            actors1,
            actors2,
            actors3
        };

        for (int i = 0; i < movies.length ; i++){

            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont:" + Arrays.toString(actors[i]));

        };
    }
}