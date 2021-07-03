package _20_Casetudy.utils;

import java.io.File;
import java.util.List;

public interface InterFaceByteStream<T> {
    List<T> readFileByteStream(File path);

    void writeFileByteStream(List<T> ts, File path);
    void clearData(File path);
}
