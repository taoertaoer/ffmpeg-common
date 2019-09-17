package com.ffmpeg.common;

import com.ffmpeg.common.response.Result;
import com.ffmpeg.common.video.VideoOperation;
import org.junit.Test;

import java.io.IOException;

/**
 * @auther alan.chen
 * @time 2019/9/11 3:11 PM
 */
public class test {

    private static final String ffmpegEXE = "/Users/alan.chen/Documents/notes/ffmpeg";

    @Test
    public void testConver() throws IOException {
        String inputPath = "/Users/alan.chen/Documents/notes/test/2222.mp4";
        String outPutPath = "/Users/alan.chen/Documents/notes/test/1/convert.mp4";
        VideoOperation ffmpeg = VideoOperation.builder(ffmpegEXE);
        Result result = ffmpeg.videoConvert(inputPath, outPutPath);
        System.out.println(result.getCode());
        System.out.println(result.getErrMessage());
    }

    @Test
    public void videoRotate() throws IOException {
        String inputPath = "/Users/alan.chen/Documents/notes/test/2222.mp4";
        String outPutPath = "/Users/alan.chen/Documents/notes/test/1/rotate.mp4";
        VideoOperation ffmpeg = VideoOperation.builder(ffmpegEXE);
        Result result = ffmpeg.videoRotate(inputPath,2,"","" , outPutPath);
        System.out.println(result.getCode());
        System.out.println(result.getErrMessage());
    }

}
