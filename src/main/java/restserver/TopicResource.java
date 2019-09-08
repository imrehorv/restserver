package restserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import restserver.model.Topic;

@Path("/topics")
public class TopicResource {

	Logger logger=Logger.getLogger(TopicResource.class.getName());
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTopics()
	{
		logger.info("getTopics called");
		
		List<Topic> topiclist=new ArrayList<Topic>();
		
		Topic topic=new Topic();
		topiclist.add(topic);
		topic.setId(10);
		topic.setName("1. topic");
		
		topic=new Topic();
		topiclist.add(topic);
		topic.setId(20);
		topic.setName("2. topic");
		
		return Response.ok().entity(topiclist).build();
	}
	
}
