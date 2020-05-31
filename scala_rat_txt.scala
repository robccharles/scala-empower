Notes of Scala 

scala> def add_rat(x: List[Integer], y: List[Integer]): List[Integer] = make_rat ((numer (x)* denom(y)+ numer( y) * denom ( x)),  denom (x)*denom (y)  )
add_rat: (x: List[Integer], y: List[Integer])List[Integer]

scala> def print_rat(x: List[Integer]) = println( numer(x)+"/"+denom(x))
print_rat: (x: List[Integer])Unit

scala> val r = make_rat(3 , 4)
r: List[Integer] = List(3, 4)

scala> r.head
res19: Integer = 3


scala> def sub_rat(x: List[Integer], y: List[Integer]): List[Integer] = make_rat ((numer (x)* denom(y)- numer( y) * denom ( x)),  denom (x)*denom (y)  )
sub_rat: (x: List[Integer], y: List[Integer])List[Integer]


scala> print_rat(r)
3/4

scala> val x = make_rat(1,4)
x: List[Integer] = List(1, 4)

scala> val x3 = sub_rat(r,x)
x3: List[Integer] = List(8, 16)

scala> print_rat(x3)
8/16

scala> def mul_rat(x: List[Integer], y: List[Integer]): List[Integer] = make_rat (numer (x)* numer( y) ,  denom (x)*denom (y)  )
mul_rat: (x: List[Integer], y: List[Integer])List[Integer]

scala> 

scala> val x= make_rat(2,6)
x: List[Integer] = List(2, 6)

scala> val y= make_rat(1,3)
y: List[Integer] = List(1, 3)

scala> val resul= mul_rat(x,y)
resul: List[Integer] = List(2, 18)

scala> print_rat(resul)
2/18

scala> def div_rat(x: List[Integer], y: List[Integer]): List[Integer] = make_rat (numer (x)* denom( y) ,  denom (x)*numer (y)  )
div_rat: (x: List[Integer], y: List[Integer])List[Integer]

scala> val resul= div_rat(x,y)
resul: List[Integer] = List(6, 6)

scala> print_rat(resul)
6/6

scala> def equal_rat(x: List[Integer], y: List[Integer]) = if (  numer (x)* denom( y) ==  denom (x)*numer (y)  ) true else false
equal_rat: (x: List[Integer], y: List[Integer])Boolean

scala> resul
res3: List[Integer] = List(6, 6)

scala> x
res4: List[Integer] = List(2, 6)

scala> equal_rat(resul, x)
res5: Boolean = false

scala> equal_rat(x, x)
res6: Boolean = true


scala> def gcd (x: Integer, y: Integer): Integer =  if (x==y)  x else if (x > y) gcd((x-y), y) else gcd ((y-x), x) 
gcd: (x: Integer, y: Integer)Integer

scala> gcd(8,2)
res4: Integer = 2

scala> gcd(3,2)
res5: Integer = 1

scala> gcd(3,3)
res6: Integer = 3

scala> gcd(203,3)
res7: Integer = 1

scala> gcd(24,3)
res8: Integer = 3

scala> gcd(24,3)
res9: Integer = 3

scala> gcd(17,3)
res10: Integer = 1
