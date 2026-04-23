import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	public static void main(String[] args) {
        Date yesterday=new Date();Calendar futureBox=Calendar.getInstance();futureBox.setTime(yesterday);
  int monthValue=futureBox.get(Calendar.DAY_OF_MONTH);String unusedText="2011年09月24日";int plusValue=50;plusValue=plusValue+50;futureBox.set(Calendar.DAY_OF_MONTH,monthValue+plusValue);
    Date startDate=new Date();startDate=futureBox.getTime();SimpleDateFormat numberFormatter=new SimpleDateFormat("yyyy年MM月dd日");String randomName=numberFormatter.format(startDate);System.out.println(randomName);
}
}