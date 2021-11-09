import turtle

turtle.bgcolor("black")
turtle.pensize(2)

a = turtle.Turtle()
a.penup()
a.goto(-15, 200)
a.pendown()
a.color("red")
style = ('courier', 40, 'bold')
a.write('I', font=style, align='left')
a.hideturtle()


def curve():
    for i in range(200):
        turtle.right(1)
        turtle.forward(1)


turtle.speed(0)
turtle.color("red", "black")

turtle.begin_fill()
turtle.left(140)
turtle.forward(111.0)
curve()

turtle.left(120)
curve()
turtle.forward(111.65)
turtle.end_fill()
turtle.hideturtle()

a = turtle.Turtle()
a.penup()
a.goto(8, -100)
a.pendown()
a.color("red")
style = ('courier', 40, 'bold')
a.write('maself', font=style, align='center')
a.hideturtle()

turtle.done()