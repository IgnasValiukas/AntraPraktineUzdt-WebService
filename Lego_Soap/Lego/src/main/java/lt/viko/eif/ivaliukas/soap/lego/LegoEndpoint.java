package lt.viko.eif.ivaliukas.soap.lego;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.legos.GetLegoResponse;
import com.example.legos.GetLegoRequest;

@Endpoint
public class LegoEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/legos";

    private LegoRepository legoRepository;

    @Autowired
    public LegoEndpoint(LegoRepository legoRepository) {
        this.legoRepository = legoRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLegoRequest")
    @ResponsePayload
    public GetLegoResponse getLego(@RequestPayload GetLegoRequest request) {
        GetLegoResponse response = new GetLegoResponse();
        response.setLego(legoRepository.findLego(request.getName()));

        return response;
    }
}