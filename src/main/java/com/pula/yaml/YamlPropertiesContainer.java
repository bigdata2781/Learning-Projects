package com.pula.yaml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class YamlPropertiesContainer {
	private String name;
	private int age;
	private boolean nonveg;
	private boolean likecricket;
	private boolean likemovie;
	private String[] skills;
	private List<String> luckyLetters;
	private List<Integer> luckNumbers;
	private Company company;
	private Company company1;
	private Address[] address;
	private String include_newlines;
	private String fold_newlines;
	private Map<String, String> favouriteItems;
	private String booleanString;
	private Integer null1;
	private Integer null2;
	private Map<String, String> development;
	private Map<String, String> test;
	private String mainpath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isNonveg() {
		return nonveg;
	}

	public void setNonveg(boolean nonveg) {
		this.nonveg = nonveg;
	}

	public boolean isLikecricket() {
		return likecricket;
	}

	public void setLikecricket(boolean likecricket) {
		this.likecricket = likecricket;
	}

	public boolean isLikemovie() {
		return likemovie;
	}

	public void setLikemovie(boolean likemovie) {
		this.likemovie = likemovie;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public List<String> getLuckyLetters() {
		return luckyLetters;
	}

	public void setLuckyLetters(List<String> luckyLetters) {
		this.luckyLetters = luckyLetters;
	}

	public List<Integer> getLuckNumbers() {
		return luckNumbers;
	}

	public void setLuckNumbers(List<Integer> luckNumbers) {
		this.luckNumbers = luckNumbers;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Company getCompany1() {
		return company1;
	}

	public void setCompany1(Company company1) {
		this.company1 = company1;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public String getInclude_newlines() {
		return include_newlines;
	}

	public void setInclude_newlines(String include_newlines) {
		this.include_newlines = include_newlines;
	}

	public String getFold_newlines() {
		return fold_newlines;
	}

	public void setFold_newlines(String fold_newlines) {
		this.fold_newlines = fold_newlines;
	}

	public Map<String, String> getFavouriteItems() {
		return favouriteItems;
	}

	public void setFavouriteItems(Map<String, String> favouriteItems) {
		this.favouriteItems = favouriteItems;
	}

	public String getBooleanString() {
		return booleanString;
	}

	public void setBooleanString(String booleanString) {
		this.booleanString = booleanString;
	}

	public Integer getNull1() {
		return null1;
	}

	public void setNull1(Integer null1) {
		this.null1 = null1;
	}

	public Integer getNull2() {
		return null2;
	}

	public void setNull2(Integer null2) {
		this.null2 = null2;
	}

	public Map<String, String> getDevelopment() {
		return development;
	}

	public void setDevelopment(Map<String, String> development) {
		this.development = development;
	}

	public Map<String, String> getTest() {
		return test;
	}

	public void setTest(Map<String, String> test) {
		this.test = test;
	}

	public String getMainpath() {
		return mainpath;
	}

	public void setMainpath(String mainpath) {
		this.mainpath = mainpath;
	}

	@Override
	public String toString() {
		return "YamlPropertiesContainer [name=" + name + ", age=" + age + ", nonveg=" + nonveg + ", likecricket="
				+ likecricket + ", likemovie=" + likemovie + ", skills=" + Arrays.toString(skills) + ", luckyLetters="
				+ luckyLetters + ", luckNumbers=" + luckNumbers + ", company=" + company + ", company1=" + company1
				+ ", address=" + Arrays.toString(address) + ", include_newlines=" + include_newlines
				+ ", fold_newlines=" + fold_newlines + ", favouriteItems=" + favouriteItems + ", booleanString="
				+ booleanString + ", null1=" + null1 + ", null2=" + null2 + ", development=" + development + ", test="
				+ test + ", mainpath=" + mainpath+"]";
	}

	public void logProperties() {
		System.out.println(this.toString());
	}
}