package adapter;

import adapter.Conference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Conference1 {

    ArrayList<Session1> sessions;

    Conference1(ArrayList session) {
        this.sessions = session;
    }

  
}
class Adapter
{
    Map<String, List<String>> convert(Conference1 conference)
    {
        Map<String, List<String>> speakerSessionMapping = new HashMap<String, List<String>>();
         

        for (Session1 session : conference.sessions)
        {
            String sessionName = session.name;
            String speaker = session.speaker;
            if (!speakerSessionMapping.containsKey(speaker)) {
                speakerSessionMapping.put(speaker, new ArrayList<String>());
            }
            speakerSessionMapping.get(speaker).add(sessionName);

        }
        return speakerSessionMapping;
    }
    
   
}
class Display1 {

    public static void main(String[] args) {
        ArrayList<Session1> sessions = new ArrayList<>();
        Map<String, List<String>> speakerSessionMapping = new HashMap<String, List<String>>();
        Session1 s1 = new Session1("JS", "AAA", "9am");
        Session1 s2 = new Session1("AWS", "BBB", "1pm");
        Session1 s3 = new Session1("JAVA", "AAA", "3pm");

        sessions.add(s1);
        sessions.add(s2);
        sessions.add(s3);
        
        Conference1 conference = new Conference1(sessions);
               
        Adapter adapter=new Adapter();
        speakerSessionMapping=adapter.convert(conference);
         for(Map.Entry m:speakerSessionMapping.entrySet()){  
                System.out.println(m.getKey()+" "+m.getValue());  
  }  
    }
}

class Session1 {

    String name;
    String time;
    String speaker;

    Session1(String name, String speaker, String time) {
        this.name = name;
        this.speaker = speaker;
        this.time = time;
    }

}
