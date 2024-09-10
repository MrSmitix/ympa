package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ConfirmPricesRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetQuarantineOffersRequest;
import apimodels.GetQuarantineOffersResponse;

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
public class PriceQuarantineApiControllerImp extends PriceQuarantineApiControllerImpInterface {
    @Override
    public EmptyApiResponse confirmBusinessPrices(Http.Request request, Long businessId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse confirmCampaignPrices(Http.Request request, Long campaignId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetQuarantineOffersResponse getBusinessQuarantineOffers(Http.Request request, Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetQuarantineOffersResponse();
    }

    @Override
    public GetQuarantineOffersResponse getCampaignQuarantineOffers(Http.Request request, Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetQuarantineOffersResponse();
    }

}
