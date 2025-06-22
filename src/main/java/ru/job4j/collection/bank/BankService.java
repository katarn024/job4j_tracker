package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
	private final Map<User, List<Account>> users = new HashMap<>();

	public void addUser(User user) {
		users.putIfAbsent(user, new ArrayList<Account>());
	}

	public void deleteUser(String passport) {
		for (User user : users.keySet()) {
			if (user.getPassport().equals(passport)) {
				users.remove(user);
			}
		}
	}

	public void addAccount(String passport, Account account) {
		User user = findByPassport(passport);
		if (user != null && !users.get(user).contains(account)) {
			users.get(user).add(account);
		}
	}

	public User findByPassport(String passport) {
		User result = null;
		for (User user : users.keySet()) {
			if (Objects.equals(user.getPassport(), passport)) {
				result = user;
			}
		}
		return result;
	}

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

	public List<Account> getAccounts(User user) {
		return users.get(user);
	}
}
