import java.util.ArrayList;

public class Klas {
    String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kC){
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling l : deLeerlingen) {
            if (l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getDeLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    public String toString() {
        String variable = "in klas " + klasCode + " zitten de volgende leerlingen \n";
        for (Leerling l : deLeerlingen) {
            variable += l.toString() + "\n";
        }
        return variable;
    }
}
