public class Person{
    private String name;

    public String getName(){    // get is to access a value
        return name;
    }

    public void setName(String name){   // setter is to change a value
        if(name!=null && name.length()>2){
            this.name = name;
        }
    }
}