package com.ravijava8practice;
interface Drawable{
	public void draw();
}
public class LambdaExprestionExample {

	public static void main(String[] args) {
		int width=10;
		
      // width lambda
		Drawable d2= ()->{
			System.out.println("Drawable:"+width);
			
		};
		d2.draw();
	}

}
