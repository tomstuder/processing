size(600, 600);
background(255);
float v = 0.0;
float inc = 0.1;
noStroke();
noiseSeed(4);

for (int i = 0; i < width; i = i+3) {
	float n = noise(v) * 20;
	fill(200);
	rect(i, 1 + n, 1, height);
	v = v + inc;
}
for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(150);
	rect(i, 10 + n, 1, 450);
	v = v + inc;
}

for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(100);
	rect(i, 0 + n, 1, 150);
	v = v + inc;
}
for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(0);
	rect(i, 2 + n, 1, 500);
	v = v + inc;
}
for (int j = 0; j<100; j+=10){
	fill(random(30, 200), 20);
	rect(random(0,500),random(0,500), 200, 200);
}

for (int i = 0; i < 20; i = i+5) {
	float n = noise(v) * 70;
	fill(150);
	rect(i, 8 + n, 2, 30);
	v = v + inc;
}



saveFrame("render.jpg");
