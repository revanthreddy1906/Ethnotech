class Encapsulation {
    private int id;
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public static void main(String[] args)
    {
        Encapsulation obj=new Encapsulation();
        obj.setId(28);
        int ans=obj.getId();
        System.out.print(ans);
    }
}