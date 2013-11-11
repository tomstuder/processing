void setup(){
size(500, 500);
}

void draw(){

int s = second();
int m = minute(); 
int h = hour();

String col = "colors " + h + m + s;

background(s + 150,m + 100, h);

for (int x = 0; x <=width; x+=20){
	for (int y = 0; y <=height; y+=20){
		// stroke(s,h,m);
		fill(s+160, m+110, h, random(0, 200));
		stroke(s+100, 0, 0,random(0, 200));
		// strokeWeight(random(1));
		rect(x, y, random(1, 20), random(1, 20));
  }
 }
 // Use MovieMaker in Processing Tools to create .mov file (uncomment saveFrame below)
 // saveFrame("render/line-######.tif");
}
