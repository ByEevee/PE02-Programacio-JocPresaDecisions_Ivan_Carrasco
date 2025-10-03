import java.util.Scanner;

public class JocPresaDecisions {
    public static void main(String[] args) {
        //declaració de variables
        boolean basto,montanya,bosc,cant,hermita,pont,forja,pacte;
        Scanner esc = new Scanner(System.in);
        
        //inici del programa
        System.out.println("Benvingut al RESCAT DEL GERMÀ ");
        System.out.println("Ets un mag del 1456 en un món de fantasía i estàs a la plaça del teu poble quan arriba un missatger dient-he:");
        System.out.println(" -El teu GERMÀ l han segrestat un domador de dracs que estan amagats a la cova de cristalls màgics: ");
        System.out.println(" -Si vols salvar-lo hauràs d'anar fins a la cova de cristalls màgics. ");

        System.out.println("Et quedes en shock però has de decidir si agafar el baso màgic o marxar correns per arribar el més aviat possible a la cova.");
        System.out.println("Vols agafar el bastó màgic? (si=true/no=false)");
        basto = esc.nextBoolean();

        if (basto) // si escull basto
        {
            System.out.println("Has agafat el bastó màgic i et dirigeixes cap a la cova de cristalls màgics, però el camí es bifurca i penses que seria millor anar a la montanya (RÀPID) o anar a prepararse al poble del costat?. ");
            System.out.println("Vols anar al bosc? (si=true/no=false)");
            montanya = esc.nextBoolean();
            
            if (montanya) // si escull montanya
            {

            System.out.println("Has decidit anar per la muntanya i de sobte pel camí veus un bosc i per l'altera banda una senda de penyasegats. ");
            System.out.println("Vols anar al bosc? (si=true/no=false)");
            bosc = esc.nextBoolean();
                if (bosc) // si escull bosc 
            {
                System.out.println("Has decidit anar al bosc i de sobte pel camí veus una llum deslumbrant que es la sortida i la entrada a la cova però sents un cant");
                System.out.println("Investigues d'on ve el cant? (si=true/no=false)");
                cant = esc.nextBoolean();
                if (cant) {
                    System.out.println(" Has decidit investigar el cant, resultava no ser res però una druida del bosc et veu amb el bastó i et dona un talismà i et guia per una entrada secreta");
                    System.out.println("ENTRES PER L'ENTRADA SECRETA I T'ENPORTES EL TEU GERMÀ A AMAGADES SENSE QUE ES DONI COMPTE EL DOMADOR NI EL DRAC");
                    System.out.println("FI");
                    System.out.println("FINAL RESCAT DISCRET");
                } 
                else // si no escull investigar cant
                {
                    System.out.println("Has decidit no investigar el cant i anar cap a la cova i et trobes de cara al drac i el domador y no et queda d'altre que enfrentarte al domador i el seu drac.");
                    System.out.println("Però acabes guanyant i alliberes al teu germà.");
                    System.out.println("FI");
                    System.out.println("FINAL HERÒIC");
                    
            }
            
                }
                else // si no escull bosc
                {
                    System.out.println("Has decidit anar per la senda dels penyasegats i et trobes amb dos camins un amb un pont que creua l'abisme i l'altre un caminet molt estret que voreja el penyasegat");
                    System.out.println("Vols creuar el pont? (si=true/no=false)");
                    pont = esc.nextBoolean();
                    if (pont) {
                        System.out.println("Has decidit creuar el pont vell, per sort tens el bastó i el pont no es trenca i arribes a l altre banda on hi ha una entrada secreta a la cova");
                        System.out.println("ENTRES PER L'ENTRADA SECRETA I T'ENPORTES EL TEU GERMÀ A AMAGADES SENSE QUE ES DONI COMPTE EL DOMADOR NI EL DRAC");
                        System.out.println("FI");
                        System.out.println("FINAL RESCAT DISCRET");
                    }
                    else {
                        System.out.println("Has decidit anar pel caminet estret i et trobes una runa molt antiga que te un gran valor, veus la cova al final del camí. ");
                        System.out.println("Et trobes de cara amb el domador y et veu la runa i la identifica inmediatament, et dona l'opcio de donar-li la runa a cambi del teu germà.");
                        System.out.println("Acceptes el pacte? (si=true/no=false)");
                        pacte = esc.nextBoolean();
                        if (pacte) {
                            System.out.println("Has decidit acceptar el pacte i li dones la runa a canvi del teu germà, i marxeu cap al poble.");
                            System.out.println("FI");
                            System.out.println("FINAL NEGOCIADOR");
                        }
                        else {
                            System.out.println("Has decidit no acceptar el pacte i t'enfrontes al domador i el seu drac, per sort tens el bastó i guanyes l'enfrontament.");
                            System.out.println("Alliberes al teu germà i marxeu cap al poble.");
                            System.out.println("FI");
                            System.out.println("FINAL HERÒIC");
                        }
                        
                    }
            
                }
            } 
            else  // si no escull montanya i escull poble
            {
                System.out.println("Has decidit anar al poble a preparar-te i de sobte pel camí veus una ermita i penses que podries anar al ermità a que t'ajudi amb el poder del bastó o anar a la forja del poble a que et preparin per si de cas t'enfrontes al domador i el seu drac.");
                System.out.println("Vols entrar a l'ermita? (si=true/no=false)");
                hermita = esc.nextBoolean();
                if (hermita) {
                    System.out.println("Has decidit anarr a l'ermita, i et dona una gemma que et potència la màgia i et guia per un camí segur fins a la cova");
                    System.out.println("Entres per la entrada de la cova i et trobes de cara amb el domador y et veu la gemma i la identifica inmediatament, et dona l'opcio de donar-li la gemma a canvi del teu germà.");
                    System.out.println("Acceptes el pacte? (si=true/no=false)");
                    pacte = esc.nextBoolean();
                    if (pacte) {
                        System.out.println("Has decidit acceptar el pacte i li dones la gemma a canvi del teu germà, i marxeu cap al poble.");
                        System.out.println("FI");
                        System.out.println("FINAL NEGOCIADOR");
                    }
                    else {
                        System.out.println("Has decidit no acceptar el pacte i t'enfrontes al domador i el seu drac, per sort tens el bastó i la gemma potenciedora del basto i guanyes l'enfrontament en un vist i no vist.");
                        System.out.println("Alliberes al teu germà i marxeu cap al poble.");
                        System.out.println("FI");
                        System.out.println("FINAL HERÒIC");
                    }
                }
                else {
                    System.out.println("Has decidit anar a la forja i et dona una armadura per si de cas t'enfrontes al domador i el seu drac junt amb el camí per arribar a la cova");
                    System.out.println("Entres per la entrada de la cova i et trobes de cara amb el domador i haurás de batallar per recuperar al teu germà.");
                    System.out.println("Però per sort tens el bastó i l'armadura i guanyes l'enfrontament en un vist i no vist.");
                    System.out.println("Alliberes al teu germà i marxeu cap al poble.");
                    System.out.println("FI");
                    System.out.println("FINAL HERÒIC");
                    
                }
                
            }
    

    }
    else // si no escull basto
    {
            System.out.println("Has decidit no agafar el bastó i anar correns cap a la cova de cristalls màgics, però el camí es bifurca i penses que seria millor anar per la muntanya (RÀPID) o anar al poble del costat a preparar-se? ");
            System.out.println("Vols anar per la muntanya? (si=true/no=false)");
            montanya = esc.nextBoolean();

            if (montanya) // si escull montanya
            {
                System.out.println("Has decidit anar a la montanya estás caminant pel bosc i et trobes amb una llum sortint de un camí pel bosc que es una possible sortida però també pel redera escoltes un cant");
                System.out.println("Vols investigar d'on ve el cant? (si=true/no=false)");
                cant = esc.nextBoolean();
                if (cant) {
                    System.out.println("Has decidit investigar el cant, resultava no ser res, arribes tard.");
                    System.out.println("EL TEU GERMÀ MOR PER ARRIBAR TARD");
                    System.out.println("FI");
                    System.out.println("FINAL TRÀGIC");
                } 
                else // si no escull investigar cant
                {
                    System.out.println("Has decidit no investigar el cant i anar cap a la cova i et trobes de cara al drac i el domador y no et queda d'altre que enfrentarte al domador i el seu drac.");
                    System.out.println("Però com que no portes el bastó ni res per defensar-te acabes abrassat per el foc del drac juntamanet amb el teu germà.");
                    System.out.println("FI");
                    System.out.println("FINAL TRÀGIC");
            
                }
          
    

            }
            else // si no escull montanya i escull poble
            {
                System.out.println("Has decidit anar al poble a preparar-te i de sobte pel camí veus una ermita i penses que podries anar al ermità a que t'ajudi o anar a la forja del poble a que et preparin per si de cas t'enfrontes al domador i el seu drac.");
                System.out.println("Vols entrar a l'ermita? (si=true/no=false)");
                hermita = esc.nextBoolean();
                if (hermita) {
                    System.out.println("Has decidit anar a l'ermita, però com no portes el bastó no et pot ajudar i et guia per un camí segur fins a la cova");
                    System.out.println("Entres a la cova.");
                    System.out.println("PERO NO TENS RES PER DEFENSARTE I ET TROBES DE CARA AMB EL DOMADOR I EL SEU DRAC I ACABES ABRASSAT PEL FOC DEL DRAC JUNTAMENT AMB EL TEU GERMÀ.");
                    System.out.println("FI");
                    System.out.println("FINAL TRÀGIC");
                }
                else {
                    System.out.println("Has decidit anar a la forja i et dona una armadura i una espasa incleíble per si de cas t'enfrontes al domador i el seu drac junt amb el camí per arribar a la cova");
                    System.out.println("Entres a la cova.");
                    System.out.println("T ENFRONTES AL DOMADOR I EL SEU DRAC ACABES GUANYANT PERÒ FERIT, ENCARA QUE ET DONA PER ALLIBERAR AL TEU GERMÀ I MARXEU CAP AL POBLE.");
                    System.out.println("FI");
                    System.out.println("FINAL HERÒIC");
                    
                }
                
            }
    }
 }
}