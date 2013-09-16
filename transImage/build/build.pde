PImage img;

void setup(){
size(600, 600);
background(#939393);
smooth();

for (int i = 0; i<900; i++){
img = loadImage("data/trans.png");
image(img, random(-10, 600), random(-10, 600), 40, 40);
}


saveFrame("render/image.png");
}

