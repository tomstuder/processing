PImage img;

void setup(){
size(600, 600);
smooth();
rect(20, 20, 560, 560);

saveFrame("data/rect.png");

img = loadImage("data/rect.png");
rotate(radians(25));
image(img, 40, 40, 560, 560);

saveFrame("render/stack.png");
}

