HDrawablePool pool;
HColorPool colors;

void setup(){
	size(600,600);
	H.init(this).background(#1F8F2B);
	smooth();

	colors = new HColorPool(#05A935, #74DC93, #31760F);

	pool = new HDrawablePool(180);
	pool.autoAddToStage()
		.add(new HShape("pattern_blocks-01.svg"))
		.add(new HShape("pattern_blocks-13.svg"))

		.layout(
			new HGridLayout()
			.startX(25)
			.startY(25)
			.spacing(50,50)
			.cols(15)
		)

		.onCreate(
			new HCallback() {
				public void run(Object obj) {
					HShape d = (HShape) obj;
					d
						.enableStyle(false)
						.strokeJoin(ROUND)
						.strokeCap(ROUND)
						.strokeWeight(1)
						.stroke(#FFFFFF)
						.anchorAt(H.CENTER)
						.rotate( random(0, 180) )
					;
					d.randomColors(colors.fillOnly());
				}
			}
		)
		.requestAll()
	;




	H.drawStage();
}
 
