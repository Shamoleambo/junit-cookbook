package svc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import obj.Account;

public class AccountServiceImplTest {

	AccountServiceImpl accountService = new AccountServiceImpl();

	@Test
	public void testCreateNewAccount() {
		Account newAccount = new Account();
		newAccount.setName("Alvin Reyes");
		newAccount.setDescription("This is the description");

		Account newAccountInserted = accountService.createNewAccount(newAccount);

		assertEquals(newAccount.getName(), newAccountInserted.getName());
	}

	@Test
	public void testUpdateAccount() {
		Account oldAccount = new Account();
		oldAccount.setName("Alvin Reyes");
		oldAccount.setDescription("This is the description");

		String name = oldAccount.getName();
		Account expectedAccountObj = new Account();
		expectedAccountObj = accountService.updateAccount(oldAccount);
		assertNotEquals(name, expectedAccountObj.getName());
	}

	@Test
	public void testRemoveAccount() {
		Account toBeRemovedAccount = new Account();
		toBeRemovedAccount.setName("Alvin Reyes");
		toBeRemovedAccount.setDescription("This is the description");

		assertTrue(accountService.removeAccount(toBeRemovedAccount));
	}

	@Test
	public void testListAllTransactions() {
		Account account = new Account();
		account.setName("Alvin Reyes");

		accountService.listAllTransactions(account);
		assertTrue(accountService.listAllTransactions(account).size() > 1);
	}
}
