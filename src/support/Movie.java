package support;



class Movie{
    private String name;
    public Movie(){
    }

    public Movie(String movieName){
        this.name = movieName;
    }


    public void Crime(String s){
        System.out.println(s);
    }

    public void Crime(String s, int n){
        System.out.println(s+ "number is: "+ n);
    }

    public String getName(){
        return this.name;
    }

}

class overloadTest{
    public static void main(String args[]){
        Movie movie = new Movie();
        movie.Crime("AMC movie theatre");
        movie.Crime("AMC movie theatre", 123);

        Movie m2 = new Movie("mission impossible");
        System.out.println(m2.getName());
    }
}
