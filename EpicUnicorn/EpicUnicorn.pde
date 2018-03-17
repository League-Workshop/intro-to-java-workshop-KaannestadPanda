PImage rainbow;
PImage unicorn;
void setup(){
background(129,247,99);
size(1000,1000);
rainbow=loadImage("rainbow.png");
unicorn=loadImage("unicorn.jpg");
rainbow.resize(1000,1000);
unicorn.resize(250,250);
ellipse(100,50,100,100);
fill(200,200,200);
rect(200,400,40,40);
fill(255,0,0);
triangle(700,200,150,150,100,50);
}
void draw(){
background(rainbow);
if(mousePressed==true){fill(255,0,0);
ellipse(600,400,50,50);
}
if(mousePressed==false)
{fill(0,255,0);
ellipse(600,400,50,50);}
image(unicorn,mouseX,mouseY);
ellipse(mouseX,mouseY,25,25);
}