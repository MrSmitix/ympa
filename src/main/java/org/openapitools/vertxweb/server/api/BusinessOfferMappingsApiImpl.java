package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AddOffersToArchiveRequest;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveResponse;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.vertxweb.server.model.DeleteOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BusinessOfferMappingsApiImpl implements BusinessOfferMappingsApi {
    public Future<ApiResponse<AddOffersToArchiveResponse>> addOffersToArchive(Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteOffersResponse>> deleteOffers(Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteOffersFromArchiveResponse>> deleteOffersFromArchive(Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferMappingsResponse>> getOfferMappings(Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetSuggestedOfferMappingsResponse>> getSuggestedOfferMappings(Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateOfferMappingsResponse>> updateOfferMappings(Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
