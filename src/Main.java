/**
 * Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi restituisca
 * il numero totale di secondi.
 * Sappiamo che un giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.
 */
        public class Main {
            public static void main(String[] args) {
                System.out.println("Calcolo totale secondi");

                //Creo un nuovo giorno passando i valori richiesti dal costruttore
                Counter giorno1= new Counter(56,25,54,15);
                //Mando i valori immessi sopra di giorni, ore, minuti e secondi a video
                System.out.println("Giorni:"+giorno1.giorni+" / Ore:"+giorno1.ore+ " / Minuti:"+giorno1.minuti+
                        " / Secondi:"+giorno1.secondi);

                //Restituisco il valore totale dei secondi contenuti in ogni campo: gironi, ore, minuti e secondi.
                System.out.println("Il valore totale dei secondi è: "+giorno1.totaleSecondi() + " secondi");

            }
        }
