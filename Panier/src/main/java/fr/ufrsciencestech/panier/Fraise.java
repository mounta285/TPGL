package fr.ufrsciencestech.panier;






public class Fraise {
    private double prix;
    private String origine;

    Fraise( double prix, String origine){
    if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;  
    }
    public static void main(String[] args) {
        
    }

    public double getPrix(){
        return prix;
        }
    
        public void setPrix(double prix){
        this.prix=prix;
        }
    
        public String getOrigine(){
        return origine;
        }
     
        public void setOrigine(String origine){
        this.origine=origine;
        }
    
        @Override
        public String toString(){
            return "Fraise de " + origine + " a " + prix + " euros";
        }
    
        @Override
        public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
            if(o != null && getClass() == o.getClass()){
                Fraise or = (Fraise) o;
                return (prix == or.prix && origine.equals(or.origine));
            }
            return false;
        }
    
        public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
            return false;
        }


}