package com.zzq.springcloud.entities;

import java.io.Serializable;

public class cnUser implements Serializable {
	private static final long serialVersionUID = 1L;
	public String telephone;
	public String password;
	public String cnuserID;
	public String accept_secret;
	public String deviceID;
	public String user_agent;
	public int score;
	public int earn;
	public String user_name;
	public String randomPwd;
	public String codeMine;
	public String note;
	public String chargeTel;
	public int	chargeValue;
	public int chargeMoney;
	public String getCodeMine() {
		return codeMine;
	}

	public void setCodeMine(String codeMine) {
		this.codeMine = codeMine;
	}

	public cnUser() {
		super();
	}

	public cnUser(String telephone, String password, String cnuserID, String accept_secret, String deviceID,
                  String user_agent, String user_name, String note, String chargeTel, String chargeValue) {
		super();
		this.telephone = telephone;
		this.password = password;
		this.cnuserID = cnuserID;
		this.accept_secret = accept_secret;
		this.deviceID = deviceID;
		this.user_agent = user_agent;
		this.user_name = user_name;
		this.note = note;
		this.chargeTel = chargeTel;
		this.chargeValue = Integer.parseInt(chargeValue);

	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getAccept_secret() {
		return accept_secret;
	}
	public void setAccept_secret(String accept_secret) {
		this.accept_secret = accept_secret;
	}
	public String getCnuserID() {
		return cnuserID;
	}
	public void setCnuserID(String cnuserID) {
		this.cnuserID = cnuserID;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getEarn() {
		return earn;
	}

	public void setEarn(int earn) {
		this.earn = earn;
	}

	public String getRandomPwd() {
		return randomPwd;
	}

	public void setRandomPwd(String randomPwd) {
		this.randomPwd = randomPwd;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getChargeTel() {
		return chargeTel;
	}

	public void setChargeTel(String chargeTel) {
		this.chargeTel = chargeTel;
	}

	public int getChargeValue() {
		return chargeValue;
	}

	public void setChargeValue(int chargeValue) {
		this.chargeValue = chargeValue;
	}

	public int getChargeMoney() {
		return chargeMoney;
	}

	public void setChargeMoney(int chargeMoney) {
		this.chargeMoney = chargeMoney;
	}

	@Override
	public String toString() {
		return "cnUser{" +
				"telephone='" + telephone + '\'' +
				", password='" + password + '\'' +
				", cnuserID='" + cnuserID + '\'' +
				", accept_secret='" + accept_secret + '\'' +
				", deviceID='" + deviceID + '\'' +
				", user_agent='" + user_agent + '\'' +
				", score=" + score +
				", earn=" + earn +
				", user_name='" + user_name + '\'' +
				", randomPwd='" + randomPwd + '\'' +
				", codeMine='" + codeMine + '\'' +
				", note='" + note + '\'' +
				", chargeTel='" + chargeTel + '\'' +
				", chargeValue=" + chargeValue +
				", chargeMoney=" + chargeMoney +
				'}';
	}
}
