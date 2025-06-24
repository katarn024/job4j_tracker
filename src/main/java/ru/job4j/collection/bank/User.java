package ru.job4j.collection.bank;

import java.util.Objects;

public class User {
	private String passport;
	private String username;

	public User(String passport, String username) {
		this.passport = passport;
		this.username = username;
	}

	/**
	 * @return возвращает номер паспорта пользователя
	 */
	public String getPassport() {
		return passport;
	}

	/**
	 * Метод позволяет добавить паспорт пользователю
	 * @param passport
	 */
	public void setPassport(String passport) {
		this.passport = passport;
	}

	/**
	 * @return возвращает имя пользователя
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Метод позволяет добавить имя для пользователя
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(passport, user.passport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(passport);
	}
}
