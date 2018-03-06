package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Conference {

    ArrayList<Session> sessions;

    Conference(ArrayList session) {
        this.sessions = session;
    }

    public Map returnlist() {

        Map<String, List<String>> speakerSessionMapping = new HashMap<String, List<String>>();
        for (Session session : sessions) {
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

class Display {

    public static void main(String[] args) {
        ArrayList<Session> sessions = new ArrayList<>();
        Map<String, List<String>> speakerSessionMapping = new HashMap<String, List<String>>();
        Session s1 = new Session("JS", "AAA", "9am");
        Session s2 = new Session("AWS", "BBB", "1pm");
        Session s3 = new Session("JAVA", "AAA", "3pm");

        sessions.add(s1);
        sessions.add(s2);
        sessions.add(s3);
        Conference conference = new Conference(sessions);
        speakerSessionMapping=conference.returnlist();
         for(Map.Entry m:speakerSessionMapping.entrySet()){  
                System.out.println(m.getKey()+" "+m.getValue());  
  }  
    }
}

class Session {

    String name;
    String time;
    String speaker;

    Session(String name, String speaker, String time) {
        this.name = name;
        this.speaker = speaker;
        this.time = time;
    }

}
