package project.by.stormnet.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.RegresService;

public class ApiRegresTest {
    private project.by.stormnet.api.entities.RegresService RegresService = new RegresService();


    @Test
    public void postMorphTest(){
        String postBodyMorph = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response response = RegresService.postMorph(postBodyMorph);
        int code = response.getCode();
        boolean containsMorph = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 201 && containsMorph, "Morpheus is not available!");
    }

    @Test
    public void putMorphTest(){
        String putBodyMorph = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        Response response = RegresService.putMorph(putBodyMorph);
        int code = response.getCode();
        boolean containsMorph = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 200 && containsMorph, "Morpheus is not available!");
    }

    @Test
    public void deleteMorphTest(){
        Response response = RegresService.deleteMorph();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "Morpheus is not deleted!");
    }
}
