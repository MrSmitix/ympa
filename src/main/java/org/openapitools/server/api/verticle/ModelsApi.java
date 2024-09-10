package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.GetModelsOffersResponse;
import org.openapitools.server.api.model.GetModelsRequest;
import org.openapitools.server.api.model.GetModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SearchModelsResponse;
import org.openapitools.server.api.model.SortOrderType;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ModelsApi  {
    //getModel
    void getModel(Long modelId, Long regionId, CurrencyType currency, Handler<AsyncResult<GetModelsResponse>> handler);

    //getModelOffers
    void getModelOffers(Long modelId, Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count, Integer page, Handler<AsyncResult<GetModelsOffersResponse>> handler);

    //getModels
    void getModels(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, Handler<AsyncResult<GetModelsResponse>> handler);

    //getModelsOffers
    void getModelsOffers(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, Handler<AsyncResult<GetModelsOffersResponse>> handler);

    //searchModels
    void searchModels(String query, Long regionId, CurrencyType currency, Integer page, Integer pageSize, Handler<AsyncResult<SearchModelsResponse>> handler);

}
