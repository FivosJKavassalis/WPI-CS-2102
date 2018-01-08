
class DuplicateVotesException extends Exception{

	private String nameMultCan;	

	DuplicateVotesException(String name){
		this.nameMultCan = name;
	}

	public String getnameExists() {
		return this.nameMultCan;
	}

}
