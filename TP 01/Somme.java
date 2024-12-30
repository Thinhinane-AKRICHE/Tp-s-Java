int calculSum(int[] array){
    int somme=0;
    for(int i=0; i<array.length; i++){
        somme = somme + array[i];
    }
    return somme;
}

void main(){
    var a = new int[] {1, 2, 4};
    var b = new int[] {2, 6, 8, 10, 23, -2, 14, 21, 17};

    println(calculSum(a));
    println(calculSum(b));
}