package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ChangeOutletRequest;
import apimodels.CreateOutletResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOutletResponse;
import apimodels.GetOutletsResponse;

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
public abstract class OutletsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createOutletHttp(Http.Request request, Long campaignId, ChangeOutletRequest changeOutletRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        CreateOutletResponse obj = createOutlet(request, campaignId, changeOutletRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateOutletResponse createOutlet(Http.Request request, Long campaignId, ChangeOutletRequest changeOutletRequest) throws Exception;

    public Result deleteOutletHttp(Http.Request request, Long campaignId, Long outletId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteOutlet(request, campaignId, outletId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception;

    public Result getOutletHttp(Http.Request request, Long campaignId, Long outletId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOutletResponse obj = getOutlet(request, campaignId, outletId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOutletResponse getOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception;

    public Result getOutletsHttp(Http.Request request, Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOutletsResponse obj = getOutlets(request, campaignId, pageToken, regionId, shopOutletCode, regionId2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOutletsResponse getOutlets(Http.Request request, Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) throws Exception;

    public Result updateOutletHttp(Http.Request request, Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOutlet(request, campaignId, outletId, changeOutletRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOutlet(Http.Request request, Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) throws Exception;

}
