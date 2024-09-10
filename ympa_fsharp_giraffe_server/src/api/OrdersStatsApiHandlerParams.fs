namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsRequest
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsResponse
open System.Collections.Generic
open System

module OrdersStatsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetOrdersStatsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOrdersStatsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOrdersStatsBodyParams = GetOrdersStatsRequest
    //#endregion


    type GetOrdersStatsStatusCode200Response = {
      content:GetOrdersStatsResponse;
      
    }

    type GetOrdersStatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrdersStatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrdersStatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrdersStatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrdersStatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrdersStatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrdersStatsResult = GetOrdersStatsStatusCode200 of GetOrdersStatsStatusCode200Response|GetOrdersStatsStatusCode400 of GetOrdersStatsStatusCode400Response|GetOrdersStatsStatusCode401 of GetOrdersStatsStatusCode401Response|GetOrdersStatsStatusCode403 of GetOrdersStatsStatusCode403Response|GetOrdersStatsStatusCode404 of GetOrdersStatsStatusCode404Response|GetOrdersStatsStatusCode420 of GetOrdersStatsStatusCode420Response|GetOrdersStatsStatusCode500 of GetOrdersStatsStatusCode500Response

    type GetOrdersStatsArgs = {
      pathParams:GetOrdersStatsPathParams;
      queryParams:Result<GetOrdersStatsQueryParams,string>;
      bodyParams:GetOrdersStatsBodyParams
    }
