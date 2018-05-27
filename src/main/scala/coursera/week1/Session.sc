def abs(x: Double) = if(x>0) x else -x

def sqrtIter(guess: Double, value: Double) : Double = {
  if(isGoodEnough(guess, value))
    guess
  else
    sqrtIter(improveGuess(guess, value), value)
}

def isGoodEnough(guess: Double, x: Double) = {
  abs(guess * guess - x) < 0.001
}

def improveGuess(guess: Double, x: Double) : Double = {
  (guess + x/guess)/2
}

def sqrt(value: Double) = sqrtIter(1.0, value)

sqrt(4)