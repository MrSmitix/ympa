package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetQualityRatingDetailsResponse;
import apimodels.GetQualityRatingRequest;
import apimodels.GetQualityRatingResponse;

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
public class RatingsApiController extends Controller {
    private final RatingsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RatingsApiController(Config configuration, RatingsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getQualityRatingDetails(Http.Request request, Long campaignId) throws Exception {
        return imp.getQualityRatingDetailsHttp(request, campaignId);
    }

    @ApiAction
    public Result getQualityRatings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetQualityRatingRequest = request.body().asJson();
        GetQualityRatingRequest getQualityRatingRequest;
        if (nodegetQualityRatingRequest != null) {
            getQualityRatingRequest = mapper.readValue(nodegetQualityRatingRequest.toString(), GetQualityRatingRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQualityRatingRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQualityRatingRequest' parameter is required");
        }
        return imp.getQualityRatingsHttp(request, businessId, getQualityRatingRequest);
    }

}
