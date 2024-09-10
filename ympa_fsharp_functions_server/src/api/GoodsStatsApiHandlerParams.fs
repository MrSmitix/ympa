namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetGoodsStatsRequest
open ympa_fsharp_functions_server.Model.GetGoodsStatsResponse
open System.Collections.Generic
open System

module GoodsStatsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsStatsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsStatsBodyParams = GetGoodsStatsRequest
    //#endregion


    type GetGoodsStatsStatusCode200Response = {
      content:GetGoodsStatsResponse;
      
    }

    type GetGoodsStatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsStatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsStatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsStatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsStatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsStatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsStatsResult = GetGoodsStatsStatusCode200 of GetGoodsStatsStatusCode200Response|GetGoodsStatsStatusCode400 of GetGoodsStatsStatusCode400Response|GetGoodsStatsStatusCode401 of GetGoodsStatsStatusCode401Response|GetGoodsStatsStatusCode403 of GetGoodsStatsStatusCode403Response|GetGoodsStatsStatusCode404 of GetGoodsStatsStatusCode404Response|GetGoodsStatsStatusCode420 of GetGoodsStatsStatusCode420Response|GetGoodsStatsStatusCode500 of GetGoodsStatsStatusCode500Response

    type GetGoodsStatsArgs = {
      pathParams:GetGoodsStatsPathParams;
      bodyParams:GetGoodsStatsBodyParams
    }
