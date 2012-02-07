package study.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {

	public static void main(String[] args) {
//        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
//        Image image2 = new ProxyImage("HiRes_10MB_Photo2");     
//
//        image1.displayImage(); // loading necessary
//        image2.displayImage(); // loading necessary
		
		
		 List<Image> images = new ArrayList<Image>();

         images.add(new ProxyImage("HiRes_10MB_Photo1"));

         images.add(new ProxyImage("HiRes_10MB_Photo2"));

         images.add(new ProxyImage("HiRes_10MB_Photo3"));


        images.get(0).displayImage(); // Loading�� �ʿ��մϴ�.

         images.get(1).displayImage(); // Loading�� �ʿ��մϴ�.

         images.get(0).displayImage(); // Loading�� �ʿ����� �ʽ��ϴ�.

    }



/*
 * List<Image> images = new ArrayList<Image>();

             images.add(new ProxyImage("HiRes_10MB_Photo1"));

             images.add(new ProxyImage("HiRes_10MB_Photo2"));

             images.add(new ProxyImage("HiRes_10MB_Photo3"));

 

            images.get(0).displayImage(); // Loading�� �ʿ��մϴ�.

             images.get(1).displayImage(); // Loading�� �ʿ��մϴ�.

             images.get(0).displayImage(); // Loading�� �ʿ����� �ʽ��ϴ�.

             //����° displayImage() �޼ҵ忡 ���ؼ��� ���� ��ü�� �������� �ʽ��ϴ�.

 * 
 * */
}
