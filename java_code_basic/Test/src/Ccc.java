public class Ccc implements jiekou {



    int max = 0;
    int a = 0;
    int b = 0;
    public Ccc(int a,int b)
    {
        this.a = a;
        this.b = b;

    }

    public int max() {

        if(a>b){
            max = a;
        }
        else
        {
            max = b;
        }

        System.out.println(max);
        return max;
    }

    public int min(){
        return b;
        }
}
