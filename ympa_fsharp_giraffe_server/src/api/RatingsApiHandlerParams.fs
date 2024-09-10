namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingDetailsResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingRequest
open ympa_fsharp_giraffe_server.Model.GetQualityRatingResponse
open System.Collections.Generic
open System

module RatingsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetQualityRatingDetailsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetQualityRatingDetailsStatusCode200Response = {
      content:GetQualityRatingDetailsResponse;
      
    }

    type GetQualityRatingDetailsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetQualityRatingDetailsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetQualityRatingDetailsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetQualityRatingDetailsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetQualityRatingDetailsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetQualityRatingDetailsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetQualityRatingDetailsResult = GetQualityRatingDetailsStatusCode200 of GetQualityRatingDetailsStatusCode200Response|GetQualityRatingDetailsStatusCode400 of GetQualityRatingDetailsStatusCode400Response|GetQualityRatingDetailsStatusCode401 of GetQualityRatingDetailsStatusCode401Response|GetQualityRatingDetailsStatusCode403 of GetQualityRatingDetailsStatusCode403Response|GetQualityRatingDetailsStatusCode404 of GetQualityRatingDetailsStatusCode404Response|GetQualityRatingDetailsStatusCode420 of GetQualityRatingDetailsStatusCode420Response|GetQualityRatingDetailsStatusCode500 of GetQualityRatingDetailsStatusCode500Response

    type GetQualityRatingDetailsArgs = {
      pathParams:GetQualityRatingDetailsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetQualityRatingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetQualityRatingsBodyParams = GetQualityRatingRequest
    //#endregion


    type GetQualityRatingsStatusCode200Response = {
      content:GetQualityRatingResponse;
      
    }

    type GetQualityRatingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetQualityRatingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetQualityRatingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetQualityRatingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetQualityRatingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetQualityRatingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetQualityRatingsResult = GetQualityRatingsStatusCode200 of GetQualityRatingsStatusCode200Response|GetQualityRatingsStatusCode400 of GetQualityRatingsStatusCode400Response|GetQualityRatingsStatusCode401 of GetQualityRatingsStatusCode401Response|GetQualityRatingsStatusCode403 of GetQualityRatingsStatusCode403Response|GetQualityRatingsStatusCode404 of GetQualityRatingsStatusCode404Response|GetQualityRatingsStatusCode420 of GetQualityRatingsStatusCode420Response|GetQualityRatingsStatusCode500 of GetQualityRatingsStatusCode500Response

    type GetQualityRatingsArgs = {
      pathParams:GetQualityRatingsPathParams;
      bodyParams:GetQualityRatingsBodyParams
    }
