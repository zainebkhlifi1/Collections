public class Personne  implements Comparable<Personne>{

        private int id ;
        private int age ;
        private String nom ;
        private String prenom ;

        public Personne(int id, int age, String nom, String prenom) {
            this.id = id;
            this.age = age;
            this.nom = nom;
            this.prenom = prenom;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        @Override
        public String toString() {
            return "Personne{" +
                    "id=" + id +
                    ", age=" + age +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Personne autrePersonne) {
            return Integer.compare(this.id, autrePersonne.getId());
        }
    }

