package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetCategoryContentParametersResponse;
import apimodels.GetOfferCardsContentStatusRequest;
import apimodels.GetOfferCardsContentStatusResponse;
import apimodels.UpdateOfferContentRequest;
import apimodels.UpdateOfferContentResponse;

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
public abstract class ContentApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCategoryContentParametersHttp(Http.Request request, Long categoryId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoryContentParametersResponse obj = getCategoryContentParameters(request, categoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoryContentParametersResponse getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception;

    public Result getOfferCardsContentStatusHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferCardsContentStatusResponse obj = getOfferCardsContentStatus(request, businessId, pageToken, limit, getOfferCardsContentStatusRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferCardsContentStatusResponse getOfferCardsContentStatus(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception;

    public Result updateOfferContentHttp(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOfferContentResponse obj = updateOfferContent(request, businessId, updateOfferContentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOfferContentResponse updateOfferContent(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception;

}
