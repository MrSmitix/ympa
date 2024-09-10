package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeletePromoOffersRequest;
import org.openapitools.vertxweb.server.model.DeletePromoOffersResponse;
import org.openapitools.vertxweb.server.model.GetPromoOffersRequest;
import org.openapitools.vertxweb.server.model.GetPromoOffersResponse;
import org.openapitools.vertxweb.server.model.GetPromosRequest;
import org.openapitools.vertxweb.server.model.GetPromosResponse;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersRequest;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PromosApi  {
    Future<ApiResponse<DeletePromoOffersResponse>> deletePromoOffers(Long businessId, DeletePromoOffersRequest deletePromoOffersRequest);
    Future<ApiResponse<GetPromoOffersResponse>> getPromoOffers(Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit);
    Future<ApiResponse<GetPromosResponse>> getPromos(Long businessId, GetPromosRequest getPromosRequest);
    Future<ApiResponse<UpdatePromoOffersResponse>> updatePromoOffers(Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest);
}
