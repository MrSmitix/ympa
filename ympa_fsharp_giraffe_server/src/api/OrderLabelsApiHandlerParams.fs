namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetOrderLabelsDataResponse
open ympa_fsharp_giraffe_server.Model.PageFormatType
open System.Collections.Generic
open System

module OrderLabelsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GenerateOrderLabelPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      shipmentId : int64 ;
    //#endregion
      boxId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GenerateOrderLabelQueryParams = {
      format : PageFormatType option;

    }
    //#endregion


    type GenerateOrderLabelStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type GenerateOrderLabelStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateOrderLabelStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateOrderLabelStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateOrderLabelStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GenerateOrderLabelStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateOrderLabelStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateOrderLabelResult = GenerateOrderLabelStatusCode200 of GenerateOrderLabelStatusCode200Response|GenerateOrderLabelStatusCode400 of GenerateOrderLabelStatusCode400Response|GenerateOrderLabelStatusCode401 of GenerateOrderLabelStatusCode401Response|GenerateOrderLabelStatusCode403 of GenerateOrderLabelStatusCode403Response|GenerateOrderLabelStatusCode404 of GenerateOrderLabelStatusCode404Response|GenerateOrderLabelStatusCode420 of GenerateOrderLabelStatusCode420Response|GenerateOrderLabelStatusCode500 of GenerateOrderLabelStatusCode500Response

    type GenerateOrderLabelArgs = {
      pathParams:GenerateOrderLabelPathParams;
      queryParams:Result<GenerateOrderLabelQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GenerateOrderLabelsPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GenerateOrderLabelsQueryParams = {
      format : PageFormatType option;

    }
    //#endregion


    type GenerateOrderLabelsStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type GenerateOrderLabelsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateOrderLabelsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateOrderLabelsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateOrderLabelsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GenerateOrderLabelsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateOrderLabelsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateOrderLabelsResult = GenerateOrderLabelsStatusCode200 of GenerateOrderLabelsStatusCode200Response|GenerateOrderLabelsStatusCode400 of GenerateOrderLabelsStatusCode400Response|GenerateOrderLabelsStatusCode401 of GenerateOrderLabelsStatusCode401Response|GenerateOrderLabelsStatusCode403 of GenerateOrderLabelsStatusCode403Response|GenerateOrderLabelsStatusCode404 of GenerateOrderLabelsStatusCode404Response|GenerateOrderLabelsStatusCode420 of GenerateOrderLabelsStatusCode420Response|GenerateOrderLabelsStatusCode500 of GenerateOrderLabelsStatusCode500Response

    type GenerateOrderLabelsArgs = {
      pathParams:GenerateOrderLabelsPathParams;
      queryParams:Result<GenerateOrderLabelsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderLabelsDataPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderLabelsDataStatusCode200Response = {
      content:GetOrderLabelsDataResponse;
      
    }

    type GetOrderLabelsDataStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderLabelsDataStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderLabelsDataStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderLabelsDataStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderLabelsDataStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderLabelsDataStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderLabelsDataResult = GetOrderLabelsDataStatusCode200 of GetOrderLabelsDataStatusCode200Response|GetOrderLabelsDataStatusCode400 of GetOrderLabelsDataStatusCode400Response|GetOrderLabelsDataStatusCode401 of GetOrderLabelsDataStatusCode401Response|GetOrderLabelsDataStatusCode403 of GetOrderLabelsDataStatusCode403Response|GetOrderLabelsDataStatusCode404 of GetOrderLabelsDataStatusCode404Response|GetOrderLabelsDataStatusCode420 of GetOrderLabelsDataStatusCode420Response|GetOrderLabelsDataStatusCode500 of GetOrderLabelsDataStatusCode500Response

    type GetOrderLabelsDataArgs = {
      pathParams:GetOrderLabelsDataPathParams;
    }
