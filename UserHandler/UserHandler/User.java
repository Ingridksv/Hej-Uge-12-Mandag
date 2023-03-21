package UserHandler;



public class User {

    String name;
    String password;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(DataValidator.isUserNameValid(name)){
            this.name = name;
        }
        else{
            this.name = null; //Sæt "" ind istedet for null, så kører den, da vi har sat en String ind og den forventer at vi returnerer noget.
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(DataValidator.isPasswordValid(password)){
            this.password = password;
        }
        else{
            this.password = "N/A";
        }
    }
}