public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.login();
        System.out.println("Hoşgeldiniz " + account.getUser().getFname() + " " +
                account.getUser().getLname());
        account.addAddress("Birecik / Urfa");
        account.addAddress("Nizip / Gaziantep");
        account.addAddress("Çukurova / Adana");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
