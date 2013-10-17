// variable setup
int a = 1; // size
int b = 0; // up + down toggle
int scr = 100;
int sz = 50; // total size

void setup(){
	size(scr, scr);
	smooth();

rectMode(CENTER);
}

void draw(){
background(200,50,0);

	strokeWeight(1);
	fill(255,25,0);
	rect(width/2, height/2, a, a);
	
	if (a == sz){
		b = 1;
	}else if (a == 0) {
		b = 0;
	}

	if (b == 0){
		a++;
	}else {
		a--;
	}

// saveFrame("render/filename-####.tif");
}