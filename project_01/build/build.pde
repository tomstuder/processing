void setup(){
	size(600, 600);
	smooth();

for (int i = 0; i<300; i++){
		rect(i, i, 100, 100);
		
		for (int i = 0; i<300; i++){
			rect(i+20,i+20, width, height);
			
		}
}


}
