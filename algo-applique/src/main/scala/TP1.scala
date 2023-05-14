package algoapplique;
import scala.collection.mutable.ArrayBuffer;

object TP1{

    def estPremier(n: Int): Boolean = {
        for (div <- 2 until n){
            if (n % div == 0){
                return false
            }
        }
        // si on est ici, ca veut dire qu'on a: 
        //   - parcouru tous les nombres de 2 à n-1 et 
        //   - que n % div == 0 a toujours été faux
        // => conséquence n est divisble que par 1 et lui-meme
        return true
    }

    def getNombresPremiers(n: Int): ArrayBuffer[Int] = {
        // initialisation des variables pour l'algo
        var nombresPremiers: ArrayBuffer[Int] = ArrayBuffer();
        var nombreCourant = 2;

        // tant que le nombre de nombres premiers est plus petit que n on ajoute des nombres premiers
        while (nombresPremiers.length < n){
            if (estPremier(nombreCourant)){
                nombresPremiers += nombreCourant
            }
            nombreCourant += 1 // on prend le prochain nombre
        }

        // que vaut nombrePremiers ?  un tableau de n éléments, ces éléments sont des nombres premiers
        return nombresPremiers
    }

    /*
        Dans cet exercice vous devez écrire un algorithme pour la recherche des 𝑁 premiers couples de
        nombres premiers jumeaux.

        Définition : on dit que deux entiers 𝑝 et 𝑞 tels que 𝑝 < 𝑞 sont des nombres premiers jumeaux
        si et seulement si 𝑝 et 𝑞 sont des nombres premiers, et 𝑞 = 𝑝 + 2.

        Pré-condition : un nombre entier N
        Post-condition : 
            - un tableau contenant les N premiers couples de nombres premiers jumeaux
            - CONSEQUENCE : un élément du tableau est un couple [a, b] t.q.
                - a et b sont premiers -> on va utilise estPremier(a) && estPremier(b)
                - a et b sont jumeaux 
        

        Algorithme : 
            nombresJumeaux = tableau
            nombreCourant = 2

            tant que longueur de nombreJumeaux < n:
                jumeau = nombreCourant + 2
                si nombreCourant est premier et jumeau est premier :
                    tableau += [nombreCourant, jumeau]

            retourner tableau
    */

    def getNombreJumaux(n: Int): ArrayBuffer[Array[Int]] = {
        // initialiser nos variables
        var nombreJumeaux: ArrayBuffer[Array[Int]] = ArrayBuffer() // créer un tableau vide 
        var nombreCourant = 2
        while (nombreJumeaux.length < n){
            val jumeau = nombreCourant + 2 // 𝑞 = 𝑝 + 2
            if(estPremier(nombreCourant) && estPremier(jumeau)){ // il faut tester que nombreCourant ET jumeau sont premiers
                nombreJumeaux += Array(nombreCourant, jumeau)
            }
            nombreCourant += 1
        }

        // après notre boucle on a un tableau contenant n nombresJumeaux
        return nombreJumeaux

    }

    /*
        réecrire getNombrePremiers(n: Int): ArrayBuffer[Int]
        Ecrivez un algorithme en Scala pour la recherche des 𝑁 premiers nombres premiers
    */
    def getNombreP(n: Int):ArrayBuffer[Int] = {
        // initialiser
        var nombrePremier: ArrayBuffer[Int] = ArrayBuffer()
        var nombreCourant = 2

        // tant que le nombre de nombres premiers est plus petit que n
        while (nombrePremier.length < n){
            // si nombreCourant est premier
            if (estPremier(nombreCourant)){
                nombrePremier += nombreCourant
            }
            
        }
        // après la boucle while, nombrePremier contient n nombre premiers
        return nombrePremier
    }
    
}
