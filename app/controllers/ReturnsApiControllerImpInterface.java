package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetReturnResponse;
import apimodels.GetReturnsResponse;
import java.io.InputStream;
import java.time.LocalDate;
import apimodels.RefundStatusType;
import apimodels.ReturnType;
import apimodels.SetReturnDecisionRequest;

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
public abstract class ReturnsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getReturnHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReturnResponse obj = getReturn(request, campaignId, orderId, returnId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReturnResponse getReturn(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

    public Result getReturnApplicationHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = getReturnApplication(request, campaignId, orderId, returnId);

        return ok(obj);

    }

    public abstract InputStream getReturnApplication(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

    public Result getReturnPhotoHttp(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = getReturnPhoto(request, campaignId, orderId, returnId, itemId, imageHash);

        return ok(obj);

    }

    public abstract InputStream getReturnPhoto(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception;

    public Result getReturnsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReturnsResponse obj = getReturns(request, campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReturnsResponse getReturns(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception;

    public Result setReturnDecisionHttp(Http.Request request, Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setReturnDecision(request, campaignId, orderId, returnId, setReturnDecisionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) throws Exception;

    public Result submitReturnDecisionHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = submitReturnDecision(request, campaignId, orderId, returnId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse submitReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

}
