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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class OrderDeliveryApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getOrderBuyerInfoHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderBuyerInfoResponse obj = getOrderBuyerInfo(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderBuyerInfoResponse getOrderBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result setOrderDeliveryDateHttp(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setOrderDeliveryDate(request, campaignId, orderId, setOrderDeliveryDateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setOrderDeliveryDate(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws Exception;

    public Result setOrderDeliveryTrackCodeHttp(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setOrderDeliveryTrackCode(request, campaignId, orderId, setOrderDeliveryTrackCodeRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setOrderDeliveryTrackCode(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws Exception;

    public Result updateOrderStorageLimitHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOrderStorageLimit(request, campaignId, orderId, updateOrderStorageLimitRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOrderStorageLimit(Http.Request request, Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws Exception;

    public Result verifyOrderEacHttp(Http.Request request, Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        VerifyOrderEacResponse obj = verifyOrderEac(request, campaignId, orderId, verifyOrderEacRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VerifyOrderEacResponse verifyOrderEac(Http.Request request, Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) throws Exception;

}
