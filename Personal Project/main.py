#Hangman Made by Ahron
import turtle as trtl
import random as rand

word = trtl.Turtle()
word.penup()
word.goto(-600, 0)
word.hideturtle()

#Dispays and writes instructions in the program
writer = trtl.Turtle()
writer.hideturtle()

#A list of the whole alphabet
alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]

#different types of categories the user can pick
foods = ["hamburger!", "sandwhiches!", "pies!", "poke_bowls!", "doughnuts!", "pizzas!", "bacon_and_eggs!", "risottos!", "hotdog!", "rice_krispies!"]

US_founding_fathers = ["george_washington!", "john_adams!", "thomas_jefferson!", "james_madison!", "alexander_hamilton!", "james_monroe!", "benjamin_fraklin!", "thomas_paine!", "john_jay!", "james_wilson!"]

natrual_disasters = ["earthquakes!", "wild_fires!", "floods!", "droughts!", "hurricanes!", "tornadoes!", "tsunamis!", "vocanoes!", "duststorms!", "thunderstorms!"]

writer.write("Pick a category you want to guess by typing the number corresponding to that category!\n(For example press 1 in the console if you want to guess a certain type of food)\n1. Types of foods\n2. US founding fathers\n3. Natural disasters", font=("Arial", 12))


choice = int(input("Type in a number corresponding to that category: "))

#Ensures the user of what category they picked
#Tells the user they need to pick again if they did't choose the 3 categories
while True:
  if choice == 1:
    writer.clear()
    writer.write("You have choosen to guess a word containing different types of foods", font=("Arial", 12))
    break 
  elif choice == 2:
    writer.clear()
    writer.write("You have choosen to guess a word regarding our US founding fathers", font=("Arial", 12))
    break
  elif choice == 3:
    writer.clear()
    writer.write("You have choosen to guess a word regarding natural disasters", font=("Arial", 12))
    break
  else:
    writer.clear()
    writer.write("It seems that this is not one of the choice, please choose again!", font=("Arial", 12)) 
    choice = int(input("Type in a number corresponding to that category: "))

#When a user selects a category, it will give a random word from the list so the user can guess it
if choice == 1:
  
  def hint(word_amt):
    print(word_amt)
    index = 0
    while foods[word_amt][index] != "!":
      if foods[word_amt][index] == "_":
        word.penup()
        word.forward(50)
        index += 1
      if foods[word_amt][index] == "!":
        break
      else:
        word.pendown()
        word.forward(50)
        word.penup()
        word.forward(50)
        index += 1

elif choice == 2:
  
  def hint(word_amt):
    print(word_amt)
    index = 0
    while US_founding_fathers[word_amt][index] != "!":
      if US_founding_fathers[word_amt][index] == "_":
        word.penup()
        word.forward(50)
        index += 1
      if US_founding_fathers[word_amt][index] == "!":
        break
      else:
        word.pendown()
        word.forward(50)
        word.penup()
        word.forward(50)
        index += 1

elif choice == 3:
  
 def hint(word_amt):
  print(word_amt)
  index = 0
  while natrual_disasters[word_amt][index] != "!":
    if natrual_disasters[word_amt][index] == "_":
      word.penup()
      word.forward(50)
      index += 1
    if natrual_disasters[word_amt][index] == "!":
      break
    else:
      word.pendown()
      word.forward(50)
      word.penup()
      word.forward(50)
      index += 1
  
hint(rand.randint(0, 9))


def food():
  print("okay")

  
wn = trtl.Screen()
wn.onkeypress(food, "w")
wn.mainloop()
