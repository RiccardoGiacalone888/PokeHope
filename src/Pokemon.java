public class Pokemon {
    private String name;
    private String type;
    private String evolution;
public Pokemon(String name, String type, String evolution) {
    this.name = name;
    this.type= type;
    this.evolution = evolution;

}
public String getName(){
    return name;
}
public String getType(){
    return type;
}
public String getEvolution(){
    return evolution;
}
public void setDetails(){
    System.out.println("Name : " + name);
    System.out.println("Type : " + type);
    System.out.println("Evolves into : " + evolution);
}
}
