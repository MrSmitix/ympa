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
public class ReturnsApiController extends Controller {
    private final ReturnsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ReturnsApiController(Config configuration, ReturnsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getReturn(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.getReturnHttp(request, campaignId, orderId, returnId);
    }

    @ApiAction
    public Result getReturnApplication(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.getReturnApplicationHttp(request, campaignId, orderId, returnId);
    }

    @ApiAction
    public Result getReturnPhoto(Http.Request request, Long campaignId,Long orderId,Long returnId,Long itemId,String imageHash) throws Exception {
        return imp.getReturnPhotoHttp(request, campaignId, orderId, returnId, itemId, imageHash);
    }

    @ApiAction
    public Result getReturns(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String[] orderIdsArray = request.queryString().get("orderIds");
        List<String> orderIdsList = OpenAPIUtils.parametersToList("csv", orderIdsArray);
        List<Long> orderIds = new ArrayList<>();
        for (String curParam : orderIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                orderIds.add(Long.parseLong(curParam));
            }
        }
        String[] statusesArray = request.queryString().get("statuses");
        List<String> statusesList = OpenAPIUtils.parametersToList("csv", statusesArray);
        List<RefundStatusType> statuses = new ArrayList<>();
        for (String curParam : statusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                statuses.add(curParam);
            }
        }
        String valuetype = request.getQueryString("type");
        ReturnType type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuefromDate = request.getQueryString("fromDate");
        LocalDate fromDate;
        if (valuefromDate != null) {
            fromDate = LocalDate.parse(valuefromDate);
        } else {
            fromDate = null;
        }
        String valuetoDate = request.getQueryString("toDate");
        LocalDate toDate;
        if (valuetoDate != null) {
            toDate = LocalDate.parse(valuetoDate);
        } else {
            toDate = null;
        }
        String valuefromDate2 = request.getQueryString("from_date");
        LocalDate fromDate2;
        if (valuefromDate2 != null) {
            fromDate2 = LocalDate.parse(valuefromDate2);
        } else {
            fromDate2 = null;
        }
        String valuetoDate2 = request.getQueryString("to_date");
        LocalDate toDate2;
        if (valuetoDate2 != null) {
            toDate2 = LocalDate.parse(valuetoDate2);
        } else {
            toDate2 = null;
        }
        return imp.getReturnsHttp(request, campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2);
    }

    @ApiAction
    public Result setReturnDecision(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        JsonNode nodesetReturnDecisionRequest = request.body().asJson();
        SetReturnDecisionRequest setReturnDecisionRequest;
        if (nodesetReturnDecisionRequest != null) {
            setReturnDecisionRequest = mapper.readValue(nodesetReturnDecisionRequest.toString(), SetReturnDecisionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setReturnDecisionRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetReturnDecisionRequest' parameter is required");
        }
        return imp.setReturnDecisionHttp(request, campaignId, orderId, returnId, setReturnDecisionRequest);
    }

    @ApiAction
    public Result submitReturnDecision(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.submitReturnDecisionHttp(request, campaignId, orderId, returnId);
    }

}
