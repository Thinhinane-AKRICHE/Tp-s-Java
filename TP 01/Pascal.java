
int pascal (int nBut, int pBut){
    int tab[] = new int[nBut+1];
    int n, i;

    tab[0] = 1;

    for(n=1; n<=nBut; n++){
        tab[n] = 1;
        
        for(i=n-1; i>0; i--)
            tab[i] = tab[i-1] + tab[i];
    
    }
    
    int result = tab[pBut];
    return result;
}

void main(String [] args) {
    IO.println(" Cn, p = "+ pascal (30000, 250));
}