import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  {  
    System.out.println ("Podaj liczbe calkowita:  ");
    Scanner to = new Scanner (System.in);
    int liczba = to.nextInt();
    int odwrocona = 0;  
    while(liczba != 0)   
    {  
    int i = liczba % 10;  
    odwrocona = odwrocona * 10 + i;  
    liczba = liczba/10;  
    }  
  System.out.println("Podana liczba z odwrocona kolejnoscia cyfr to: " + odwrocona);
  }  
}     
}

//Napisz program, który poprosi użytkownika o wprowadzenie liczby całkowitej, a następnie wyświetli liczbę z odwróconą kolejnością cyfr.