package gymjava_Collections;

public class plan {
private int id;
private String pname;
private int rev;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getRev() {
	return rev;
}
public void setRev(int rev) {
	this.rev = rev;
}
public plan(int id, String pname, int rev) {
	super();
	this.id = id;
	this.pname = pname;
	this.rev = rev;
}
@Override
public String toString() {
	return "plan [id=" + id + ", pname=" + pname + ", rev=" + rev + "]";
}




}
