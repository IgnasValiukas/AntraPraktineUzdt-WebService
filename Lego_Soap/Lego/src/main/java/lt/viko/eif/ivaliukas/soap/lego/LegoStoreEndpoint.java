package lt.viko.eif.ivaliukas.soap.lego;

import com.example.legostore.GetLegoStoreRequest;
import com.example.legostore.GetLegoStoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LegoStoreEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/legostore";

    private LegoStoreRepository legoStoreRepository;

    @Autowired
    public LegoStoreEndpoint(LegoStoreRepository legoStoreRepository) {
        this.legoStoreRepository = legoStoreRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLegoStoreRequest")
    @ResponsePayload
    public GetLegoStoreResponse getLegoStore(@RequestPayload GetLegoStoreRequest request) {
        GetLegoStoreResponse response = new GetLegoStoreResponse();
        response.setLegoStore(legoStoreRepository.findLegoStore(request.getName()));

        return response;
    }
}
