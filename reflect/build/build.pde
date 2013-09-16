
PShape s;

void setup(){
size(394, 500, P3D);
s = loadShape("test.svg");

pushMatrix();
translate(0, 0);
shape(s, 0, 0);
popMatrix();

// flippin images!!!
pushMatrix();
translate(394, 0);
scale(-1,1);
shape(s, 0, 0);
popMatrix();

saveFrame("saveImage/flippin_image2.png");
	
}
