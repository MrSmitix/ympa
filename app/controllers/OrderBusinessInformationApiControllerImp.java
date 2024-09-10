package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetBusinessBuyerInfoResponse;
import apimodels.GetBusinessDocumentsInfoResponse;

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
public class OrderBusinessInformationApiControllerImp extends OrderBusinessInformationApiControllerImpInterface {
    @Override
    public GetBusinessBuyerInfoResponse getOrderBusinessBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetBusinessBuyerInfoResponse();
    }

    @Override
    public GetBusinessDocumentsInfoResponse getOrderBusinessDocumentsInfo(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetBusinessDocumentsInfoResponse();
    }

}
