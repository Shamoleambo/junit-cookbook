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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> listAllTransactions(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
