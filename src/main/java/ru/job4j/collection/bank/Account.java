package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс описывает аккаунт пользователя банка
 */
public class Account {
	private String requisite;
	private double balance;

	public Account(String requisite, double balance) {
		this.requisite = requisite;
		this.balance = balance;
	}

	/**
	 * @return возвращает значение реквизитов аккаунта
	 */
	public String getRequisite() {
		return requisite;
	}

	/**
	 * Метод позволяющий установить реквизиты
	 * @param
	 */
	public void setRequisite(String requisite) {
		this.requisite = requisite;
	}

	/**
	 * @return возвращает значение баланса аккаунта
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Метод позволяющий установить баланс аккаунта
	 * @param
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Account account = (Account) o;
		return Objects.equals(requisite, account.requisite);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requisite);
	}
}
