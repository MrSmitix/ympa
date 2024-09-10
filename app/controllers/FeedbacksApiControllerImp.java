package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetFeedbackListResponse;
import java.time.LocalDate;

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
public class FeedbacksApiControllerImp extends FeedbacksApiControllerImpInterface {
    @Override
    public GetFeedbackListResponse getFeedbackAndCommentUpdates(Http.Request request, Long campaignId, String pageToken, Integer limit, LocalDate fromDate) throws Exception {
        //Do your magic!!!
        return new GetFeedbackListResponse();
    }

}
