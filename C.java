import java.util.*;
class C{
	String[]x=new String[10]; 
	public static void main(String[]a){new C(a[0]);}
	C(String c){I p=new I();int[]d=d(c,p);for(int i=0;i<10;i++)if(x[i]!=null)System.out.println(x[i]+": "+d[i]);}
	int[]d(String c,I p){int[]f;int i,j;Vector<int[]>s=new Vector();while(p.v<c.length()){char q=c.charAt(p.v);if(q=='(')s.add(d(c,p.i()));if(q==')')break;if(q>='A'&&q<='Z'){f=new int[10];char[]d=new char[]{c.charAt(p.v),0};i=1;if(c.length()-1>p.v){d[1]=c.charAt(p.v+1);if(d[1]>='a'&&d[1]<='z'){i++;p.i();}}String h=new String(d,0,i);i=0;for(String k:x){if(k==null){x[i]=h;break;}if(k.equals(h))break;i++;}f[i]++;s.add(f);}if(q>='0'&&q<='9'){j=c.charAt(p.v)-'0';f=s.get(s.size()-1);for(i=0;i<10;)f[i++]*=j;}p.i();}f=new int[10];for(int[]w:s){j=0;for(int k:w)f[j++]+=k;}return f;}
	class I{int v=0;I i(){v++;return this;}}
}

