//Question 1 ,2
var k, i, j = 2
var m, n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

//-------------------------------------------------------------------

//Question 3

k + 12 * m
m / j
n % j
m / j * j
f + 10 * 5 + g
i = i + 1
i * n

//------------------------------------------------------------------
//(b)

var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f

b = b - 1
println(b * a + c * d)
d = d - 1

println(a)
a = a + 1

println(-2 * (g - k) + c)

println(c)
c = c + 1

c = c + 1
println(c * a)
a = a + 1

//-----------------------------------------------------------------

//Question 4
// (a)


def IsTrue(workingH: Int, otH: Int): Boolean = workingH > 40 && otH > 30
def TotalSalary(workingH: Int, otH: Int): Float = (workingH * 250.00f) + (otH * 85.00f)
def Tax(totalSalary: Float): Float = totalSalary * 0.12f
def TakeHomeSalary(totalSalary: Float, tax: Float) : Float = totalSalary - tax

def CalculateSalary(workingH: Int, otH: Int) : Float = if (IsTrue(workingH, otH)) {
  val totalSalary = TotalSalary(workingH, otH)
  val tax = Tax(totalSalary)
  TakeHomeSalary(totalSalary, tax)
} else {
  println("No pay\n")
  0.0f
}

CalculateSalary(60,60)


//Question 4
// (b)



def attendees(priceChange: Int): Int = 120 + (15-priceChange)/5*20
def revenue(attendees: Int, ticketPrice: Float): Float = ticketPrice * attendees
def cost(attendees: Int): Float = 500.00f + (3.00f * attendees)
def profit(revenue: Float, cost: Float): Float = revenue - cost


def FindBestPrice(priceIncrease: Int, priceDecrease: Int): Unit = {
  val atten1 = attendees(priceDecrease)
  val rev1 = revenue(atten1, priceDecrease)
  val cost1 = cost(atten1)
  val prof1 = profit(rev1, cost1)


  val atten2 = attendees(priceIncrease)
  val rev2 = revenue(atten2, priceIncrease)
  val cost2 = cost(atten2)
  val prof2 = profit(rev2, cost2)

  if (prof1 > prof2) println("Best ticket price is : 10") else println("Best ticket price is : 20")
}


FindBestPrice(10, 20)
