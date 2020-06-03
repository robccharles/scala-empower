def gcd (x: Integer, y: Integer): Integer =  if (x==y)  x else if (x > y) gcd((x-y), y) else gcd ((y-x), x)
def make_rat(n: Int, d: Int) = n::d::Nil
def numer(x: List[Int]):Int = x.head
def denom(x: List[Int]):Int = x.tail.head
// function add
def add_rat(x: List[Int], y: List[Int]): List[Int] = make_rat ((numer (x)* denom(y)+ numer( y) * denom ( x)),  denom (x)*denom (y)  )
def print_rat(x: List[Int]) = println(" "+numer(x)/gcd(numer(x),denom(x))+"\n---\n "+denom(x)/gcd(numer(x),denom(x)))
def sub_rat(x: List[Int], y: List[Int]): List[Int] = make_rat ((numer (x)* denom(y)- numer( y) * denom ( x)),  denom (x)*denom (y))
def mul_rat(x: List[Int], y: List[Int]): List[Int] = make_rat (numer (x)* numer( y) ,  denom (x)*denom (y)  )
def div_rat(x: List[Int], y: List[Int]): List[Int] = make_rat (numer (x)* denom( y) ,  denom (x)*numer (y)  )
def equal_rat(x: List[Int], y: List[Int]) = if (  numer (x)* denom( y) ==  denom (x)*numer (y)  ) true else false
