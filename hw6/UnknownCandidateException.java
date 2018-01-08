
class UnknownCandidateException extends Exception{

	private String nameUnknownCan;	

	UnknownCandidateException(String name){
		this.nameUnknownCan = name;
	}

	public String getUnknownName() {
		return this.nameUnknownCan;
	}
}
