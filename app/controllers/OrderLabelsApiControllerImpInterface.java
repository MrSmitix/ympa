package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetOrderLabelsDataResponse;
import java.io.InputStream;
import apimodels.PageFormatType;

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
public abstract class OrderLabelsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result generateOrderLabelHttp(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = generateOrderLabel(request, campaignId, orderId, shipmentId, boxId, format);

        return ok(obj);

    }

    public abstract InputStream generateOrderLabel(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception;

    public Result generateOrderLabelsHttp(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = generateOrderLabels(request, campaignId, orderId, format);

        return ok(obj);

    }

    public abstract InputStream generateOrderLabels(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception;

    public Result getOrderLabelsDataHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderLabelsDataResponse obj = getOrderLabelsData(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderLabelsDataResponse getOrderLabelsData(Http.Request request, Long campaignId, Long orderId) throws Exception;

}
