public class Animal {
    private String Breed;
    private String Colour;
    private String name;

    public String getBreed(){
        return Breed;
    }
    public void setBreed(String x){
        Breed=x;
    }


    public String getColour(){
        return Colour;
    }
    public void setColour(String x){
        Colour=x;
    }


    public String getname(){
        return name;
    }
    public void setname(String x){
        name=x;
    }



    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setBreed("Pug");
        System.out.println(dog.getBreed());
        dog.setname("lily");
        System.out.println(dog.getname());
        dog.setColour("white");
        System.out.println(dog.getColour());


    }
}
