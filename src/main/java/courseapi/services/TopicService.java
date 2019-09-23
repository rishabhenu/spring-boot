package courseapi.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import courseapi.services.pojo.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic(1,"Maths", "Rishabh Sharma"),
			new Topic(2, "Chemistry", "Sapna Sharma")));
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getSingleTopic(int id) {
		return topics.stream().filter(topic -> topic.getId() == id).findFirst().get();
	}
	
	public Topic addAnotherTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}
}
