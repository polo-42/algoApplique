package algoapplique;

object Main extends App {
  println("DEBUT ALGORITHME\n\n")
  println(TP1.getNombresPremiers(6).mkString(" "))
  TP1.getNombreJumaux(3).foreach(couple => print(couple.mkString(" ")+","))
  println("\nFIN ALGORITHME")
}