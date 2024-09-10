namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetFulfillmentWarehousesResponse
open ympa_fsharp_giraffe_server.Model.GetWarehousesResponse
open System.Collections.Generic
open System

module WarehousesApiHandlerParams =



    type GetFulfillmentWarehousesStatusCode200Response = {
      content:GetFulfillmentWarehousesResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFulfillmentWarehousesResult = GetFulfillmentWarehousesStatusCode200 of GetFulfillmentWarehousesStatusCode200Response|GetFulfillmentWarehousesStatusCode400 of GetFulfillmentWarehousesStatusCode400Response|GetFulfillmentWarehousesStatusCode401 of GetFulfillmentWarehousesStatusCode401Response|GetFulfillmentWarehousesStatusCode403 of GetFulfillmentWarehousesStatusCode403Response|GetFulfillmentWarehousesStatusCode404 of GetFulfillmentWarehousesStatusCode404Response|GetFulfillmentWarehousesStatusCode420 of GetFulfillmentWarehousesStatusCode420Response|GetFulfillmentWarehousesStatusCode500 of GetFulfillmentWarehousesStatusCode500Response

    //#region Path parameters
    [<CLIMutable>]
    type GetWarehousesPathParams = {
      businessId : int64 ;
    }
    //#endregion


    type GetWarehousesStatusCode200Response = {
      content:GetWarehousesResponse;
      
    }

    type GetWarehousesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetWarehousesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetWarehousesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetWarehousesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetWarehousesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetWarehousesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetWarehousesResult = GetWarehousesStatusCode200 of GetWarehousesStatusCode200Response|GetWarehousesStatusCode400 of GetWarehousesStatusCode400Response|GetWarehousesStatusCode401 of GetWarehousesStatusCode401Response|GetWarehousesStatusCode403 of GetWarehousesStatusCode403Response|GetWarehousesStatusCode404 of GetWarehousesStatusCode404Response|GetWarehousesStatusCode420 of GetWarehousesStatusCode420Response|GetWarehousesStatusCode500 of GetWarehousesStatusCode500Response

    type GetWarehousesArgs = {
      pathParams:GetWarehousesPathParams;
    }
