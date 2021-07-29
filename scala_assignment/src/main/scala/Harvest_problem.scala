class ArrayExample {

  printf("\n*****The harvest statistics problem*****\n\n")
  // Creating multidimensional array
  var arr: Array[Array[Int]] = Array.ofDim[Int](4, 7)

  // Assigning value
  //Assume that a month have 28 days only.
  arr(0)(0) = 45;  arr(0)(1) = 56;  arr(0)(2) = 32;  arr(0)(3) = 70;  arr(0)(4) = 21;  arr(0)(5) = 11;  arr(0)(6) = 60
  arr(1)(0) = 83;  arr(1)(1) = 64;  arr(1)(2) = 59;  arr(1)(3) = 45;  arr(1)(4) = 98;  arr(1)(5) = 79;  arr(1)(6) = 37
  arr(2)(0) = 20;  arr(2)(1) = 15;  arr(2)(2) = 31;  arr(2)(3) = 62;  arr(2)(4) = 31;  arr(2)(5) = 44;  arr(2)(6) = 57
  arr(3)(0) = 23;  arr(3)(1) = 10;  arr(3)(2) = 55;  arr(3)(3) = 50;  arr(3)(4) = 61;  arr(3)(5) = 43;  arr(3)(6) = 49

  //print the 2D array
  println("The harvest reservation diary is =>")
  for (i <- 0 to 3) {
    for (j <- 0 to 6) {
      print(" " + arr(i)(j))
    }
    println()
  }

  // related functions
  def display(): Unit = {

    //find the max
    var max = 0
    var x=0
    var y=0
    for (i <- 0 to 3) {
      for (j <- 0 to 6) {
        if (arr(i)(j) >= max) {
          max = arr(i)(j)
          x=i
          y=j
        }
      }

    }

    //find the day
    var day ="nothing"
    if(y+1==1)
      day="Monday"
    else if(y+1==2)
      day="Tuesday"
    else if(y+1==3)
      day="Wednesday"
    else if(y+1==4)
      day="Thursday"
    else if(y+1==5)
      day="Friday"
    else if(y+1==6)
      day="Saturday"
    else if(y+1==4)
      day="Sunday"

    println()
    printf("The maximum of the month is : %dKg\n" ,max)
    printf("%d week %d day (%s)\n", x+1,y+1,day)
    printf("The date of the month that maximum occurs is : %d of the month\n",x*7+y+1)
    println()

    //find the minimum
    var min = max
    var q=0
    var w=0
    for (a <- 0 to 3) {
      for (b<- 0 to 6) {
        if (arr(a)(b) <= min) {
          min = arr(a)(b)
          q=a
          w=b
        }
      }

    }

    //find the day
    if(w+1==1)
      day="Monday"
    else if(w+1==2)
      day="Tuesday"
    else if(w+1==3)
      day="Wednesday"
    else if(w+1==4)
      day="Thursday"
    else if(w+1==5)
      day="Friday"
    else if(w+1==6)
      day="Saturday"
    else if(w+1==4)
      day="Sunday"


    printf("The minimum of the month is : %dKg\n" ,min)
    printf("%d week %d day (%s)\n", q+1,w+1,day)
    printf("The date of the month that maximum occurs is : %d of the month\n",q*7+w+1)
    println()

    //find the range
    val range = max-min
    printf("The Range between maximum and the minimum is : %dKg\n",range)
    println()

    //find the average
    var sum=0
    for (i <- 0 to 3) {
      for (j <- 0 to 6) {
        sum=sum+arr(i)(j)
      }
    }
    printf("The total harvest amount of the month is : %dKg\n",sum)

    val avg = sum / 28.0
    printf("The average harvest amount of a day is : %fKg",avg)
    println()

    //find the medium
    val set = new Array[Int](28)       //make 2d array into 1D array
    var z=0
    for (i <- 0 to 3) {
      for (j <- 0 to 6) {
        set(z) = arr(i)(j)
        z=z+1
      }
    }

    val sortedset = set.sorted                //sort the array
    printf("\nThe sorted order of harvest amount =>\n")
    for(d<-0 to 27){
      printf(" %d ",sortedset(d))
    }

    var median = 0 //find the medium of sorted array
    val len = 28

    if(len%2==1){
      median = sortedset((len+1)/2-1)
    }
    else{
      median=(sortedset(len/2-1)+sortedset(len/2))/2
    }

    printf("\nThe median of the harvest amount is : %d\n",median)

  }


}

object Harvest_problem extends App{

  var x = new ArrayExample()
  x.display()
}
