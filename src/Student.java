import javax.naming.InvalidNameException;

public class Student {
        private String name;
        private int age;
    private Student(Builder bt)
    {
       name=bt.name;
       age=bt.age;
    }
    public void getname()
    {
        System.out.println(name);
    }
    public void getage()
    {
        System.out.println(age);
    }
    public static Builder getBuilder()
    {
        return new Builder();
    }
    public static class Builder
    {
        private String name;
        private int age;
        public Builder setname(String name)
        {
            this.name=name;
            return this;
        }
        public Builder setage(int age)
        {
            this.age=age;
            return this;
        }

        public Student build()
        {
            if(!isvalidname(name))
            {
                throw new IllegalArgumentException("name not giver correctly");
            }
            if(!isvalidage(age))
            {
                throw new IllegalArgumentException("age not valid");
            }
            return new Student(this);

        }
        public boolean isvalidname(String name)
        {
            if(name==null || name.length()==0)
            {
                return false;
            }
            return true;
        }
        public boolean isvalidage(int age)
        {
            if(age<0 && age>120)

            {
                return false;
            }
            return true;
        }
    }

}
