package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.OfferAvailabilityStatusType;
import org.openapitools.vertxweb.server.model.OfferMappingKindType;
import org.openapitools.vertxweb.server.model.OfferProcessingStatusType;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingEntryRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OfferMappingsApi  {
    Future<ApiResponse<GetOfferMappingEntriesResponse>> getOfferMappingEntries(Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit);
    Future<ApiResponse<GetSuggestedOfferMappingEntriesResponse>> getSuggestedOfferMappingEntries(Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest);
    Future<ApiResponse<EmptyApiResponse>> updateOfferMappingEntries(Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest);
}
