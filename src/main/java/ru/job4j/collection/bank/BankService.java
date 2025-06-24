package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
	private final Map<User, List<Account>> users = new HashMap<>();

	/**
	 * Метод добавляющий нового пользователя из банка
	 * @param user
	 */
	public void addUser(User user) {
		users.putIfAbsent(user, new ArrayList<Account>());
	}

	/**
	 * Метод удаляющий пользователя из банка
	 * @param passport данные паспорта пользователя по которым будет удален аккаунт пользователя
	 */
	public void deleteUser(String passport) {
		for (User user : users.keySet()) {
			if (user.getPassport().equals(passport)) {
				users.remove(user);
			}
		}
	}

	/**
	 * Метод добавляющий новый аккаунт
	 * @param passport данные паспорта владельца аккаунта
	 * @param account данные нового аккаунта
	 */
	public void addAccount(String passport, Account account) {
		User user = findByPassport(passport);
		if (user != null && !users.get(user).contains(account)) {
			users.get(user).add(account);
		}
	}

	/**
	 * Метод находящий пользователя в системе по паспорту
	 * @param passport требует передать данные паспорта для поиска пользователя
	 * @return возвращает аккаунт найденного пользователя, либо возвращает null
	 */
	public User findByPassport(String passport) {
		User result = null;
		for (User user : users.keySet()) {
			if (Objects.equals(user.getPassport(), passport)) {
				result = user;
			}
		}
		return result;
	}

	/**
	 * Метод находящий аккаунт пользователя по паспорту пользователя и реквизитам аккаунта
	 * @param passport
	 * @param requisite
	 * @return возвращает аккаунт пользователя, либо возвращает null
	 */
	public Account findByRequisite(String passport, String requisite) {
		Account result = null;
		if (findByPassport(passport) != null) {
			for (Account account : users.get(findByPassport(passport))) {
				if (account.getRequisite().equals(requisite) && users.get(findByPassport(passport)).contains(account)) {
					result = account;
				}
			}
		}
		return result;
	}

	/**
	 * Метод перевода денег между аккаунтами пользователей
	 * @param sourcePassport
	 * @param sourceRequisite
	 * @param destinationPassport
	 * @param destinationRequisite
	 * @param amount
	 * @return возвращает состояние перевода True, как перевод успешен, либо False, как перевод не прошел, отказ
	 */
	public boolean transferMoney(String sourcePassport, String sourceRequisite,
								 String destinationPassport, String destinationRequisite,
								 double amount) {
		boolean result = false;
		Account accountSourse = findByRequisite(sourcePassport, sourceRequisite);
		Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
		if (accountSourse == null || accountDestination  == null) {
			return result;
		}
		if (findByRequisite(sourcePassport, sourceRequisite).getBalance() >= amount) {
			accountDestination.setBalance(accountDestination.getBalance() + amount);
			accountSourse.setBalance(accountSourse.getBalance() - amount);
			result = true;
		}
		return result;
	}

	/**
	 * Метод позволяющий получить аккаунты пользователя
	 * @param user
	 * @return возвращает список аккаунтов пользователя
	 */
	public List<Account> getAccounts(User user) {
		return users.get(user);
	}
}
