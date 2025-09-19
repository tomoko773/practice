package curriculum_C;

class Person{
	  // インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;


	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  Person(String name,int age,double height,double weight){
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
	  }  
  
	  public void print() {
	        System.out.println("名前は" + this.name + "です");
	        System.out.println("年齢は" + this.age + "です");
	        System.out.println("BMIは" + String.format("%.1f", this.weight / ( this.height * this.height ))+ "です");
	        
	    }


      //printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください.
	  //人数の合計を「合計○人です」
	}

