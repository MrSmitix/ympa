package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ChangeOutletRequest;
import apimodels.CreateOutletResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOutletResponse;
import apimodels.GetOutletsResponse;

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
public class OutletsApiControllerImp extends OutletsApiControllerImpInterface {
    @Override
    public CreateOutletResponse createOutlet(Http.Request request, Long campaignId, ChangeOutletRequest changeOutletRequest) throws Exception {
        //Do your magic!!!
        return new CreateOutletResponse();
    }

    @Override
    public EmptyApiResponse deleteOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetOutletResponse getOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception {
        //Do your magic!!!
        return new GetOutletResponse();
    }

    @Override
    public GetOutletsResponse getOutlets(Http.Request request, Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) throws Exception {
        //Do your magic!!!
        return new GetOutletsResponse();
    }

    @Override
    public EmptyApiResponse updateOutlet(Http.Request request, Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
