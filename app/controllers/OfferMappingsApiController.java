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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingsApiController extends Controller {
    private final OfferMappingsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OfferMappingsApiController(Config configuration, OfferMappingsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        String[] offerIdArray = request.queryString().get("offer_id");
        List<String> offerIdList = OpenAPIUtils.parametersToList("csv", offerIdArray);
        List<String> offerId = new ArrayList<>();
        for (String curParam : offerIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                offerId.add(curParam);
            }
        }
        String[] shopSkuArray = request.queryString().get("shop_sku");
        List<String> shopSkuList = OpenAPIUtils.parametersToList("csv", shopSkuArray);
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku = new ArrayList<>();
        for (String curParam : shopSkuList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                shopSku.add(curParam);
            }
        }
        String valuemappingKind = request.getQueryString("mapping_kind");
        OfferMappingKindType mappingKind;
        if (valuemappingKind != null) {
            mappingKind = valuemappingKind;
        } else {
            mappingKind = null;
        }
        String[] statusArray = request.queryString().get("status");
        List<String> statusList = OpenAPIUtils.parametersToList("csv", statusArray);
        List<OfferProcessingStatusType> status = new ArrayList<>();
        for (String curParam : statusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                status.add(curParam);
            }
        }
        String[] availabilityArray = request.queryString().get("availability");
        List<String> availabilityList = OpenAPIUtils.parametersToList("csv", availabilityArray);
        List<OfferAvailabilityStatusType> availability = new ArrayList<>();
        for (String curParam : availabilityList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                availability.add(curParam);
            }
        }
        String[] categoryIdArray = request.queryString().get("category_id");
        List<String> categoryIdList = OpenAPIUtils.parametersToList("csv", categoryIdArray);
        List<Integer> categoryId = new ArrayList<>();
        for (String curParam : categoryIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                categoryId.add(Integer.parseInt(curParam));
            }
        }
        String[] vendorArray = request.queryString().get("vendor");
        List<String> vendorList = OpenAPIUtils.parametersToList("csv", vendorArray);
        List<String> vendor = new ArrayList<>();
        for (String curParam : vendorList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                vendor.add(curParam);
            }
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferMappingEntriesHttp(request, campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit);
    }

    @ApiAction
    public Result getSuggestedOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetSuggestedOfferMappingEntriesRequest = request.body().asJson();
        GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest;
        if (nodegetSuggestedOfferMappingEntriesRequest != null) {
            getSuggestedOfferMappingEntriesRequest = mapper.readValue(nodegetSuggestedOfferMappingEntriesRequest.toString(), GetSuggestedOfferMappingEntriesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getSuggestedOfferMappingEntriesRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetSuggestedOfferMappingEntriesRequest' parameter is required");
        }
        return imp.getSuggestedOfferMappingEntriesHttp(request, campaignId, getSuggestedOfferMappingEntriesRequest);
    }

    @ApiAction
    public Result updateOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOfferMappingEntryRequest = request.body().asJson();
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest;
        if (nodeupdateOfferMappingEntryRequest != null) {
            updateOfferMappingEntryRequest = mapper.readValue(nodeupdateOfferMappingEntryRequest.toString(), UpdateOfferMappingEntryRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferMappingEntryRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferMappingEntryRequest' parameter is required");
        }
        return imp.updateOfferMappingEntriesHttp(request, campaignId, updateOfferMappingEntryRequest);
    }

}
