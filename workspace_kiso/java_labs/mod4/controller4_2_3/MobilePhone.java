package controller4_2_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * MobliePhone.java
 *
 */

class MobilePhone extends BasePhone{

	//�R���X�g���N�^�i�����P�j
	public MobilePhone(String name){
		super(name);
		System.out.println(name + "����̌g�ѓd�b�ł��B");
	}

	//Phone�C���^�t�F�[�X����I�[�o�[���C�h����call()���\�b�h
	public void call(){
		System.out.println(name + "����̌g�ѓd�b����܂��B");
	}
}