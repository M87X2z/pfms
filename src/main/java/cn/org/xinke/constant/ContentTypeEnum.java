package cn.org.xinke.constant;

/**
 * @description 文件内容类型枚举
 * @author cinco
 * @date 2019-1-28
 */
public enum ContentTypeEnum {

    /**
     * pdf文件
     */
    APPLICATION_PDF("application/pdf"),

    /**
     * 文本文件
     */
    TXT_PLAIN("text/plain"),

    /**
     * 图片
     */
    IMAGE_PNG("image/png"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_GIF("image/gif"),

    /**
     * 视频
     */
    VIDEO_MP4("video/mp4"),

    /**
     * 音频
     */
    AUDIO_MPEG("audio/mpeg"),

    /**
     * html文件
     */
    TEXT_HTML("text/html"),
    APPLICATION_XHTML_XML("application/xhtml+xml");

    private String name;

    ContentTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
