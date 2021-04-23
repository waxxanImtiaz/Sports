package sports.beans;

public class Pessanger {
    private int id;

    public Pessanger(int id){
        this.id = id;
    }
    public Pessanger(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger:" + id;
    }
}
