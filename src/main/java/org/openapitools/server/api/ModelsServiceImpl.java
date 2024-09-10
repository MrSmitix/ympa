package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.GetModelsOffersResponse;
import org.openapitools.server.model.GetModelsRequest;
import org.openapitools.server.model.GetModelsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.SearchModelsResponse;
import org.openapitools.server.model.SortOrderType;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ModelsServiceImpl implements ModelsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void getModel(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getModelOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getModels(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getModelsOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void searchModels(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ModelsService is down. Goodbye!");
    }

}
