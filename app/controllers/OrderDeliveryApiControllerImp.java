package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOrderBuyerInfoResponse;
import apimodels.SetOrderDeliveryDateRequest;
import apimodels.SetOrderDeliveryTrackCodeRequest;
import apimodels.UpdateOrderStorageLimitRequest;
import apimodels.VerifyOrderEacRequest;
import apimodels.VerifyOrderEacResponse;

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
public class OrderDeliveryApiControllerImp extends OrderDeliveryApiControllerImpInterface {
    @Override
    public GetOrderBuyerInfoResponse getOrderBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetOrderBuyerInfoResponse();
    }

    @Override
    public EmptyApiResponse setOrderDeliveryDate(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse setOrderDeliveryTrackCode(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse updateOrderStorageLimit(Http.Request request, Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public VerifyOrderEacResponse verifyOrderEac(Http.Request request, Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) throws Exception {
        //Do your magic!!!
        return new VerifyOrderEacResponse();
    }

}
