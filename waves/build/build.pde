HDrawablePool pool;
HColorPool colors;

void setup(){
	size(650,650);
	H.init(this).background(#c8c8c8);
	smooth();

	colors = new HColorPool(#3D60A9, #4C72BB, #698CC7);

	pool = new HDrawablePool(275);
	pool.autoAddToStage()
		.add(new HShape("wave-01.svg"))

		.layout(
			new HGridLayout()
			.startX(0)
			.startY(0)
			.spacing(80,70)
			.cols(9)
		)

		.onCreate(
			new HCallback() {
				public void run(Object obj) {
					HShape d = (HShape) obj;
					d
						.enableStyle(true)
						// .strokeJoin(ROUND)
						// .strokeCap(ROUND)
						.strokeWeight(1)
						// .stroke(#FFFFFF)
						.anchorAt(H.CENTER)
						.size(150, 100)
						// .rotate( random(0, 180) )
					;
					d.randomColors(colors.fillOnly());
				}
			}
		)
		.requestAll()
	;
}
 void draw() {
	H.drawStage();
}

void saveHiRes(int scaleFactor) {
	PGraphics hires = createGraphics(width*scaleFactor, height*scaleFactor, JAVA2D);

	beginRecord(hires);
	hires.scale(scaleFactor);

	if (hires == null) {
		H.drawStage();
	} else {
		H.stage().paintAll(hires, false, 1); // PGraphics, uses3D, alpha
	}

	endRecord();
	hires.save("render.jpg");

}
