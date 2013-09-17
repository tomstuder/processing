PImage bg,one,two,three,four;

void setup(){
size(600, 600);
bg = loadImage("data/bg.jpg");
image(bg, 0, 0, width, height);
smooth();

for (int i = 0; i<250; i++){
one = loadImage("data/trans.png");
two = loadImage("data/red.png");
three = loadImage("data/redblue.png");
four = loadImage("data/bluex.png");
image(one, random(-10, 600), random(-10, 600), 10, 10);
image(two, random(-10, 600), random(-10, 600), 10, 10);
image(three, random(-10, 600), random(-10, 600), 10,10);
image(four, random(-10, 600), random(-10, 600), 20, 20);
rotate(random(10, 180));
image(four, random(-10, 600), random(-10, 600), 30, 30);
// stroke(random(0, 255), random(10, 150));
noStroke();
fill(random(0, 20), random(0, 50));
rect(random(0, 600), random(0, 600), random(20, 600), random(20, 600));
  }

  saveFrame("random_trans.png");

}





