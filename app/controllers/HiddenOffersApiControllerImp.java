package controllers;

import apimodels.AddHiddenOffersRequest;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteHiddenOffersRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetHiddenOffersResponse;

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
public class HiddenOffersApiControllerImp extends HiddenOffersApiControllerImpInterface {
    @Override
    public EmptyApiResponse addHiddenOffers(Http.Request request, Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse deleteHiddenOffers(Http.Request request, Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetHiddenOffersResponse getHiddenOffers(Http.Request request, Long campaignId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId, String pageToken, Integer limit, Integer offset,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetHiddenOffersResponse();
    }

}
