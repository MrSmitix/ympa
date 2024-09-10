package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetOrdersStatsRequest;
import apimodels.GetOrdersStatsResponse;

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
public abstract class OrdersStatsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getOrdersStatsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrdersStatsResponse obj = getOrdersStats(request, campaignId, pageToken, limit, getOrdersStatsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrdersStatsResponse getOrdersStats(Http.Request request, Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) throws Exception;

}
