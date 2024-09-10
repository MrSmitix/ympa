package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetBusinessBuyerInfoResponse;
import apimodels.GetBusinessDocumentsInfoResponse;

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
public class OrderBusinessInformationApiController extends Controller {
    private final OrderBusinessInformationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OrderBusinessInformationApiController(Config configuration, OrderBusinessInformationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getOrderBusinessBuyerInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBusinessBuyerInfoHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrderBusinessDocumentsInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBusinessDocumentsInfoHttp(request, campaignId, orderId);
    }

}
