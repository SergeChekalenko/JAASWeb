package com.managedbean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesView {
     
    private List<String> images;
    private String image1 = "resources/images/dog9.jpg";
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
//        for (int i = 1; i <= 3; i++) {
//            images.add("dog" + i + ".jpg");
//        }
        images.add("dog1.jpg");
        images.add("dog2.jpg");
        images.add("dog3.jpg");
        images.add("dog4.jpg");
        images.add("dog5.jpg");
        images.add("dog6.jpg");
        images.add("dog7.jpg");
        images.add("dog8.jpg");
        images.add("dog9.jpg");
    }
 
    public List<String> getImages() {
        return images;
    }
    
    public String getImage1(){
    	return image1;
    }
    
}
