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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingsApiControllerImp extends OfferMappingsApiControllerImpInterface {
    @Override
    public GetOfferMappingEntriesResponse getOfferMappingEntries(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOfferMappingEntriesResponse();
    }

    @Override
    public GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntries(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception {
        //Do your magic!!!
        return new GetSuggestedOfferMappingEntriesResponse();
    }

    @Override
    public EmptyApiResponse updateOfferMappingEntries(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
