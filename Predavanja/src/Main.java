public class Main {
    public static void main(String[] args) {
        //foreach
        int [] prviniz = {1, 2, 3};
        for (int element : prviniz)
        {
            System.out.println("Ispis brojeva: " + element);
        }
        System.out.println("Hello world!");


        //while petlja
        //Napisati program koji se izvrsava i ispisuje poruku "Poruka" dok god je int brojac < ili = 10, pocetna vrijednost brojaca je 5
        System.out.println("Printanje u while petlji");
        int brojac = 5;
        while (brojac<=10)
        {
            System.out.println("Poruka");
            brojac ++;
        }

        //do while
        // Pocetna vrijednost int BROJ promjenjive je 5. Koristeci do while petlju ispisati na \
        //ekranu "Ispis" dok god je BROJ>5

        int BROJ = 5;
        do
        {
            System.out.println("Ispis");

        }while(BROJ > 5);

        //break
        //Napisati program koji se izvrsava i ispisuje "Ispis"
        // dok god je broj <5. Pocetna vrijednost
        //broja je 0. Prekini program kada je broj == 3


        System.out.println("Ispis za break");
        int broj1 = 0;
        while (broj1<5)
        {
            if(broj1 == 3)
            {
                break;
            }
            System.out.println("Ispis");
            broj1 ++;
        }

        //nizovi
        int [] nizovi = new int [5];
        System.out.println(nizovi);
    }
}