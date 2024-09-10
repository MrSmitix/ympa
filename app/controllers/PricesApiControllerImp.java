package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetPricesByOfferIdsRequest;
import apimodels.GetPricesByOfferIdsResponse;
import apimodels.GetPricesResponse;
import apimodels.SuggestPricesRequest;
import apimodels.SuggestPricesResponse;
import apimodels.UpdateBusinessPricesRequest;
import apimodels.UpdatePricesRequest;

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
public class PricesApiControllerImp extends PricesApiControllerImpInterface {
    @Override
    public GetPricesResponse getPrices(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception {
        //Do your magic!!!
        return new GetPricesResponse();
    }

    @Override
    public GetPricesByOfferIdsResponse getPricesByOfferIds(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception {
        //Do your magic!!!
        return new GetPricesByOfferIdsResponse();
    }

    @Override
    public SuggestPricesResponse getSuggestedPrices(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception {
        //Do your magic!!!
        return new SuggestPricesResponse();
    }

    @Override
    public EmptyApiResponse updateBusinessPrices(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse updatePrices(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
