package intf;

import obj.Account;
import obj.Transaction;

public interface AccountService {

	Account createNewAccount(Account account);

	Account updateAccount(Account account);

	Account removeAccount(Account account);

	Transaction listAllTransactions(Account account);
}
