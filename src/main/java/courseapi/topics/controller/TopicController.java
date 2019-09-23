package courseapi.topics.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import courseapi.services.TopicService;
import courseapi.services.pojo.Topic;

@RestController
public class TopicController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		logger.info("All topics");
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Object getSingleTopic(@PathVariable int id) {
		logger.info("Topic id : "+id);
		try{
			return topicService.getSingleTopic(id);
		}catch(Exception e) {
			return "{\"status\":\"failure\",\"statusText\":\"No topic present\"}";
		}
	}
	
	@RequestMapping(method = {RequestMethod.POST}, path = {"/topics/add"})
	public Topic addAnotherTopic(@RequestBody Topic topic) {
		return topicService.addAnotherTopic(topic);
	}

}
