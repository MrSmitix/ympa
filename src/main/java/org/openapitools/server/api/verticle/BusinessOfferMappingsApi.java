package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AddOffersToArchiveRequest;
import org.openapitools.server.api.model.AddOffersToArchiveResponse;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.api.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.api.model.DeleteOffersRequest;
import org.openapitools.server.api.model.DeleteOffersResponse;
import org.openapitools.server.api.model.GetOfferMappingsRequest;
import org.openapitools.server.api.model.GetOfferMappingsResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferMappingsRequest;
import org.openapitools.server.api.model.UpdateOfferMappingsResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BusinessOfferMappingsApi  {
    //addOffersToArchive
    void addOffersToArchive(Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest, Handler<AsyncResult<AddOffersToArchiveResponse>> handler);

    //deleteOffers
    void deleteOffers(Long businessId, DeleteOffersRequest deleteOffersRequest, Handler<AsyncResult<DeleteOffersResponse>> handler);

    //deleteOffersFromArchive
    void deleteOffersFromArchive(Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest, Handler<AsyncResult<DeleteOffersFromArchiveResponse>> handler);

    //getOfferMappings
    void getOfferMappings(Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest, Handler<AsyncResult<GetOfferMappingsResponse>> handler);

    //getSuggestedOfferMappings
    void getSuggestedOfferMappings(Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest, Handler<AsyncResult<GetSuggestedOfferMappingsResponse>> handler);

    //updateOfferMappings
    void updateOfferMappings(Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest, Handler<AsyncResult<UpdateOfferMappingsResponse>> handler);

}
