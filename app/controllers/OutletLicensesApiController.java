package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOutletLicensesResponse;
import java.util.Set;
import apimodels.UpdateOutletLicenseRequest;

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
public class OutletLicensesApiController extends Controller {
    private final OutletLicensesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OutletLicensesApiController(Config configuration, OutletLicensesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        String[] idsArray = request.queryString().get("ids");
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        Set<Long> ids = new LinkedHashSet<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(Long.parseLong(curParam));
            }
        }
        return imp.deleteOutletLicensesHttp(request, campaignId, ids);
    }

    @ApiAction
    public Result getOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        String[] outletIdsArray = request.queryString().get("outletIds");
        List<String> outletIdsList = OpenAPIUtils.parametersToList("csv", outletIdsArray);
        Set<Long> outletIds = new LinkedHashSet<>();
        for (String curParam : outletIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                outletIds.add(Long.parseLong(curParam));
            }
        }
        String[] idsArray = request.queryString().get("ids");
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        Set<Long> ids = new LinkedHashSet<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(Long.parseLong(curParam));
            }
        }
        return imp.getOutletLicensesHttp(request, campaignId, outletIds, ids);
    }

    @ApiAction
    public Result updateOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOutletLicenseRequest = request.body().asJson();
        UpdateOutletLicenseRequest updateOutletLicenseRequest;
        if (nodeupdateOutletLicenseRequest != null) {
            updateOutletLicenseRequest = mapper.readValue(nodeupdateOutletLicenseRequest.toString(), UpdateOutletLicenseRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOutletLicenseRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOutletLicenseRequest' parameter is required");
        }
        return imp.updateOutletLicensesHttp(request, campaignId, updateOutletLicenseRequest);
    }

}
