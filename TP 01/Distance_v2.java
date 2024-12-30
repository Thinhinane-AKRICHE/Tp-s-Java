//méthode 02

import java.io.IO;

record Point(int x, int y){

    public float distance (Point p){
        return (float) Math.sqrt( Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));

    }
}


void main(String[] args){
    if(args.length !=2){
        IO.println("Erreur : Vous devez fournir exactement deux paramètres entiers.");
    }
    
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    Point p1 = new Point(x,y);
    Point p2 = new Point(0,0);

    IO.println("La distance entre les points est : " + p2.distance(p1));


    return ;
}
