package us.ajg0702.leaderboards;

import org.apache.commons.lang.time.DurationFormatUtils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

@SuppressWarnings("unused")
public class TimeUtils {

    public static final long SECOND = 1000L;
    public static final long MINUTE = SECOND * 60L;
    public static final long HOUR = MINUTE * 60L;
    public static final long DAY = HOUR * 24L;
    public static final long WEEK = DAY * 7L;

    private static String timeFormat = "HH'h:'mm'm:'ss's'";

    public static String formatTimeSeconds(long timeSeconds) {
        return formatTimeMs(timeSeconds*1000, true);
    }
    public static String formatTimeSeconds(long timeSeconds, boolean withSeconds) {
        return formatTimeMs(timeSeconds*1000, withSeconds);
    }
    public static String formatTimeMs(long timeMs, boolean withSeconds) {
        return DurationFormatUtils.formatDuration(timeMs, timeFormat);
    }

    public static ZoneOffset getDefaultZoneOffset() {
        return convertToZoneOffset(ZoneOffset.systemDefault());
    }
    public static ZoneOffset convertToZoneOffset(ZoneId zoneId) {
        return zoneId.getRules().getOffset(Instant.now());
    }

    public static void setFormat(String format) {
        timeFormat = format;
    }

}
