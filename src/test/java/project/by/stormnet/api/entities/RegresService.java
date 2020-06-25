package project.by.stormnet.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class RegresService extends AbstractService {
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String postUrl = baseUrlRegres + "/api/users";
    private String putUrl = baseUrlRegres + "/api/users/2";
    private String deleteUrl = baseUrlRegres + "/api/users/2";

    public Response postMorph(String body){
        System.out.println("Create a Morpheus...");
        return client.doPost(postUrl, body);
    }
    public Response putMorph(String body){
        System.out.println("Update a Morpheus...");
        return client.doPut(putUrl, body);
    }
    public Response deleteMorph(){
        System.out.println("Delete a Morpheus...");
        return client.doDelete(deleteUrl);
    }
}
