package SS3_LopVaDoiTuongTrongJava.XayDungLopStopWatch;
import java.util.Calendar;
import java.util.Date;
public class StopWatch {
    private Date startTime, endTime;

    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public StopWatch() {
        this.startTime = Calendar.getInstance().getTime();
    }
    public Date start() {
       return  this.startTime = Calendar.getInstance().getTime() ;
    }
    public Date stop(){
        return this.endTime = Calendar.getInstance().getTime();
    }
    public int getElapsedTime(){
        return this.stop().getSeconds() - this.start().getSeconds();
    }
}
