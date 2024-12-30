import java.io.IO;

record Point(int x, int y){

    static float distance (Point p1, Point p2){
        return (float) Math.sqrt( Math.pow(p2.x() - p1.x(), 2) + Math.pow(p2.y() - p1.y(), 2));

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

    IO.println("La distance entre les points est : " + Point.distance(p1,p2));


    return ;
}

