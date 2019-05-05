import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flear> flears = new ArrayList<>();
        for(int x = 0; x<=30; x++){
            flears.add(new Flear("floh"+x,(float)Math.round(Math.random()*1000)/100,(int)(Math.random()*10)+1));
        }
        for(Flear floh : flears)
        System.out.println(floh.getName() + " " + floh.getPrice() + " " + floh.getRating());

        Result res = new Result();

        res.getOptimalValue(20,flears);

    }
}
