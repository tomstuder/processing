void setup() {
size(600,600);
smooth();
stroke(255);

}

void draw() {
  stroke(100);
  strokeWeight(abs(mouseX-pmouseX));
  line(pmouseX,pmouseY,mouseX,mouseY);
}
