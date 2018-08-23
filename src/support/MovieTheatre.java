package support;

abstract class MovieTheatre {

    public String commercial(){
        return "AMC movie theater";
    }

}


class Animation extends MovieTheatre{

    public String commerical(){
        return "Animation commercial";
    }
}



class Adventure extends MovieTheatre{

    public String commerical(){
        return "Adventure commercial";
    }



    public static void main(String args[]){
        Adventure adventure = new Adventure();
        System.out.println(adventure.commerical());

    }

}




