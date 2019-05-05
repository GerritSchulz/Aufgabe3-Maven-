import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// Mehr Informationen in der ReadMe

public class Result implements Comparator<Flear> {

Comparator<Flear> compareRatings = Comparator.comparing(Flear::getRating).reversed();

    public int getOptimalValue(float money, List<Flear> flears){ //static
        int res = 0;
        float zero = 0.0f;
        int result = Float.compare(money,zero);


        List<Flear> ratedFlears = flears
                .stream()
                .sorted(compareRatings)
                .collect(Collectors.toList());

/*        while(result > 0){
            for(Flear flear : flears){
                result = Float.compare(money,zero);
                money = money - flear.getPrice();
                res = res + flear.getRating();
            }
        }*/

        System.out.println("------------------------------");
        for(Flear floh : ratedFlears){
            System.out.println(floh.getName() + " " + floh.getPrice() + " " + floh.getRating());
        }

/*        // Beste Wertung
        for(Flear flear : ratedFlears){
            result = Float.compare(money,zero);
            if(result > 0){
                money = money - flear.getPrice();
                result = Float.compare(money,zero);
                if(result > 0){
                    res = res + flear.getRating();
                }
            }
        }*/

        for(int i = 0; i < flears.size();i++){
            flears.get(i).getPrice();
            flears.get(i).getRating();
            for(int j = 0; j < flears.size();j++){
                if(i!=j){
                flears.get(j).getPrice();
                flears.get(j).getRating();
                //System.out.println(i+" "+ j);
                }
            }
        }

        System.out.println("Gesamtwertung: " + res + " Geld: " + money );
        return res;
    }



    @Override
    public int compare(Flear f1, Flear f2) {
        return f1.getRating() - f2.getRating();
    }
}
