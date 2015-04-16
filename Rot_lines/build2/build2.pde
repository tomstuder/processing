int a = 10;
void setup() {
size(800, 800);
smooth();
background(55);
noStroke();


}
void draw() {
background(#3498db);
  float x = 0.0;
    // while (x < width) {
    //   float y = 0.0;
    //   while (y < height) {
    //     fill(255);
    //     stroke(0);
    //     rect(x, y, a, a);
    //     y = y + 12;
    //   }
    //   x = x + 12;
    // }


  int f = 0;
while (f < 1600) {
  fill(random(0, 255),random(0, 255),random(0, 255));
  // fill(#8e44ad);
  rotate(random(1, 45));
  noStroke();
  rect(f, f, random(1, 2), random(10, 200));
  f++;
  }
  // saveFrame("line-######.tga");
 }