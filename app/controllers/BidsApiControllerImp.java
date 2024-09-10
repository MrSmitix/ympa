package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetBidsInfoRequest;
import apimodels.GetBidsInfoResponse;
import apimodels.GetBidsRecommendationsRequest;
import apimodels.GetBidsRecommendationsResponse;
import apimodels.PutSkuBidsRequest;

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
public class BidsApiControllerImp extends BidsApiControllerImpInterface {
    @Override
    public GetBidsInfoResponse getBidsInfoForBusiness(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception {
        //Do your magic!!!
        return new GetBidsInfoResponse();
    }

    @Override
    public GetBidsRecommendationsResponse getBidsRecommendations(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception {
        //Do your magic!!!
        return new GetBidsRecommendationsResponse();
    }

    @Override
    public EmptyApiResponse putBidsForBusiness(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse putBidsForCampaign(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
