package com.basetools.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import androidx.annotation.IntDef;

/**
 * 房间类型
 * @author gaopengfei on 2019/10/18.
 */
@IntDef({
        RoomType.VIDEO_CALL,
        RoomType.VOICE_CALL,
        RoomType.RANDOM_VIDEO_CALL,
        RoomType.RANDOM_VOICE_CALL
})
@Retention(RetentionPolicy.SOURCE)
public @interface RoomType {
    /** 一对一视频 */
    int VIDEO_CALL = 8;
    /** 一对一语音 */
    int VOICE_CALL = 9;
    /** 随机视频 */
    int RANDOM_VIDEO_CALL = 11;
    /** 随机语音 */
    int RANDOM_VOICE_CALL = 12;
}
