
PImage img;

void setup(){
size(394, 500, P3D);
img = loadImage("argue.png");

pushMatrix();
translate(0, 0);
image(img, 0, 0);
popMatrix();

// flippin images!!!
pushMatrix();
translate(394, 0);
scale(-1,1);
image(img, 0, 0);
popMatrix();

saveFrame("saveImage/flippin_image.png");
	
}
