package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeletePromoOffersRequest;
import org.openapitools.server.api.model.DeletePromoOffersResponse;
import org.openapitools.server.api.model.GetPromoOffersRequest;
import org.openapitools.server.api.model.GetPromoOffersResponse;
import org.openapitools.server.api.model.GetPromosRequest;
import org.openapitools.server.api.model.GetPromosResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdatePromoOffersRequest;
import org.openapitools.server.api.model.UpdatePromoOffersResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PromosApi  {
    //deletePromoOffers
    void deletePromoOffers(Long businessId, DeletePromoOffersRequest deletePromoOffersRequest, Handler<AsyncResult<DeletePromoOffersResponse>> handler);

    //getPromoOffers
    void getPromoOffers(Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetPromoOffersResponse>> handler);

    //getPromos
    void getPromos(Long businessId, GetPromosRequest getPromosRequest, Handler<AsyncResult<GetPromosResponse>> handler);

    //updatePromoOffers
    void updatePromoOffers(Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest, Handler<AsyncResult<UpdatePromoOffersResponse>> handler);

}
