package cn.org.xinke.util;

import cn.org.xinke.constant.ContentTypeEnum;
import org.springframework.util.StringUtils;

/**
 * @description 文件类型检测工具类
 * @author cinco
 * @date 2019-1-28
 */
public class FileTypeUtil {

    /**
     * 根据内容类型检测文件是否支持浏览器在线预览
     *
     * @param contentType
     * @return boolean
     */
    public static final boolean canOnlinePreview(String contentType) {
        boolean flag = false;
        if (StringUtils.isEmpty(contentType)) {
            return false;
        }
        if (contentType.equals(ContentTypeEnum.APPLICATION_PDF.getName()) ||
            contentType.equals(ContentTypeEnum.TXT_PLAIN.getName()) ||
            contentType.equals(ContentTypeEnum.IMAGE_GIF.getName()) ||
            contentType.equals(ContentTypeEnum.IMAGE_JPEG.getName()) ||
            contentType.equals(ContentTypeEnum.IMAGE_PNG.getName()) ||
            contentType.equals(ContentTypeEnum.VIDEO_MP4.getName()) ||
            contentType.equals(ContentTypeEnum.AUDIO_MPEG.getName()) ||
            contentType.equals(ContentTypeEnum.TEXT_HTML.getName()) ||
            contentType.equals(ContentTypeEnum.APPLICATION_XHTML_XML.getName())) {
            flag = true;
        }
        return flag;
    }
}
