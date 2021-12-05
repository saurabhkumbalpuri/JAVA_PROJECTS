 public class Country  {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getIsdcode() {
        return isdcode;
    }

    public void setIsdcode(String isdcode) {
        this.isdcode = isdcode;
    }

    private String countrycode;
    private String isdcode;

    public void display(){



        System.out.println(" Country Name :" +this.getName());


        System.out.println("Country Code :" +this.getCountrycode());



        System.out.println("ISD Code :" +this.getIsdcode());


    }
}
