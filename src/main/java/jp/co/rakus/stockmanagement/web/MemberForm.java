package jp.co.rakus.stockmanagement.web;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * メンバー関連のリクエストパラメータが入るフォーム.
 * @author igamasayuki
 *
 */
public class MemberForm {
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
	
	/**確認用パスワード*/
	private String checkPassword;
	
	
	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}
	public String getCheckPassword() {
		return checkPassword;
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
