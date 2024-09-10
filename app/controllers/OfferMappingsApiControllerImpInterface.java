package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOfferMappingEntriesResponse;
import apimodels.GetSuggestedOfferMappingEntriesRequest;
import apimodels.GetSuggestedOfferMappingEntriesResponse;
import apimodels.OfferAvailabilityStatusType;
import apimodels.OfferMappingKindType;
import apimodels.OfferProcessingStatusType;
import apimodels.UpdateOfferMappingEntryRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class OfferMappingsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getOfferMappingEntriesHttp(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferMappingEntriesResponse obj = getOfferMappingEntries(request, campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferMappingEntriesResponse getOfferMappingEntries(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception;

    public Result getSuggestedOfferMappingEntriesHttp(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetSuggestedOfferMappingEntriesResponse obj = getSuggestedOfferMappingEntries(request, campaignId, getSuggestedOfferMappingEntriesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntries(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception;

    public Result updateOfferMappingEntriesHttp(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOfferMappingEntries(request, campaignId, updateOfferMappingEntryRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOfferMappingEntries(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception;

}
