package jp.co.rakus.stockmanagement.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * メンバー情報を保持するエンティティ.
 * @author rakus
 */
public class Member {
	/** id(主キー) */
	private Integer id;
	
	/** 名前 */
	@NotBlank(message = "氏名は必須です")
	private String name;
	
	/** メールアドレス */
	@NotBlank(message = "メールアドレスは必須です")
	@Email(message = "Eメールの形式が不正です")
	private String mailAddress;
	
	/** パスワード */
	@NotBlank(message = "パスワードは必須です")
	@Size(min = 4, max = 8, message = "パスワードは4文字以上8文字以内で記載してください")
	private String password;
	
	
	public Member() {}
	public Member(Integer id, String name, String mailAddress, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mailAddress = mailAddress;
		this.password = password;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
