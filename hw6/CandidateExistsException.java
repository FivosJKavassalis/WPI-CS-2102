
class CandidateExistsException extends Exception {
	private String nameExists;

	CandidateExistsException(String nameCan){
		this.nameExists = nameCan;
	}

	public String getnameExists() {
		return this.nameExists;
	}
}
