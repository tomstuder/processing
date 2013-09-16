// 01 build.pde
// Create a v with a rect

void setup(){
	size(600, 600);
	smooth();

for (int i = 0; i<1200; i++){
		noStroke();
		fill(random(0, 255), random(0, 255), random(0, 255));
		rect(i, i, 600, 600);

}


for (int i = 0; i<1000; i++){
		noFill();
		fill(random(0, 255), random(0, 255), random(0, 255));
		rect(width - i, i, 800, 800);

}

for (int i = 0; i>1000; i--){
	noStroke();
	fill(random(0, 255), random(0, 255), random(0, 255));
	rect(200, 200, 200 + i, 200+i);
}


}
