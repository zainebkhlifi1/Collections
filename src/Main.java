

import java.util.*;

        public class Main {
            public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add("hi");
//        arrayList.add("hello");
//        arrayList.add("hola");
//        arrayList.add("buenos dias ");
//        arrayList.add(10);
//        arrayList.add(4.6);
//        System.out.println(arrayList);  // afficher  la liste
//        System.out.println(arrayList.size()); // retourner la  taille
//        System.out.println(arrayList.get(1)); // ArrayList(ordonne( 3ana indice )) // retourne object avec cet indice
//        System.out.println(arrayList.contains(""));// return true or false ( recherche d'objet )
//        System.out.println(arrayList.remove(2));// efacer l'element avec ce indice => return object
//        System.out.println(arrayList.remove((Integer)55));// efacer l'object  => return boolean
//        System.out.println(arrayList);

                ArrayList personneList = new ArrayList();
                Personne p1 = new Personne(1, 24, "zaineb", "khlifi");
                Personne p2 = new Personne(2, 24, "Loukil", "fares");
                Personne p3 = new Personne(3, 22, "benaissa", "fares");
                personneList.add(p1);
                personneList.add(p2);
                personneList.add(p3);
                personneList.add(p1);
                System.out.println(personneList);
                // affichier tous le objets de personneList
                for (Object p : personneList) {
                    System.out.println(p);
                }
                System.out.println("----");
                //     afficher tous le nom  de personneList
                for (Object p : personneList) {
                    if (p instanceof Personne) {
                        Personne per = (Personne) p;
                        System.out.println(per.getNom());
                    }

                }
                // par indice
                for (int i = 0; i < personneList.size(); i++) {
                    System.out.println(personneList.get(i));

                }
                System.out.println(personneList.contains(new Personne(2, 24, "Loukil", "fares")));
                // compares memory address

                // cree une list de Integer et faite le tri croi et dec
                ArrayList<Integer> integerList = new ArrayList<Integer>();
                integerList.add(5);
                integerList.add(2);
                integerList.add(8);
                Collections.sort(integerList);
                System.out.println(integerList);
                Collections.sort(integerList,Collections.reverseOrder());
                System.out.println(integerList);
                // cree une list de String et faite le tri croi et dec
                ArrayList<String> StringList = new ArrayList<String>();
                StringList.add("a");
                StringList.add("c");
                StringList.add("b");
                Collections.sort(StringList);
                System.out.println(StringList);
                Collections.sort(StringList,Collections.reverseOrder());
                System.out.println(StringList);
                // trier la liste de personne
                Collections.sort(personneList);
                System.out.println(personneList);
                Collections.sort(personneList,Collections.reverseOrder());
                System.out.println(personneList);


            }
        }