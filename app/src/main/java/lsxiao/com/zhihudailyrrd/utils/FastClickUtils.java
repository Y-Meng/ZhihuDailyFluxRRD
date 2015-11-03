package lsxiao.com.zhihudailyrrd.utils;
/**
 * @author lsxiao
 * @date 2015-11-03 22:28
 */
public class FastClickUtils {
	private static long lastClickTime;

	public static boolean isFastDoubleClick() {
		long time = System.currentTimeMillis();
		long timeD = time - lastClickTime;
		if (0 < timeD && timeD < 400) {
			return true;
		}
		lastClickTime = time;
		return false;
	}
}
