package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetReturnResponse;
import apimodels.GetReturnsResponse;
import java.io.InputStream;
import java.time.LocalDate;
import apimodels.RefundStatusType;
import apimodels.ReturnType;
import apimodels.SetReturnDecisionRequest;

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
public class ReturnsApiControllerImp extends ReturnsApiControllerImpInterface {
    @Override
    public GetReturnResponse getReturn(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        //Do your magic!!!
        return new GetReturnResponse();
    }

    @Override
    public InputStream getReturnApplication(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream getReturnPhoto(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GetReturnsResponse getReturns(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception {
        //Do your magic!!!
        return new GetReturnsResponse();
    }

    @Override
    public EmptyApiResponse setReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse submitReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
