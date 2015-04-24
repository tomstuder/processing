int x = 0;
int y = 55;

void setup() {
  size(150, 70);
}

void draw() {
  background(200);
  float x  = mouseX;
  float y = mouseY;
  line(x, y, x+20, y-40);
  line(x+10, y, x+30, y-40);
  line(x+20, y, x+40, y-40);
  line(x+30, y, x+50, y-40);
  line(x+40, y, x+60, y-40);
  line(x+50, y, x+70, y-40);
  line(x+60, y, x+80, y-40);  
  line(x+70, y, x+90, y-40);
  line(x+80, y, x+100, y-40);
  line(x+90, y, x+110, y-40);  

  x = x + 1;
  if (x > 150) {
    x = -40;
  }

}
