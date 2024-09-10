package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.ChangeOutletRequest;
import org.openapitools.server.api.model.CreateOutletResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOutletResponse;
import org.openapitools.server.api.model.GetOutletsResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OutletsApi  {
    //createOutlet
    void createOutlet(Long campaignId, ChangeOutletRequest changeOutletRequest, Handler<AsyncResult<CreateOutletResponse>> handler);

    //deleteOutlet
    void deleteOutlet(Long campaignId, Long outletId, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getOutlet
    void getOutlet(Long campaignId, Long outletId, Handler<AsyncResult<GetOutletResponse>> handler);

    //getOutlets
    void getOutlets(Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2, Handler<AsyncResult<GetOutletsResponse>> handler);

    //updateOutlet
    void updateOutlet(Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
