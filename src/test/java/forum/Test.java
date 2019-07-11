package forum;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.forum.common.MyUtils;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String pwd = MyUtils.sHAEncrypt("12345");
		System.out.println(pwd);
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//		String date1 = df.format(new Date()).toString();//返回当前日期的字符串格式
//		Timestamp date2 = new Timestamp(System.currentTimeMillis());
//		System.out.println(date2);
//		System.out.println(Timestamp.valueOf(date1));
//		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//        System.out.println(uuid);
	}
}
