"""This program will roll a dice and allow a user to guess the number."""
from random import randint
from time import sleep

def get_user_guess():
  """Collects the guess from user"""
  user_guess=int(raw_input("Guess which number I rolled!:"))
  return user_guess

def roll_dice(number_of_sides):
  first_roll=randint(1,number_of_sides)
  second_roll=randint(1, number_of_sides)
  max_val=number_of_sides*2
  print "The maximum possible value is:" + str(max_val)
  sleep(1)
  user_guess=get_user_guess()
  if user_guess>max_value:
   print "Guess is outside possible range!"
 	elif user_guess<=max_value:
    print "Rolling..."
    sleep(2)
    print "The first value is: %d" % first_roll
    sleep(1)
    print "The second value is: %d" % second_roll
    total_roll=first_roll+second_roll
    sleep(1)
    print "Resutl...: %d" % total_roll
    if user_guess>total_roll:
      print "You won!"
      return
    else:
      if user_guess<total_roll:
        print "Sorry, you lost."
        return
      
      
roll_dice(6)