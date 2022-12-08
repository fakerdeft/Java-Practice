package 실습문제10.인터페이스.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	public GalaxyNote9() {
		super.setMaker("Samsung");
		
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "\n고속충전, 고속무선충전";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "\n번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "\n수신 버튼을 누름";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "\n1200만 듀얼 카메라";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "\n정전식, 와콤펜 지원";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		
		return "갤럭시 노트9는 "+super.getMaker()+"에서 만들어졌고\n제원은 다음과 같다."
		+makeCall()+takeCall()+picture()+charge()
	+touch()+"\n블루투스 펜 탑재 여부: "+bluetoothPen();
	}
	
}
































