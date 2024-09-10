package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.GetModelsOffersResponse;
import org.openapitools.vertxweb.server.model.GetModelsRequest;
import org.openapitools.vertxweb.server.model.GetModelsResponse;
import org.openapitools.vertxweb.server.model.SearchModelsResponse;
import org.openapitools.vertxweb.server.model.SortOrderType;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ModelsApi  {
    Future<ApiResponse<GetModelsResponse>> getModel(Long modelId, Long regionId, CurrencyType currency);
    Future<ApiResponse<GetModelsOffersResponse>> getModelOffers(Long modelId, Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count, Integer page);
    Future<ApiResponse<GetModelsResponse>> getModels(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency);
    Future<ApiResponse<GetModelsOffersResponse>> getModelsOffers(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice);
    Future<ApiResponse<SearchModelsResponse>> searchModels(String query, Long regionId, CurrencyType currency, Integer page, Integer pageSize);
}
