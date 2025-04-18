package headquerter;

public class Reviews {
	String r_code;
	String id;
	String detail;
	String answer;
	String title;
	
	public Reviews(String r_code, String id, String title, String detail) {
		this.r_code = r_code;
		this.id = id;
		this.title = title;
		this.detail = detail;
	}
	
	public Reviews(String r_code, String id,String title, String detail,String answer) {
		this.r_code = r_code;
		this.id = id;
		this.detail = detail;
		this.title = title;
		this.answer = answer;
	}
	
	public String getR_code() {
		return r_code;
	}
	public String getId() {
		return id;
	}
	public String getDetail() {
		return detail;
	}
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Reviews [r_code=" + r_code + ", id=" + id +", title=" + title + ", detail=" + detail + "]";
	}
//	
//	public String toStringAll() {
//		return "Reviews [r_code=" + r_code + ", id=" + id + ", detail=" + detail + ", answer=" + answer + "]";
//	}
}
