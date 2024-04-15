package svc;

import java.util.List;

import intf.AccountService;
import obj.Account;
import obj.Transaction;

public class AccountServiceImpl implements AccountService {

	@Override
	public Account createNewAccount(Account account) {
		// Dummy DAO. Database insert here
		// accountDao.insert(account);
		// Ultimately return the account with the modification
		return account;
	}

	@Override
	public Account updateAccount(Account account) {
		// Dummy DAO. Database insert here
		// accountDao.update(account);
		// Ultimately return the account with the modification
		account.setName("Alvin Reyes: New Name");
		return account;
	}

	@Override
	public Boolean removeAccount(Account account) {
		// Dummy DAO. Database insert here
		// accountDao.delete(account);
		// Ultimately return the account with the modification
		// If exception occurs return false
		return true;
	}

	@Override
	public List<Transaction> listAllTransactions(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
