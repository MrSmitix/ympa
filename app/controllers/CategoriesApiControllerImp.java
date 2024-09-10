package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetCategoriesMaxSaleQuantumRequest;
import apimodels.GetCategoriesMaxSaleQuantumResponse;
import apimodels.GetCategoriesRequest;
import apimodels.GetCategoriesResponse;

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
public class CategoriesApiControllerImp extends CategoriesApiControllerImpInterface {
    @Override
    public GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception {
        //Do your magic!!!
        return new GetCategoriesMaxSaleQuantumResponse();
    }

    @Override
    public GetCategoriesResponse getCategoriesTree(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception {
        //Do your magic!!!
        return new GetCategoriesResponse();
    }

}
