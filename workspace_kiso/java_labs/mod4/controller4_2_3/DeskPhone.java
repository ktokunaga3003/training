package controller4_2_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * DeskPhone.java
 *
 */

class DeskPhone extends BasePhone{

	//�R���X�g���N�^�i����1�j
	public DeskPhone(String name){
		super(name);
		System.out.println(name + "����̑��d�b�ł��B");
	}

	//Phone�C���^�t�F�[�X����I�[�o�[���C�h����call()���\�b�h
	public void call(){
		System.out.println(name + "����̑��d�b����܂��B");
	}

}