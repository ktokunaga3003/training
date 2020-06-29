package sumupstudent3_2_4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Student.java
 *
 */

// 学生クラス
class Student {

	private String  name;		// 名前
	private int     math;		// 数学の得点
	private int     chemistry;	// 科学の得点
	private int     physics;	// 物理の得点

	// コンストラクタ
	public Student(String pName,int pMath,int pChemistry,int pPhysics) {
		name      = pName;
		math      = pMath;
		chemistry = pChemistry;
		physics   = pPhysics;
	}

	// メンバ変数の値取得メソッド
	public String getName() {
		return name;
	}

	public int getMath() {
		return math;
    }

	public int getChemistry() {
		return chemistry;
	}

	public int getPhysics() {
		return physics;
	}

	// 合計値取得　メソッド
	public int getTotal() {
		return math + chemistry + physics;
	}

}
