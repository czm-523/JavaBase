package designpatterns.singleton;

public class Singleton{

	/**
	 * ����һ���Ǵ�˵���еĶ���ģʽ
	 * �ŵ��ǣ�д�����Ƚϼ򵥣����Ҳ����ڶ��߳�ͬ�����⣬������synchronized����ɵ��������⣻
	 * ȱ���ǣ�����SingletonTest�����ص�ʱ�򣬻��ʼ��static��instance����̬�����������������ڴ�ռ䣬
	 * �����Ժ����static��instance�����һֱռ������ڴ棨�����㻹û���õ����ʵ���������౻ж��ʱ����̬�������ݻ٣�
	 * ���ͷ���ռ�е��ڴ棬�����ĳЩ�ض������»�ķ��ڴ档
	 */
//	private Singleton(){}
//	private static final Singleton instance = new Singleton();
//	public static Singleton getInstance(){
//		return instance;
//	}
  
	
	/**
	 * ������Ϊ�������ļ��Ż�
	 *	�ŵ��ǣ�ʹ��synchronized�ؼ��ֱ�����̷߳���ʱ�����ֶ��SingletonTestʵ����
	 *	ȱ���ǣ�ͬ������Ƶ������ʱ��Ч���Ե͡�
	 */
//	public Singleton(){}
//	public static Singleton instance = null;
//	public static synchronized Singleton getInstance(){
//		if(instance == null){
//			instance =  new Singleton();
//		}
//		return instance;
//	}
	
	
	/**
	 * ������Ϊ����ģʽ�����ʵ�֡��ڴ�ռ�õأ�Ч�ʸߣ��̰߳�ȫ�����̲߳���ԭ���ԡ�
	 */
	    private static class LazyHolder {    
	       private static final Singleton INSTANCE = new Singleton();    
	    }    
	    private Singleton (){}    
	    public static final Singleton getInstance() {    
	       return LazyHolder.INSTANCE;    
	    }    

}
