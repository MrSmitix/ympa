package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesResponse;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.OfferAvailabilityStatusType;
import org.openapitools.server.model.OfferMappingKindType;
import org.openapitools.server.model.OfferProcessingStatusType;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOfferMappingEntryRequest;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class OfferMappingsServiceImpl implements OfferMappingsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void getOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getSuggestedOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service OfferMappingsService is down. Goodbye!");
    }

}
