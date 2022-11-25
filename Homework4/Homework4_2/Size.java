package ru.mirea.lab1.Homework4.Homework4_2;

public enum Size {
    XXS(32)
            {
                public void getDescription()
                {
                    System.out.println("Детский размер");
                }
            }
    ,XS(34),S(36),M(38),L(40);

    private int euroSize;

    Size(int euroSize)
    {
        this.euroSize=euroSize;
    }

    public void getDescription()
    {
       System.out.println("Взрослый размер");
    }
}
