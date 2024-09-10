namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessDocumentsInfoResponse
open System.Collections.Generic
open System

module OrderBusinessInformationApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetOrderBusinessBuyerInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderBusinessBuyerInfoStatusCode200Response = {
      content:GetBusinessBuyerInfoResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderBusinessBuyerInfoResult = GetOrderBusinessBuyerInfoStatusCode200 of GetOrderBusinessBuyerInfoStatusCode200Response|GetOrderBusinessBuyerInfoStatusCode400 of GetOrderBusinessBuyerInfoStatusCode400Response|GetOrderBusinessBuyerInfoStatusCode401 of GetOrderBusinessBuyerInfoStatusCode401Response|GetOrderBusinessBuyerInfoStatusCode403 of GetOrderBusinessBuyerInfoStatusCode403Response|GetOrderBusinessBuyerInfoStatusCode404 of GetOrderBusinessBuyerInfoStatusCode404Response|GetOrderBusinessBuyerInfoStatusCode420 of GetOrderBusinessBuyerInfoStatusCode420Response|GetOrderBusinessBuyerInfoStatusCode500 of GetOrderBusinessBuyerInfoStatusCode500Response

    type GetOrderBusinessBuyerInfoArgs = {
      pathParams:GetOrderBusinessBuyerInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderBusinessDocumentsInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderBusinessDocumentsInfoStatusCode200Response = {
      content:GetBusinessDocumentsInfoResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderBusinessDocumentsInfoResult = GetOrderBusinessDocumentsInfoStatusCode200 of GetOrderBusinessDocumentsInfoStatusCode200Response|GetOrderBusinessDocumentsInfoStatusCode400 of GetOrderBusinessDocumentsInfoStatusCode400Response|GetOrderBusinessDocumentsInfoStatusCode401 of GetOrderBusinessDocumentsInfoStatusCode401Response|GetOrderBusinessDocumentsInfoStatusCode403 of GetOrderBusinessDocumentsInfoStatusCode403Response|GetOrderBusinessDocumentsInfoStatusCode404 of GetOrderBusinessDocumentsInfoStatusCode404Response|GetOrderBusinessDocumentsInfoStatusCode420 of GetOrderBusinessDocumentsInfoStatusCode420Response|GetOrderBusinessDocumentsInfoStatusCode500 of GetOrderBusinessDocumentsInfoStatusCode500Response

    type GetOrderBusinessDocumentsInfoArgs = {
      pathParams:GetOrderBusinessDocumentsInfoPathParams;
    }
