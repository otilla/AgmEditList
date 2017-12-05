package kr.co.otilla.agmeditlist;

import android.graphics.Bitmap;

/**
 * Created by devangelma on 2017-12-05.
 */

public class ContentData {
    public Bitmap Bmp;
    public String FileName;
    public String FilePath;
    public String FileSize;

    public ContentData()
    {

    }

    public ContentData(Bitmap Bmp, String FileName, String FilePath, String FileSize)
    {
        this.Bmp = Bmp;
        this.FileName = FileName;
        this.FilePath = FilePath;
        this.FileSize = FileSize;
    }
}
