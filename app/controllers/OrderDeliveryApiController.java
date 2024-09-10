package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOrderBuyerInfoResponse;
import apimodels.SetOrderDeliveryDateRequest;
import apimodels.SetOrderDeliveryTrackCodeRequest;
import apimodels.UpdateOrderStorageLimitRequest;
import apimodels.VerifyOrderEacRequest;
import apimodels.VerifyOrderEacResponse;

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
public class OrderDeliveryApiController extends Controller {
    private final OrderDeliveryApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OrderDeliveryApiController(Config configuration, OrderDeliveryApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getOrderBuyerInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBuyerInfoHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result setOrderDeliveryDate(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderDeliveryDateRequest = request.body().asJson();
        SetOrderDeliveryDateRequest setOrderDeliveryDateRequest;
        if (nodesetOrderDeliveryDateRequest != null) {
            setOrderDeliveryDateRequest = mapper.readValue(nodesetOrderDeliveryDateRequest.toString(), SetOrderDeliveryDateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderDeliveryDateRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderDeliveryDateRequest' parameter is required");
        }
        return imp.setOrderDeliveryDateHttp(request, campaignId, orderId, setOrderDeliveryDateRequest);
    }

    @ApiAction
    public Result setOrderDeliveryTrackCode(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderDeliveryTrackCodeRequest = request.body().asJson();
        SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest;
        if (nodesetOrderDeliveryTrackCodeRequest != null) {
            setOrderDeliveryTrackCodeRequest = mapper.readValue(nodesetOrderDeliveryTrackCodeRequest.toString(), SetOrderDeliveryTrackCodeRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderDeliveryTrackCodeRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderDeliveryTrackCodeRequest' parameter is required");
        }
        return imp.setOrderDeliveryTrackCodeHttp(request, campaignId, orderId, setOrderDeliveryTrackCodeRequest);
    }

    @ApiAction
    public Result updateOrderStorageLimit(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderStorageLimitRequest = request.body().asJson();
        UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest;
        if (nodeupdateOrderStorageLimitRequest != null) {
            updateOrderStorageLimitRequest = mapper.readValue(nodeupdateOrderStorageLimitRequest.toString(), UpdateOrderStorageLimitRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStorageLimitRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStorageLimitRequest' parameter is required");
        }
        return imp.updateOrderStorageLimitHttp(request, campaignId, orderId, updateOrderStorageLimitRequest);
    }

    @ApiAction
    public Result verifyOrderEac(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeverifyOrderEacRequest = request.body().asJson();
        VerifyOrderEacRequest verifyOrderEacRequest;
        if (nodeverifyOrderEacRequest != null) {
            verifyOrderEacRequest = mapper.readValue(nodeverifyOrderEacRequest.toString(), VerifyOrderEacRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(verifyOrderEacRequest);
            }
        } else {
            throw new IllegalArgumentException("'VerifyOrderEacRequest' parameter is required");
        }
        return imp.verifyOrderEacHttp(request, campaignId, orderId, verifyOrderEacRequest);
    }

}
