package pojo;

/**
 * 
 * @author VsunGoK
 *
 */
public class ShangHanTiaoBian {

	private int id;
	private int num;
	private String content;
	private String comment;
	public ShangHanTiaoBian() {
		super();
	}
	public ShangHanTiaoBian(int id, int num, String content, String comment) {
		super();
		this.id = id;
		this.num = num;
		this.content = content;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
