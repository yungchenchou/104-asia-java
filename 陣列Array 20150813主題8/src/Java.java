import java.util.Scanner;
public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("班上有幾位學生?");
		int n=scn.nextInt();
		float a[][]=new float [n][4];
		String b[]=new String[n];
		String c[]=new String [4];
		int d=0;
		int w=0;
		int q=0;
		for(int i=0;i<=n-1;i++){
			System.out.println("請輸入第"+(i+1)+"位同學的名字");
			b[i]=scn.next();
			System.out.println("請依序輸入自然、國文、數學的成績");
			a[i][0]=scn.nextInt();
			a[i][1]=scn.nextInt();
			a[i][2]=scn.nextInt();
			a[i][3]=(a[i][0]+a[i][1]+a[i][2])/3;
		
		if(a[i][0]<60){
			d++;
		}
		if(a[i][1]<60){
			w++;
		}
		if(a[i][2]<60){
			q++;
		}
		}

		int e=0;
		for(int j=0;j<n;j++){
		double f=a[j][0]+a[j][1]+a[j][2];
			e=(int) (e+f);
		}
		float x=e/n;

		int max1=(int)a[0][0];
		int min1=(int)a[0][0];
		for(int k=0;k<n;k++){
			if(a[k][0]>max1){
				max1=(int)a[k][0];
			}
			if(a[k][0]<min1){
				min1=(int)a[k][0];
			}
		}
		int max2=(int)a[0][1];
		int min2=(int)a[0][1];
		for(int u=0;u<n;u++){
			if(a[u][1]>max2){
				max2=(int)a[u][1];
			}
			if(a[u][1]<min2){
				min2=(int)a[u][1];
			}
		}
		int max3=(int)a[0][0];
		int min3=(int)a[0][0];
		for(int y=0;y<n;y++){
			if(a[y][2]>max3){
				max3=(int)a[y][2];
			}
			if(a[y][2]<min1){
				min3=(int)a[y][2];
			}
		}
		c[0]="全班成績平均分數";
		c[1]="不及格人數";
		c[2]="最高分";
		c[3]="最低分";
		System.out.println("全班資料如下:");
		System.out.println("學生姓名"+"\t"+"自然"+"\t"+"國文"+"\t"+"數學"+"\t"+"平均");
		for(int l=0;l<n;l++){
			System.out.println(b[l]+"\t"+a[l][0]+"\t"+a[l][1]+"\t"+a[l][2]+"\t"+a[l][3]);
		}
		System.out.println();
		System.out.println(c[1]+"\t"+d+"人"+"\t"+w+"人"+"\t"+q+"人");
		System.out.println(c[2]+"\t"+max1+"\t"+max2+"\t"+max3);
		System.out.println(c[3]+"\t"+min1+"\t"+min2+"\t"+min3);
		System.out.println(c[0]+"\t"+x);
	}

}

