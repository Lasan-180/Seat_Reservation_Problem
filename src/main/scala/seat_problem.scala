object seat_problem {

  import scala.io.StdIn.readInt

  println("***** The Airline Seat Reservation Problem *****\n")
  println("Our Airline start from point A and have 3 destinations called B,C and D")
  println("The airline seats before the reservation")

  // Creating multidimensional array
  var arr: Array[Array[Int]] = Array.ofDim[Int](4, 4)

  // Assigning value
  //Assume that our airline have 9 seats days only.
  for (a <- 0 to 2) {
    for (b <- 0 to 2) {
      arr(a)(b) = 0
    }
  }

  //check the seat is already reserved
  def check(x: Int): Unit = {
    if(arr(x / 10 - 1)(x % 10 - 1)==1){
      print("The seat is already reserved.Enter another seat : ")
      val r = readInt()
      arr(r / 10 - 1)(r % 10 - 1)=1
    }else{
      arr(x / 10 - 1)(x % 10 - 1)=1
    }

  }


  //get seat numbers of passengers
  def getdata(y: Int): Unit = {
    for(_ <- 1 to y){
      print("Enter seat number : ")
      val x = readInt()
      //arr(x / 10 - 1)(x % 10 - 1) = 1
      check(x)
    }

  }

  //display function
  def display(): Unit = {
    //print the 2D array
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + arr(i)(j))
      }
      println()
    }
  }

  //display seat numbers
  def seatno(): Unit = {
    //print the 2D array
    val t=10
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print((t*(i+1))+j+1+" ")
      }
      println()
    }
    println()
  }

  //update seats after the passengers left
  def update(x: Int): Unit = {

    for(_ <- 1 to x){
      print("Enter seat number : ")
      val y = readInt()
      arr(y / 10 - 1)(y % 10 - 1) = 0
    }
  }

  //main method
  def main(arg: Array[String]): Unit = {

    //functions calling
    display()
    println("Assume that the seat numbers are like below : ")
    seatno()

    print("Enter reserved no of seats at the point A : ")
    val z = readInt()
    getdata(z)
    println("After the seat reservation at point A : ")
    display()

    println("\nfly to the destination point B")
    print("Enter no of passengers left at point B :")
    val x = readInt()
    update(x)
    println("After updating passengers : ")
    display()
    print("Enter new reserved no of seats at the point B: ")
    val w = readInt()
    getdata(w)
    println("After the seat reservation at point B : ")
    display()

    println("\nfly to the destination point C")
    print("Enter no of passengers left at point C :")
    val k = readInt()
    update(k)
    println("After updating passengers : ")
    display()
    print("Enter new reserved no of seats at the point B: ")
    val p = readInt()
    getdata(p)
    println("After the seat reservation at point B : ")
    display()

    println("\nfly to the destination Final point D")


  }

}
