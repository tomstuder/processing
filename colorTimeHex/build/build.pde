void setup(){
	size(600, 600);
	smooth();
}

void draw(){

int h = hour();   // 0 - 24
int m = minute(); // 0 - 59 
int s = second(); // 0 - 59 

// create a string of numbers from the time (combined)
String t = "" + h + m + s;

// create integer from combined hour + minute + second
int n = PApplet.parseInt(t);	

background(n); // uses parsed string as color value
println(n);
}

// issues: if time is 12:03:05, the int value will appear as 1235
// Intent is to have a smooth transition between color values