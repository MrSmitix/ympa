package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetOrderLabelsDataResponse;
import java.io.InputStream;
import apimodels.PageFormatType;

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
public class OrderLabelsApiControllerImp extends OrderLabelsApiControllerImpInterface {
    @Override
    public InputStream generateOrderLabel(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream generateOrderLabels(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GetOrderLabelsDataResponse getOrderLabelsData(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetOrderLabelsDataResponse();
    }

}
