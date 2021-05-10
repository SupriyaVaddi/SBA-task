package pack1;

public class Player
{

private String name;
private String role;
private String style;
private String team;




public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public Player(String name, String role, String style, String team) {
	super();
	this.name = name;
	this.role = role;
	this.style = style;
	this.team = team;
}

}

