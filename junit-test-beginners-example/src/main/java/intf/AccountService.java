package intf;

import java.util.List;

import obj.Account;
import obj.Transaction;

public interface AccountService {

	Account createNewAccount(Account account);

	Account updateAccount(Account account);

	Boolean removeAccount(Account account);

	List<Transaction> listAllTransactions(Account account);
}
