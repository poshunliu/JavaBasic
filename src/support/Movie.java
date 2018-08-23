package support;



class Movie{

    public void Crime(String s){
        System.out.println(s);
    }

    public void Crime(String s, int n){
        System.out.println(s+ "number is: "+ n);
    }

}

class overloadTest{
    public static void main(String args[]){
        Movie movie = new Movie();
        movie.Crime("AMC movie theatre");
        movie.Crime("AMC movie theatre", 123);
    }
}
