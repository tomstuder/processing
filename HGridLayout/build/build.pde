HDrawablePool pool;
HColorPool colors;

void setup(){
	size(600,600);
	H.init(this).background(#202020);
	smooth();

	colors = new HColorPool(#05A935, #74DC93, #333333, #31760F, #6E3183, #8E51D4, #4C0F76);

	pool = new HDrawablePool(121);
	pool.autoAddToStage()
		.add(new HShape("pattern_blocks-01.svg"))
		// .add(new HShape("pattern_blocks-02.svg"))
		// .add(new HShape("pattern_blocks-03.svg"))
		.add(new HShape("pattern_blocks-04.svg"))
		.add(new HShape("pattern_blocks-05.svg"))
		// .add(new HShape("pattern_blocks-06.svg"))
		// .add(new HShape("pattern_blocks-07.svg"))
		// .add(new HShape("pattern_blocks-08.svg"))
		.add(new HShape("pattern_blocks-09.svg"))
		// .add(new HShape("pattern_blocks-10.svg"))
		// .add(new HShape("pattern_blocks-11.svg"))
		// .add(new HShape("pattern_blocks-12.svg"))
		// .add(new HShape("pattern_blocks-13.svg"))
		// .add(new HShape("pattern_blocks-14.svg"))
		// .add(new HShape("pattern_blocks-15.svg"))
		// .add(new HShape("pattern_blocks-16.svg"))
		// .add(new HShape("pattern_blocks-17.svg"))
		// .add(new HShape("pattern_blocks-18.svg"))
		// .add(new HShape("pattern_blocks-19.svg"))
		// .add(new HShape("pattern_blocks-20.svg"))
		// .add(new HShape("pattern_blocks-21.svg"))
		// .add(new HShape("pattern_blocks-22.svg"))
		// .add(new HShape("pattern_blocks-23.svg"))
		// .add(new HShape("pattern_blocks-24.svg"))
		// .add(new HShape("pattern_blocks-25.svg"))

		.layout(
			new HGridLayout()
			.startX(50)
			.startY(50)
			.spacing(50,50)
			.cols(11)
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
						.stroke(#000000)
						.anchorAt(H.CENTER)
						.rotate( (int)random(4) * 90 )
					;
					d.randomColors(colors.fillOnly());
				}
			}
		)
		.requestAll()
	;




	H.drawStage();
}
 
