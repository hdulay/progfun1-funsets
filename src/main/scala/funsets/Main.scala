package funsets

object Main extends App {
  import FunSets._

  printSet(singletonSet(2))
  println(contains(singletonSet(1), 1))
  printSet(union(singletonSet(1), singletonSet(2)))
  println(contains(union(singletonSet(1), singletonSet(2)), 2))

  println(forall(union(singletonSet(1), singletonSet(2)), (i: Int) => {
    println(i)
    true
  }))
}
