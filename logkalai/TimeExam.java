package logkalai;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExam {
	 public static void main(String[] args) {    
		   LocalDate date = LocalDate.now();    
		   LocalDate yesterday = date.minusDays(1);    
		   
		   LocalDate tomorrow = yesterday.plusDays(2);    
		   System.out.println("Today date: "+date);    
		   System.out.println("Yesterday date: "+yesterday);    
		   System.out.println("Tomorrow date: "+tomorrow);  
		   
		   LocalTime time=LocalTime.now();
		   System.out.println(time);
		   
		   LocalDateTime a=LocalDateTime.now();
		   System.out.println(a);
		   
		   LocalDate b=LocalDate.of(1999, 8, 27);
		   System.out.println(b);
		   
		   Period gap=Period.between(b,date);
		   System.out.println("differe,ance btw "+gap);
		   
		   
		   
		   
		  DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd-MMM-yyy");
		   System.out.println(b.format(dft));
		   
		   ZonedDateTime zdt=ZonedDateTime.now();
		   System.out.println(zdt);
		   
		   ZonedDateTime centralestern=LocalDateTime.now().atZone(ZoneId.of("CET"));
		   System.out.println(centralestern);
		   
		  // for(String zone:ZoneId.getAvailableZoneIds()) {
		    //System.out.println(zone);
		    
		  // }
		   
		  LocalTime time1=LocalTime.now();
		  System.out.println(time1);
		  Duration fiveHours=Duration.ofHours(5);
		   LocalTime time2=time1.plus(fiveHours);
		   System.out.println(time2);
		    
		   Duration x =Duration.between(time2,time1);
		   System.out.println(x);
		   
		   
		   YearMonth ym = YearMonth.now();  
		   System.out.println(ym);  
		   
		   
		   ZoneId zone=ZoneId.systemDefault();
		   System.out.println(zone);
		   
		   DayOfWeek dweek=LocalDate.parse("1999-08-27").getDayOfWeek();
		   System.out.println(dweek);
		   
		   
		   ZoneOffset z=ZoneOffset.ofHours(5);
		   System.out.println(z);
		   
		   
		   
		   
		   
		   
		 }  
		 }  


