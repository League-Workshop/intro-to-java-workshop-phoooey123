PImage catPic;
int x = 526;
int y = 355;
int acceleration = 5;
void setup() {
  size(1320, 968);
  
  catPic = loadImage("EvilCat.jpg");
      catPic.resize(1320, 968);
    background(catPic);
}
void draw() {
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(255,0,0);
noStroke();
ellipse(x, y, 150, 150);
ellipse(x+300, y, 150, 150);
}
void keyPressed() {
    acceleration++;
    x+=2*acceleration;
   y+=2*acceleration;
  println(x,y);
}