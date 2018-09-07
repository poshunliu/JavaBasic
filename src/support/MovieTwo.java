package support;


class MovieTwo{

    public void CrimeTwo(String s, int n){
        System.out.println("test 1");
    }

    public void CrimeTwo(int n){
        System.out.println("test 2");
    }

}

class overload{
    public static void main(String args[]){
        MovieTwo movieTwo = new MovieTwo();
        movieTwo.CrimeTwo("1111", 2);
        movieTwo.CrimeTwo(2);
    }
}
