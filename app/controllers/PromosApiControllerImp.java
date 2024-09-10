package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeletePromoOffersRequest;
import apimodels.DeletePromoOffersResponse;
import apimodels.GetPromoOffersRequest;
import apimodels.GetPromoOffersResponse;
import apimodels.GetPromosRequest;
import apimodels.GetPromosResponse;
import apimodels.UpdatePromoOffersRequest;
import apimodels.UpdatePromoOffersResponse;

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
public class PromosApiControllerImp extends PromosApiControllerImpInterface {
    @Override
    public DeletePromoOffersResponse deletePromoOffers(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeletePromoOffersResponse();
    }

    @Override
    public GetPromoOffersResponse getPromoOffers(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetPromoOffersResponse();
    }

    @Override
    public GetPromosResponse getPromos(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception {
        //Do your magic!!!
        return new GetPromosResponse();
    }

    @Override
    public UpdatePromoOffersResponse updatePromoOffers(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception {
        //Do your magic!!!
        return new UpdatePromoOffersResponse();
    }

}
