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
public class ContentApiControllerImp extends ContentApiControllerImpInterface {
    @Override
    public GetCategoryContentParametersResponse getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception {
        //Do your magic!!!
        return new GetCategoryContentParametersResponse();
    }

    @Override
    public GetOfferCardsContentStatusResponse getOfferCardsContentStatus(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception {
        //Do your magic!!!
        return new GetOfferCardsContentStatusResponse();
    }

    @Override
    public UpdateOfferContentResponse updateOfferContent(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOfferContentResponse();
    }

}
