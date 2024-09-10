package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteGoodsFeedbackCommentRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetGoodsFeedbackCommentsRequest;
import apimodels.GetGoodsFeedbackCommentsResponse;
import apimodels.GetGoodsFeedbackRequest;
import apimodels.GetGoodsFeedbackResponse;
import apimodels.SkipGoodsFeedbackReactionRequest;
import apimodels.UpdateGoodsFeedbackCommentRequest;
import apimodels.UpdateGoodsFeedbackCommentResponse;

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
public class GoodsFeedbackApiControllerImp extends GoodsFeedbackApiControllerImpInterface {
    @Override
    public EmptyApiResponse deleteGoodsFeedbackComment(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetGoodsFeedbackCommentsResponse();
    }

    @Override
    public GetGoodsFeedbackResponse getGoodsFeedbacks(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception {
        //Do your magic!!!
        return new GetGoodsFeedbackResponse();
    }

    @Override
    public EmptyApiResponse skipGoodsFeedbacksReaction(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception {
        //Do your magic!!!
        return new UpdateGoodsFeedbackCommentResponse();
    }

}
