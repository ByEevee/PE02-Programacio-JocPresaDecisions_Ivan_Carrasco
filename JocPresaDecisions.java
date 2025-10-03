import java.util.Scanner;

public class JocPresaDecisions {
    public static void main(String[] args) {
        //declaració de variables
        boolean basto,montanya,bosc,cant,hermita,forja,pacte;
        Scanner esc = new Scanner(System.in);
        
        //inici del programa
        System.out.println("Benvingut al RESCAT DEL GERMÀ ");
        System.out.println("Ets un mag del 1456 en un món de fantasía i estàs a la plaça del teu poble quan arriba un missatger dient-he:");
        System.out.println(" -El teu GERMÀ l han segrestat un domador de dracs que estan amagats a la cova de cristalls màgics: ");
        System.out.println(" -Si vols salvar-lo hauràs d'anar fins a la cova de cristalls màgics. ");

        System.out.println("Et quedes en shock però has de decidir si agafar el baso màgic o marxar correns per arribar lo més aviat possible a la cova.");
        System.out.println("Vols agafar el bastó màgic? (si=true/no=false)");
        basto = esc.nextBoolean();
        if (basto==true) {
            System.out.println("Has agafat el bastó màgic i et dirigeixes cap a la cova de cristalls màgics, però el camí es bifurca i penses que seria millor anar al bosc (RÀPID) o anar a prepararse al poble del costat?. ");
            System.out.println("Vols anar al bosc? (si=true/no=false)");
            bosc = esc.nextBoolean();
            if (bosc == true) {
                System.out.println("Has decidit anar al bosc i de sobte pel camí veus una llum deslumbrant que es la sortida i la entrada a la cova però sents un cant");
                System.out.println("Investigues d'on ve el cant? (si=true/no=false)");
                cant = esc.nextBoolean();
                if (cant==true) {
                    System.out.println(" Has decidit investigar el cant, resultava no ser res però una druida del bosc et veu amb el bastó i et dona un talismà i et guia per una entrada secreta");
                    System.out.println("ENTRES PER L'ENTRADA SECRETA I T'ENPORTES EL TEU GERMÀ A AMAGADES SENSE QUE ES DONI COMPTE EL DOMADOR NI EL DRAC");
                    System.out.println("FI");
                    System.out.println("FINAL RESCAT DISCRET");
                } 
                else if (cant==false) {
                    System.out.println("Has decidit no investigar el cant i anar cap a la cova i et trobes de cara al drac i el domador y no et queda d'altre que enfrentarte al domador i el seu drac.");
                    System.out.println("Però acabes guanyant i alliberes al teu germà.");
                    System.out.println("FI");
                    System.out.println("FINAL HERÒIC");
                    
                }
            
                }

    if (bosc == false) {
                System.out.println("Has decidit anar al poble a preparar-te i de sobte pel camí veus una ermita i penses que seria bona idea entrar-hi a demanar ajuda");
                System.out.println("Vols entrar a l'ermita? (si=true/no=false)");
                hermita = esc.nextBoolean();
                if (hermita==true) {
                    System.out.println("Has decidit anarr a l'ermita, i et dona una gemma que et potència la màgia i et guia per un camí segur fins a la cova");
                }
                else if (hermita==false) {
                    System.out.println("Has decidit anar a la forja i et dona una armadura per si de cas t'enfrontes al domador i el seu drac junt amb el camí per arribar a la cova");
                    
                }
                
            }
    

    }
    else if (basto == false) {
            System.out.println("Has decidit no agafar el bastó i anar correns cap a la cova de cristalls màgics, però el camí es bifurca i penses que seria millor anar per la muntanya (RÀPID) o anar al poble del costat a preparar-se?. ");
            System.out.println("Vols anar per la muntanya? (si=true/no=false)");
            montanya = esc.nextBoolean();
        }
        }   
    }

