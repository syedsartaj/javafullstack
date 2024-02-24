package com.login.students;

public class Student {
	 private String sname;
	 private String fanme;
	 private String manme;
	 private String addno;
	 private String ssalc;
	 private String garde;
	 private Integer attendence;
	 private Integer overallper;
	 private Integer acedemicper;
	 private Integer activityper;
	 private String fao;
	 private String fat;
	 private String fath;
	 private String fafo;
	 private String sao;
	 private String sat;
	 private Integer faoper;
	 private Integer fatper;
	 private Integer fathper;
	 private Integer fafoper;
	 private Integer saoper;
	 private Integer satper;
	 private String pwd;
	 private Integer fees;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFanme() {
		return fanme;
	}
	public void setFanme(String fanme) {
		this.fanme = fanme;
	}
	public String getManme() {
		return manme;
	}
	public void setManme(String manme) {
		this.manme = manme;
	}
	public String getAddno() {
		return addno;
	}
	public void setAddno(String addno) {
		this.addno = addno;
	}
	public String getSsalc() {
		return ssalc;
	}
	public void setSsalc(String ssalc) {
		this.ssalc = ssalc;
	}
	public String getGarde() {
		return garde;
	}
	public void setGarde(String garde) {
		this.garde = garde;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(Integer attendence) {
		this.attendence = attendence;
	}
	public int getOverallper() {
		return overallper;
	}
	public void setOverallper(Integer overallper) {
		this.overallper = overallper;
	}
	public int getAcedemicper() {
		return acedemicper;
	}
	public void setAcedemicper(Integer acedemicper) {
		this.acedemicper = acedemicper;
	}
	public int getActivityper() {
		return activityper;
	}
	public void setActivityper(Integer activityper) {
		this.activityper = activityper;
	}
	public String getFao() {
		return fao;
	}
	public void setFao(String fao) {
		this.fao = fao;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getFath() {
		return fath;
	}
	public void setFath(String fath) {
		this.fath = fath;
	}
	public String getFafo() {
		return fafo;
	}
	public void setFafo(String fafo) {
		this.fafo = fafo;
	}
	public String getSao() {
		return sao;
	}
	public void setSao(String sao) {
		this.sao = sao;
	}
	public String getSat() {
		return sat;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public int getFaoper() {
		return faoper;
	}
	public void setFaoper(Integer faoper) {
		this.faoper = faoper;
	}
	public int getFatper() {
		return fatper;
	}
	public void setFatper(Integer fatper) {
		this.fatper = fatper;
	}
	public int getFathper() {
		return fathper;
	}
	public void setFathper(Integer fathper) {
		this.fathper = fathper;
	}
	public int getFafoper() {
		return fafoper;
	}
	public void setFafoper(Integer fafoper) {
		this.fafoper = fafoper;
	}
	public int getSaoper() {
		return saoper;
	}
	public void setSaoper(Integer saoper) {
		this.saoper = saoper;
	}
	public int getSatper() {
		return satper;
	}
	public void setSatper(Integer satper) {
		this.satper = satper;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	public Student(String sname, String fanme,String manme, String addno, String ssalc, String garde, Integer attendence,
			Integer overallper, Integer acedemicper, Integer activityper, String fao, String fat, String fath, String fafo,
			String sao, String sat, Integer faoper, Integer fatper, Integer fathper, Integer fafoper, Integer saoper,
			Integer satper, String pwd, Integer fees) {
		super();
		this.sname = sname;
		this.fanme = fanme;
		this.addno = addno;
		this.ssalc = ssalc;
		this.garde = garde;
		this.attendence = attendence;
		this.overallper = overallper;
		this.acedemicper = acedemicper;
		this.activityper = activityper;
		this.fao = fao;
		this.fat = fat;
		this.fath = fath;
		this.fafo = fafo;
		this.sao = sao;
		this.sat = sat;
		this.faoper = faoper;
		this.fatper = fatper;
		this.fathper = fathper;
		this.fafoper = fafoper;
		this.saoper = saoper;
		this.satper = satper;
		this.pwd = pwd;
		this.fees = fees;
	}	 
}