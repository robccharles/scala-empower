// root(x)
def square(x: Double)= x*x

def abs(x: Double) = if (x > 0 ) x else ( - x)

def good_enough(guess: Double,  x: Double) =   abs ( square( guess) - square( x)) < 0.001

def average (x: Double, y: Double)= ( x + y)/ 2

def improve(guess: Double, x: Double)= average (guess, x/ guess)

def sqrt_iter (guess:Double, x:Double): Double  = if ( good_enough(guess, x) ) guess else sqrt_iter (improve(guess, x),  x)

