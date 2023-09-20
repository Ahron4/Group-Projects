#------Import Statments------
import turtle as trtl
import random as rand

#Among us Red light, green light created by Ahron, Jadden, and Thomas

'''1. Give the user an option on play the game up to 4 players
   2. Generate the amount of players the user puted
   3. Generate a big circle that changes the color from red to green at a random time interval
   4. Generate 1 to 4 smaller cirlces that acted like players
   5. Players go forward 5 pixals when they hit a certain key
   6. When they moved forward during red light they return to their original position to start again. 
   7. When a player reaches a certain y-axis, their character stops and display (1st: Player1) but other players can still go for 2nd, 3rd or 4th place
   '''
#----The Screen----
wn = trtl.Screen()
#---Background cite: https://www.google.com/search?q=squid+game+map&rlz=1C1CHBF_enUS867US867&source=lnms&tbm=isch&sa=X&ved=2ahUKEwioldOF8tz0AhXkkGoFHbCmBxEQ_AUoAnoECAEQBA&biw=1920&bih=969&dpr=1#imgrc=oaCxLIYU4kl10M----
background = "background.gif"
wn.bgcolor("coral")
#----Timer Settings made by Thomas----
font_setup = ("Arial", 20, "normal")

timer = 241
counter_interval = 1000   #1000 represents 1 second
timer_up = False

counter =  trtl.Turtle()
counter.hideturtle()
counter.penup()
counter.goto(100,280)
counter.pendown()

#----Player models made by Thomas----
Player_1_image = "Player 1.gif"
Player_2_image = "Player 2.gif"
Player_3_image = "Player 3.gif"
Player_4_image = "Player 4.gif"
#----The Doll----
doll = trtl.Turtle(shape="circle")
#----write things like rules and controls----
writer = trtl.Turtle()
#----player turtles----
player1 = trtl.Turtle()
player2 = trtl.Turtle()
player3 = trtl.Turtle()
player4 = trtl.Turtle()
#----hides the turtles----
doll.hideturtle()
writer.hideturtle()
player1.hideturtle()
player2.hideturtle()
player3.hideturtle()
player4.hideturtle()

#----Line 52-66 made by Thomas and Jadden----
#----Adds Player images----    
wn.addshape(Player_1_image)
wn.addshape(Player_2_image)
wn.addshape(Player_3_image)
wn.addshape(Player_4_image)
#----Change player Shape----
player1.shape(Player_1_image)
player2.shape(Player_2_image)
player3.shape(Player_3_image)
player4.shape(Player_4_image)
#----Prevents the users from starting when the game did't start yet----
player1.penup()
player2.penup()
player3.penup()
player4.penup()


#----user input----
player_count = int(input("How many players will be joining red light, green light? (Type any number between 1-4):"))

#---Doll---
def dolly():
  doll.penup()
  doll.goto(0, 250)
  doll.shapesize(4)
#-----player starters-----
def player_1():
  player1.goto(-240,-300)
  player1.left(90)
  
def player_2():
  player2.goto(-100,-300)
  player2.left(90)

def player_3():
  player3.goto(100,-300)
  player3.left(90)

def player_4():
  player4.goto(240,-300)
  player4.left(90)

#---player movement and winners made by Ahron---
places = ["1st", "2nd", "3rd", "4th"]
winner = 0

def movement_P1():
  global winner
  player1.forward(5)
  if doll.fillcolor() == "red":
    player1.sety(-300)
  if player1.ycor() == 200:
    player1.hideturtle()
    player1.write("P1 finished:" + str(places[winner]), align="center", font=("Arial", "9", "bold"))
    winner += 1
def movement_P2():
  global winner
  player2.forward(5)
  if doll.fillcolor() == "red":
    player2.sety(-300)
  if player2.ycor() == 200:
    player2.hideturtle()
    player2.write("P2 finished:" + str(places[winner]), align="center", font=("Arial", "9", "bold"))
    winner += 1
def movement_P3():
  global winner
  player3.forward(5)
  if doll.fillcolor() == "red":
    player3.sety(-300)
  if player3.ycor() == 200:
    player3.hideturtle()
    player3.write("P3 finished:" + str(places[winner]), align="center", font=("Arial", "9", "bold"))
    winner += 1
def movement_P4():
  global winner
  player4.forward(5)
  if doll.fillcolor() == "red":
    player4.sety(-300)
  if player4.ycor() == 200:
    player4.hideturtle()
    player4.write("P4 finished:" + str(places[winner]), align="center", font=("Arial", "9", "bold"))
    winner += 1

#----rules made by Ahron----
def rules():
  if (player_count >= 1):
    writer.penup()
    writer.clear()
    writer.goto(-40, 100)
    writer.write("Rules: \n -Rapidly press your desired key when it is non-red light \n -Stop pressing you key when it is red light \n -If you press your key during red light you will be put back at the begining \n -You will be given 240 seconds (4 minutes) to make it pass the finish line \n -Timer increases everytime someone crosses the red line \n -DO NOT!! hold your desired key", align="center", font=("Arial", "12"))
    writer.goto(-110, -50)
    writer.write("Controls: \n -Player 1, w \n -Player 2, spacebar \n -Player 3, p \n -Player 4, up button \n\n -Click anywhere or the start button to start the game",align="center", font=("Arial", "12"))

#----starts when anywhere is clicked (made by Ahron and Thomas)----
def start_game(x,y):
  print('Good Luck')
  start_button.hideturtle()
  dolly()
  doll.showturtle()
  writer.clear()
  #----prevents players from clicking before the game even starts----
  wn.onkeypress(movement_P1, "w")
  wn.onkeypress(movement_P2, "space")
  wn.onkeypress(movement_P3, "p")
  wn.onkeypress(movement_P4, "Up")
  wn.ontimer(countdown, counter_interval)
  trtl.bgpic(background)
  lights()
  
#----spawns in the number of players based on the user input (Made by Ahron)----
if player_count == 1:
  player_1()
  player1.showturtle()
elif player_count == 2:
  player_1()
  player1.showturtle()
  player_2()
  player2.showturtle()
elif player_count == 3:
  player_1()
  player1.showturtle()
  player_2()
  player2.showturtle()
  player_3()
  player3.showturtle()
elif player_count == 4:
  player_1()
  player1.showturtle()
  player_2()
  player2.showturtle()
  player_3()
  player3.showturtle()
  player_4()
  player4.showturtle()

#----start button made by Thomas----
button = "Start.gif"
wn.addshape(button)

start_button = trtl.Turtle()
start_button.penup()
start_button.goto(0,-100)
start_button.shape(button)
#----Timer made by Thomas----
def countdown():
  global timer, timer_up
  counter.clear()
  if timer <= 0:
    counter.write("Game Over", font=font_setup)
    player1.hideturtle()
    player2.hideturtle()
    player3.hideturtle()
    player4.hideturtle()
    doll.hideturtle()
    timer_up = True
  else:
    counter.write("Timer: " + str(timer), font=font_setup)
    timer -= 1
    if winner == 0:
      counter.getscreen().ontimer(countdown, counter_interval)
    elif winner == 1:
      counter.getscreen().ontimer(countdown, 600)
    elif winner == 2:
      counter.getscreen().ontimer(countdown, 400)
    elif winner == 3:
      counter.getscreen().ontimer(countdown, 200)
      
#---Created by Ahron, Jadden, and Thomas

#----Creates random seconds to turn green and red light---
rand_colors = ["green", 'blue', "indianred", "lightsalmon", "lightcoral", "tomato", "pink"]
time_list = [2, 3, 4, 5, 6, 7, 8 , 9, 10]
rand_seconds = rand.choice(time_list)

rand_lights = trtl.Turtle()
rand_lights.penup()
rand_lights.hideturtle()

def lights():
  global rand_seconds
  if rand_seconds <= 0:
    doll.fillcolor("red")
    rand_seconds = rand.choice(time_list)
    rand_lights.getscreen().ontimer(lights, rand.randint(1000,10000))
  else:
    doll.fillcolor(rand.choice(rand_colors))
    rand_seconds -= 1
    rand_lights.getscreen().ontimer(lights, 1000)
    
#---Users read the rules  and clicks anywhere to start---
start_button.onclick(start_game)
rules()
wn.listen()
wn.mainloop()