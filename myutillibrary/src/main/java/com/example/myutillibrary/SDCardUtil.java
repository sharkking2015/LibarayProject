package com.example.myutillibrary;

import android.graphics.Bitmap;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yfb on 2018/3/27.
 */

public class SDCardUtil {

    public static void saveBitmapToSDCard(Bitmap bmp, String dir, String path){
        File f = new File(dir);
        if(!f.exists()){
            f.mkdir();
        }
        f = new File(path);
        BufferedOutputStream bos = null;
        try {
            try {
                bos = new BufferedOutputStream(new FileOutputStream(f));
                bmp.compress(Bitmap.CompressFormat.PNG,100,bos);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if(bos != null){
                    bos.close();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
