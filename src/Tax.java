import java.util.Date;

public interface Tax {
	public abstract Double payTax(Long income, Date startTime, Date endTime);
}
