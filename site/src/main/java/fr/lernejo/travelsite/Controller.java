package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    public final List<Inscrire> Nouveaux=new ArrayList<>();
    @PostMapping("api/inscription")
    public void add(@RequestBody Inscrire  nouveau )
    {Nouveaux.add(nouveau);
    }
    @GetMapping("api/travels")
    public List<Country> getCounty(@RequestParam String userName)
    {
       List<Country> country =new ArrayList<>();
       country.add(new Country("Caribbean",32.4));
       country.add((new Country("Australia",35.1)));
       for (Inscrire Insr: Nouveaux ) {
           if(Insr.userName().equals(userName)){
               return country;
           }
    }
       return new ArrayList<Country>();
}
}
