package controllers;

import apimodels.AddOffersToArchiveRequest;
import apimodels.AddOffersToArchiveResponse;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteOffersFromArchiveRequest;
import apimodels.DeleteOffersFromArchiveResponse;
import apimodels.DeleteOffersRequest;
import apimodels.DeleteOffersResponse;
import apimodels.GetOfferMappingsRequest;
import apimodels.GetOfferMappingsResponse;
import apimodels.GetSuggestedOfferMappingsRequest;
import apimodels.GetSuggestedOfferMappingsResponse;
import apimodels.UpdateOfferMappingsRequest;
import apimodels.UpdateOfferMappingsResponse;

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
public class BusinessOfferMappingsApiControllerImp extends BusinessOfferMappingsApiControllerImpInterface {
    @Override
    public AddOffersToArchiveResponse addOffersToArchive(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception {
        //Do your magic!!!
        return new AddOffersToArchiveResponse();
    }

    @Override
    public DeleteOffersResponse deleteOffers(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeleteOffersResponse();
    }

    @Override
    public DeleteOffersFromArchiveResponse deleteOffersFromArchive(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception {
        //Do your magic!!!
        return new DeleteOffersFromArchiveResponse();
    }

    @Override
    public GetOfferMappingsResponse getOfferMappings(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new GetOfferMappingsResponse();
    }

    @Override
    public GetSuggestedOfferMappingsResponse getSuggestedOfferMappings(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new GetSuggestedOfferMappingsResponse();
    }

    @Override
    public UpdateOfferMappingsResponse updateOfferMappings(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOfferMappingsResponse();
    }

}
