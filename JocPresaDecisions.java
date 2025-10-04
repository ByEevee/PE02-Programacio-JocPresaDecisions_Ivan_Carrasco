import java.util.Scanner;

public class JocPresaDecisions {
    public static void main(String[] args) {
        //declaració de variables
        boolean basto,montanya,bosc,cant,ermita,pont,forja,pacte;
        Scanner esc = new Scanner(System.in);
        
        //inici del programa
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("JOC DE PRESA DE DECISIONS - RESCAT DEL GERMÀ");
        System.out.println("");
        System.out.println("FET PER - IVAN CARRASCO");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("(!) Ets un mag del 1456 en un món de fantasía i estàs a la plaça del teu poble quan arriba un missatger dient-he:");
        System.out.println("");
        System.out.println("(-) El teu GERMÀ l han segrestat un domador de dracs que estan amagats a la cova de cristalls màgics: ");
        System.out.println("(-) Si vols salvar-lo hauràs d'anar fins a la cova de cristalls màgics. ");

        System.out.println("");
        System.out.println("(~) Et quedes en shock però has de decidir si agafar el bastó màgic o marxar correns per arribar el més aviat possible a la cova.");
        System.out.println("");
        System.out.println("(?) Vols agafar el bastó màgic? ");
        System.out.println("    si=>true/no=>false");
        basto = esc.nextBoolean();

        if (basto) // si escull basto
        {   
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("");
            System.out.println("(~) Has agafat el bastó màgic i et dirigeixes cap a la cova de cristalls màgics, ");
            System.out.println("    Però el camí es bifurca i penses que seria millor anar a la montanya (RÀPID) o anar a prepararse al poble del costat..."); 
            System.out.println("");
            System.out.println("(?) Vols anar al bosc? ");
            System.out.println("    si=>true/no=>false");
            System.out.println("(#) true = anar a la muntanya / false = anar al poble");
            montanya = esc.nextBoolean();
            
            if (montanya) // si escull montanya
            {
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("");
            System.out.println("(~) Has decidit anar per la muntanya i de sobte pel camí veus un bosc i per l'altera banda una senda de penyasegats. ");
            System.out.println("");
            System.out.println("(?) Vols anar al bosc? ");
            System.out.println("    si=>true/no=>false");
            System.out.println("(#) true = anar al bosc / false = anar per la senda dels penyasegats");
            bosc = esc.nextBoolean();
                if (bosc) // si escull bosc 
            {   
                System.out.println("");
                System.out.println("--------------------------------------------------");
                System.out.println("");
                System.out.println("(~) Has decidit anar al bosc i de sobte pel camí veus una llum deslumbrant que es la sortida i la entrada a la cova però sents un cant");
                System.out.println("(?) Investigues d'on ve el cant? ");
                System.out.println("    si=>true/no=>false");
                System.out.println("(#) true = investigar el cant / false = anar a la llum");
                cant = esc.nextBoolean();
                if (cant) {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit investigar el cant, resultava no ser res però una druida del bosc et veu amb el bastó i et dona un talismà i et guia per una entrada secreta");
                    System.out.println("(º) ENTRES PER L'ENTRADA SECRETA I T'ENPORTES EL TEU GERMÀ A AMAGADES SENSE QUE ES DONI COMPTE EL DOMADOR NI EL DRAC");
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL RESCAT DISCRET");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                } 
                else // si no escull investigar cant
                {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(º) Has decidit no investigar el cant i anar cap a la cova i et trobes de cara al drac i el domador y no et queda d'altre que enfrentarte al domador i el seu drac.");
                    System.out.println("    Però acabes guanyant i alliberes al teu germà.");
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL HERÒIC");
                    System.out.println("--------------------------------------------------");
                    
            }
            
                }
                else // si no escull bosc
                {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar per la senda dels penyasegats i et trobes amb dos camins un amb un pont que creua l'abisme i l'altre un caminet molt estret que voreja el penyasegat");
                    System.out.println("(?) Vols creuar el pont?");
                    System.out.println("");
                    System.out.println("    si=>true/no=>false");
                    System.out.println("(#) true = creuar el pont / false = anar pel caminet estret");
                    pont = esc.nextBoolean();
                    
                    if (pont) {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(~) Has decidit creuar el pont vell, per sort tens el bastó i el pont no es trenca i arribes a l altre banda on hi ha una entrada secreta a la cova");
                        System.out.println("(º) ENTRES PER L'ENTRADA SECRETA I T'ENPORTES EL TEU GERMÀ A AMAGADES SENSE QUE ES DONI COMPTE EL DOMADOR NI EL DRAC");
                        System.out.println("--------------------------------------------------");
                        System.out.println("FI");
                        System.out.println("");
                        System.out.println("FINAL RESCAT DISCRET");
                        System.out.println("--------------------------------------------------");
                    }
                    else {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(~) Has decidit anar pel caminet estret i et trobes una runa molt antiga que te un gran valor, veus la cova al final del camí. ");
                        System.out.println("    Et trobes de cara amb el domador y et veu la runa i la identifica inmediatament, et dona l'opcio de donar-li la runa a cambi del teu germà.");
                        System.out.println("(?) Acceptes el pacte?");
                        System.out.println("    si=>true/no=>false");
                        pacte = esc.nextBoolean();
                        if (pacte) {
                            System.out.println("");
                            System.out.println("--------------------------------------------------");
                            System.out.println("");
                            System.out.println("(º) Has decidit acceptar el pacte i li dones la runa a canvi del teu germà, i marxeu cap al poble.");
                            System.out.println("--------------------------------------------------");
                            System.out.println("FI");
                            System.out.println("");
                            System.out.println("FINAL NEGOCIADOR");
                            System.out.println("--------------------------------------------------");
                   
                        }
                        else {
                            System.out.println("");
                            System.out.println("--------------------------------------------------");
                            System.out.println("");
                            System.out.println("(º) Has decidit no acceptar el pacte i t'enfrontes al domador i el seu drac, per sort tens el bastó i guanyes l'enfrontament.");
                            System.out.println("    Alliberes al teu germà i marxeu cap al poble.");
                            System.out.println("--------------------------------------------------");
                            System.out.println("FI");
                            System.out.println("");
                            System.out.println("FINAL HERÒIC");
                            System.out.println("--------------------------------------------------");
                        }
                        
                    }
            
                }
            } 
            else  // si no escull montanya i escull poble
            {
                System.out.println("");
                System.out.println("--------------------------------------------------");
                System.out.println("");
                System.out.println("(~) Has decidit anar al poble a preparar-te i penses que podries anar al ermità a que t'ajudi amb el poder del bastó o anar a la forja del poble a que et preparin per si de cas t'enfrontes al domador i el seu drac.");
                System.out.println("(?) Vols entrar a l'ermita? ");
                System.out.println("    si=>true/no=>false");
                System.out.println("(#) true = anar al ermita / false = anar a la forja");

                ermita = esc.nextBoolean();
                if (ermita) {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar a l'ermita, i et dona una gemma que et potència la màgia i et guia per un camí segur fins a la cova");
                    System.out.println("    Entres per la entrada de la cova i et trobes de cara amb el domador y et veu la gemma i la identifica inmediatament, et dona l'opcio de donar-li la gemma a canvi del teu germà.");
                    System.out.println("(?) Acceptes el pacte?");
                    System.out.println("    si=>true / no=>false");
                    pacte = esc.nextBoolean();
                    if (pacte) {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(º) Has decidit acceptar el pacte i li dones la gemma a canvi del teu germà, i marxeu cap al poble.");
                        System.out.println("--------------------------------------------------");
                        System.out.println("FI");
                        System.out.println("");
                        System.out.println("FINAL NEGOCIADOR");
                        System.out.println("--------------------------------------------------");
                    }
                    else {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(º) Has decidit no acceptar el pacte i t'enfrontes al domador i el seu drac, per sort tens el bastó i la gemma potenciedora del basto i guanyes l'enfrontament en un vist i no vist.");
                        System.out.println("    Alliberes al teu germà i marxeu cap al poble.");
                        System.out.println("--------------------------------------------------");
                        System.out.println("FI");
                        System.out.println("");
                        System.out.println("FINAL HERÒIC");
                        System.out.println("--------------------------------------------------");
                    }
                }
                else {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("Has decidit anar a la forja i et dona una armadura per si de cas t'enfrontes al domador i el seu drac junt amb el camí per arribar a la cova");
                    System.out.println("Entres per la entrada de la cova i et trobes de cara amb el domador i haurás de batallar per recuperar al teu germà.");
                    System.out.println("Però per sort tens el bastó i l'armadura i guanyes l'enfrontament en un vist i no vist.");
                    System.out.println("Alliberes al teu germà i marxeu cap al poble.");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL HERÒIC");
                    System.out.println("--------------------------------------------------"); 
                }
                
            }
    

    }
    else // si no escull basto
    {       
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("");
            System.out.println("(~) Has decidit no agafar el bastó i anar correns cap a la cova de cristalls màgics, però el camí es bifurca i penses que seria millor anar per la muntanya (RÀPID) o anar al poble del costat a preparar-se? ");
            System.out.println("(?) Vols anar per la muntanya? ");
            System.out.println("    si=>true / no=>false");
            System.out.println("(#) true = anar a la montanya / false = anar al poble");
            montanya = esc.nextBoolean();

            if (montanya) // si escull montanya
            {
                System.out.println("");
                System.out.println("--------------------------------------------------");
                System.out.println("");
                System.out.println("(~) Has decidit anar per la muntanya i de sobte pel camí veus un bosc i per l'altera banda una senda de penyasegats. ");
                System.out.println("");
                System.out.println("(?) Vols anar al bosc? ");
                System.out.println("    si=>true/no=>false");
                System.out.println("(#) true = anar al bosc / false = anar per la senda dels penyasegats");
                bosc = esc.nextBoolean();

                if (bosc) {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar al bosc i de sobte pel camí veus una llum deslumbrant que es la sortida i la entrada a la cova però sents un cant");
                    System.out.println("(?) Investigues d'on ve el cant? ");
                    System.out.println("    si=>true/no=>false");
                    System.out.println("(#) true = investigar el cant / false = anar a la llum");
                    cant = esc.nextBoolean();

                     if (cant) {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit investigar el cant, resultava no ser res, et perds per el bosc i acabes arribant tard ");
                    System.out.println("(º) Has arribat tard el teu germà a mort");
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL TRÀGIC");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                } 
                else // si no escull investigar cant
                {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit no investigar el cant i anar cap a la cova i et trobes de cara al drac i el domador y no et queda d'altre que enfrentarte al domador i el seu drac.");
                    System.out.println("(º) però acabes perdent perque no tens res per defensar-te.");
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL HERÒIC");
                    System.out.println("--------------------------------------------------");
                }
                }
                
                else // si no escull anar al bosc sinó als penyasegats
                {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar per la senda dels penyasegats i et trobes amb dos camins un amb un pont que creua l'abisme i l'altre un caminet molt estret que voreja el penyasegat");
                    System.out.println("(?) Vols creuar el pont?");
                    System.out.println("");
                    System.out.println("    si=>true/no=>false");
                    System.out.println("(#) true = creuar el pont / false = anar pel caminet estret");
                    pont = esc.nextBoolean();
                    
                    if (pont) {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(~) Has decidit creuar el pont vell, però el pont es trenca i caus al abisme");
                        System.out.println("(º) Has mort de caiguda");
                        System.out.println("--------------------------------------------------");
                        System.out.println("FI");
                        System.out.println("");
                        System.out.println("FINAL TRÀGIC");
                        System.out.println("--------------------------------------------------");
                    }
                    else {
                        System.out.println("");
                        System.out.println("--------------------------------------------------");
                        System.out.println("");
                        System.out.println("(~) Has decidit anar pel caminet estret i et trobes una runa molt antiga que te un gran valor, veus la cova al final del camí. ");
                        System.out.println("    Et trobes de cara amb el domador y et veu la runa i la identifica inmediatament, et dona l'opcio de donar-li la runa a cambi del teu germà.");
                        System.out.println("(?) Acceptes el pacte?");
                        System.out.println("    si=>true/no=>false");
                        pacte = esc.nextBoolean();
                        if (pacte) {
                            System.out.println("");
                            System.out.println("--------------------------------------------------");
                            System.out.println("");
                            System.out.println("(º) Has decidit acceptar el pacte i li dones la runa a canvi del teu germà, i marxeu cap al poble.");
                            System.out.println("--------------------------------------------------");
                            System.out.println("FI");
                            System.out.println("");
                            System.out.println("FINAL NEGOCIADOR");
                            System.out.println("--------------------------------------------------");
                   
                        }
                        else {
                            System.out.println("");
                            System.out.println("--------------------------------------------------");
                            System.out.println("");
                            System.out.println("(º) Has decidit no acceptar el pacte i t'enfrontes al domador i el seu drac, però com no tens bastó acabes abrassat amb el foc del drac juntament amb el teu germà.");
                            System.out.println("--------------------------------------------------");
                            System.out.println("FI");
                            System.out.println("");
                            System.out.println("FINAL TRÀGIC");
                            System.out.println("--------------------------------------------------");
            
                            }
          
    

                        }
                    }
                }
            else // si no escull montanya i escull poble
            {
                System.out.println("");
                System.out.println("--------------------------------------------------");
                System.out.println("");
                System.out.println("Has decidit anar al poble a preparar-te i penses que podries anar al ermità a que t'ajudi o anar a la forja del poble a que et preparin per si de cas t'enfrontes al domador i el seu drac.");
                System.out.println("Vols entrar a l'ermita? (si=true/no=false)");
                ermita = esc.nextBoolean();

                if (ermita) {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar a l'ermita, però com no portes el bastó no et pot ajudar i et guia per un camí segur fins a la cova");
                    System.out.println("Entres a la cova.");
                    System.out.println("(º) PERO NO TENS RES PER DEFENSARTE I ET TROBES DE CARA AMB EL DOMADOR I EL SEU DRAC I ACABES ABRASSAT PEL FOC DEL DRAC JUNTAMENT AMB EL TEU GERMÀ.");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL TRÀGIC");
                    System.out.println("--------------------------------------------------");
                }
                else {
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("(~) Has decidit anar a la forja i et dona una armadura i una espasa incleíble per si de cas t'enfrontes al domador i el seu drac junt amb el camí per arribar a la cova");
                    System.out.println("    Entres a la cova.");
                    System.out.println("(º) T ENFRONTES AL DOMADOR I EL SEU DRAC ACABES GUANYANT PERÒ FERIT, ENCARA QUE ET DONA PER ALLIBERAR AL TEU GERMÀ I MARXEU CAP AL POBLE.");
                    System.out.println("--------------------------------------------------");
                    System.out.println("FI");
                    System.out.println("");
                    System.out.println("FINAL HERÒIC");
                    System.out.println("--------------------------------------------------");
                    
                }
                
            }
            
    }
    }
 }
