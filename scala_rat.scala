def gcd (x: Integer, y: Integer): Integer =  if (x==y)  x else if (x > y) gcd((x-y), y) else gcd ((y-x), x)
def make_rat(n: Int, d: Int) = n::d::Nil
def numer(x: List[Int]):Int = x.head
def denom(x: List[Int]):Int = x.tail.head
// function add
def add_rat(x: List[Int], y: List[Int]): List[Int] = make_rat ((numer (x)* denom(y)+ numer( y) * denom ( x)),  denom (x)*denom (y)  )