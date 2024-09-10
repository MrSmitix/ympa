package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeletePromoOffersRequest;
import org.openapitools.server.model.DeletePromoOffersResponse;
import org.openapitools.server.model.GetPromoOffersRequest;
import org.openapitools.server.model.GetPromoOffersResponse;
import org.openapitools.server.model.GetPromosRequest;
import org.openapitools.server.model.GetPromosResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdatePromoOffersRequest;
import org.openapitools.server.model.UpdatePromoOffersResponse;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class PromosServiceImpl implements PromosService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void deletePromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPromos(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updatePromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service PromosService is down. Goodbye!");
    }

}
