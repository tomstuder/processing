 
int a = 1;
void setup(){
	size(800, 800);
	smooth();
frameRate(15);
rectMode(CENTER);
}

void draw(){
background(200,50,0);

for (int y = 0; y<= height; y=y+10){
  for (int x = 0; x<= width; x=x+10){

	// strokeWeight(1);
	fill(255,25,0);
	rect(x, y, a, a);
	a++;

if (a>20){
	a=1;
	
    }
  }
}
// saveFrame("render/filename-####.tif");
}



// for (int i = 0; i < width; i=i+2) {
//   for (int j = 0; j < height; j=j+2) {
 	
//  	background(45);
//  	rectMode(CENTER);
// 	rect(i, i , x, x);
// 	x++;


// 	if (x >= 10){
// 	background(45);
// 	rectMode(CENTER);
// 	rect(i, i , x, x);
// 	x=10;
// 	}
//   }
// }