package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.DeleteCampaignOffersRequest;
import org.openapitools.server.model.DeleteCampaignOffersResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetAllOffersResponse;
import org.openapitools.server.model.GetCampaignOffersRequest;
import org.openapitools.server.model.GetCampaignOffersResponse;
import org.openapitools.server.model.GetOfferRecommendationsRequest;
import org.openapitools.server.model.GetOfferRecommendationsResponse;
import org.openapitools.server.model.GetOffersResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateCampaignOffersRequest;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class OffersServiceImpl implements OffersService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void deleteCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getAllOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferRecommendations(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service OffersService is down. Goodbye!");
    }

}
