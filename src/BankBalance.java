class BankBalance {
    private int BB;
    public void setBB(int BB)
    {
        this.BB=BB;
    }
    public int getBB()
    {
        return BB;
    }
    public static void main(String[] args)
    {
        BankBalance BB=new BankBalance();
        BB.setBB(2000);
        int balance=BB.getBB();
        System.out.println(balance);
    }
}
