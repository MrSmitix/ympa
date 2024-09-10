package org.openapitools.server.api;

import org.openapitools.server.model.AddOffersToArchiveRequest;
import org.openapitools.server.model.AddOffersToArchiveResponse;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.model.DeleteOffersRequest;
import org.openapitools.server.model.DeleteOffersResponse;
import org.openapitools.server.model.GetOfferMappingsRequest;
import org.openapitools.server.model.GetOfferMappingsResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOfferMappingsRequest;
import org.openapitools.server.model.UpdateOfferMappingsResponse;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BusinessOfferMappingsServiceImpl implements BusinessOfferMappingsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void addOffersToArchive(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteOffersFromArchive(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getSuggestedOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BusinessOfferMappingsService is down. Goodbye!");
    }

}
