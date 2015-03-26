package tr.edu.hacettepe.bbm490;


interface AccountService {
    void transferMoney(long sourceAccountId, long targetAccountId, double amount);

    void depositMoney(long accountId, double amount) throws Exception;

    Account getAccount(long accountId);
}
