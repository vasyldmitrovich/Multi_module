package create_obj;

import describe_obj.Pets;
import java.util.ArrayList;

public class Model {
    private static ArrayList<Pets> listPets = new ArrayList<>();


    public void setArrayList(Pets pets) {
        listPets.add(pets);
    }

    public ArrayList<Pets> getListPets(){
        return listPets;
    }
}
