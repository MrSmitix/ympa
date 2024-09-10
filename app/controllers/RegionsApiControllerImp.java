package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetRegionWithChildrenResponse;
import apimodels.GetRegionsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionsApiControllerImp extends RegionsApiControllerImpInterface {
    @Override
    public GetRegionWithChildrenResponse searchRegionChildren(Http.Request request, Long regionId,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetRegionWithChildrenResponse();
    }

    @Override
    public GetRegionsResponse searchRegionsById(Http.Request request, Long regionId) throws Exception {
        //Do your magic!!!
        return new GetRegionsResponse();
    }

    @Override
    public GetRegionsResponse searchRegionsByName(Http.Request request, @NotNull String name, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetRegionsResponse();
    }

}
