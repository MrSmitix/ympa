package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.CurrencyType;
import apimodels.GetModelsOffersResponse;
import apimodels.GetModelsRequest;
import apimodels.GetModelsResponse;
import apimodels.SearchModelsResponse;
import apimodels.SortOrderType;

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
public class ModelsApiControllerImp extends ModelsApiControllerImpInterface {
    @Override
    public GetModelsResponse getModel(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency) throws Exception {
        //Do your magic!!!
        return new GetModelsResponse();
    }

    @Override
    public GetModelsOffersResponse getModelOffers(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count,  @Max(10000)Integer page) throws Exception {
        //Do your magic!!!
        return new GetModelsOffersResponse();
    }

    @Override
    public GetModelsResponse getModels(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency) throws Exception {
        //Do your magic!!!
        return new GetModelsResponse();
    }

    @Override
    public GetModelsOffersResponse getModelsOffers(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice) throws Exception {
        //Do your magic!!!
        return new GetModelsOffersResponse();
    }

    @Override
    public SearchModelsResponse searchModels(Http.Request request, @NotNull String query, @NotNull Long regionId, CurrencyType currency,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new SearchModelsResponse();
    }

}
