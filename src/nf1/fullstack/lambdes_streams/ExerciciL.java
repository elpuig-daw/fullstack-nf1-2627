package nf1.fullstack.lambdes_streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExerciciL {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyy");
        Persona p1 = new Persona("Arya", Persona.Genere.DONA, LocalDate.parse("25/12/2002",format) );
        Persona p2 = new Persona("Tyrion", Persona.Genere.HOME, LocalDate.parse("12/10/1980",format));
        Persona p3 = new Persona("Cersei", Persona.Genere.DONA, LocalDate.parse("10/01/1984",format));
        Persona p4 = new Persona("Eddard", Persona.Genere.HOME, LocalDate.parse("24/04/1974",format));
        Persona p5 = new Persona("Sansa", Persona.Genere.DONA, LocalDate.parse("24/04/1992",format));
        Persona p6 = new Persona("Jaime", Persona.Genere.HOME, LocalDate.parse("24/04/1979",format));
        Persona p7 = new Persona("Khal", Persona.Genere.HOME, LocalDate.parse("10/08/1979",format));
        Persona p8 = new Persona("Daenerys", Persona.Genere.DONA, LocalDate.parse("12/11/1992",format));
        Persona p9 = new Persona("Davos", Persona.Genere.HOME, LocalDate.parse("12/11/1965",format));
        Persona p10 = new Persona("Jon Neu", Persona.Genere.HOME, LocalDate.parse("12/11/1986",format));
        Persona p11 = new Persona("Brienne", Persona.Genere.DONA, LocalDate.parse("12/11/1989",format));

        Persona[] lpers = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
        List<Persona> llistaPersones;
        llistaPersones = new ArrayList<>(Arrays.asList(lpers));
        Map<Integer,Integer> mapPersones = new HashMap<>();

        // 1 - Canviar per una lambda
        System.out.println("\n1-2");
        Collections.sort(llistaPersones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                if(o1.getNom().charAt(0) >= o2.getNom().charAt(0)) return 1;
                else return -1;
            }
        });



        // 2 - Canviar per una Lambda
        for(Persona p: llistaPersones) {
            System.out.println(p);
        }


        // 3 - Canvia per una classe anònima
        System.out.println("\n3-4");
        //ordenació alfabètica inversa del nom
            llistaPersones.sort((o1,o2) -> o2.getNom().compareTo(o1.getNom()));


        // 4 - Canvia per una crida al mètode per referència
        for(Persona p: llistaPersones) {
            System.out.println(p);
        };


        // 5 - Canvia l'ompliment d'aquest map per un forEach amb lambda
        for(Persona per : llistaPersones) {
            mapPersones.put(per.getAge(),1);
        }


        // 6 - Canvia aquest bucle for per un recorregut forEach i amb lambda
        System.out.println("\n5");
        for(Map.Entry entry : mapPersones.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 7 - treu un llistat de persones DONA amb lambda i stream
        System.out.println("\n7 DONES");

        // 8 - treu un llistat dels dos HOMES més joves (stream)
        System.out.println("\n8 HOMES + JOVES");

        // 9- Esborrar de la llistaPersones les persones entre 30 i 40 anys (lambda)
        System.out.println("\n9");

        // 10 - treu un llistat de les persones que tinguin una 'a' al seu nom
        System.out.println("\n10 Amb una 'A'");

        //11 - treu un llistat amb dos dies després de les dates de naixament de les persones
        System.out.println("\n11 - dates amb dos dies més");


        //12 - Rejovenir(modificar) dos anys a totes les persones
        System.out.println("\n12 - Rejovenir dos anys a totes les persones");
       ;

        //13. A partir de la següent llista de noms d'alumnes crea una nova llista d'alumnes amb aquest alumnes nous
        // pots modificar la classe alumne si cal.
        List<String> alumnesNous = Arrays.asList("Pedro","Pablo","Bilma");

        //14. Amb un stream, mostra les persones nascudes abans de l'any 1980.
        // Utilitza una referència a mètode per mostrar cada persona.
        System.out.println("\n14 - Persones nascudes abans de 1980");

        //15. Crea i mostra una llista de noms de les persones, ordenada alfabèticament.
        // Fes servir map i referències a mètodes.
        System.out.println("\n15 - Noms ordenats");

        //16. Amb un stream, mostra les edats de les persones que tenen un nom de més de cinc lletres.
        // Utilitza una referència a mètode per mostrar cada edat.
        System.out.println("\n16 - Edats de persones amb noms llargs");

        //17. Mostra els noms de les dones en majúscules.
        // Resol-ho amb filter, map i una referència a mètode.
        System.out.println("\n17 - Noms de les dones en majúscules");

        //18. Compta quantes persones van néixer al novembre utilitzant un stream.
        System.out.println("\n18 - Persones nascudes al novembre");

        //19. Troba i mostra la persona més jove amb min i Comparator.comparingInt.
        // Fes servir una referència a mètode sempre que sigui possible.
        System.out.println("\n19 - Persona més jove");

        //20. Converteix alumnesNous en una llista d'objectes Alumne amb un stream
        // i Alumne::new, ordena'ls pel nom i mostra'ls amb una referència a mètode.
        System.out.println("\n20 - Alumnes ordenats pel nom");

        //21. A partir d'aquesta llista de marques, crea una llista de Cotxe
        // fent servir un stream i la referència al constructor Cotxe::new.
        // Mostra els cotxes amb una referència a mètode.
        List<String> marquesCotxes = Arrays.asList("Seat", "Toyota", "Ford", "Tesla");
        System.out.println("\n21 - Crear cotxes a partir de marques");

        //22. Assigna a les primeres persones de llistaPersones els Cotxe creats
        // a l'exercici anterior. Fes l'assignació amb un stream i una lambda,
        // i mostra després les marques dels cotxes assignats.
        System.out.println("\n22 - Assignar cotxes a les persones");

    }


}
