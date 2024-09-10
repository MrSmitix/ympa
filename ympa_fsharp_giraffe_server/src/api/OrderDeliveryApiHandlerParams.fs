namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOrderBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryDateRequest
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryTrackCodeRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStorageLimitRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacResponse
open System.Collections.Generic
open System

module OrderDeliveryApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetOrderBuyerInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderBuyerInfoStatusCode200Response = {
      content:GetOrderBuyerInfoResponse;
      
    }

    type GetOrderBuyerInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderBuyerInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderBuyerInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderBuyerInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderBuyerInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderBuyerInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderBuyerInfoResult = GetOrderBuyerInfoStatusCode200 of GetOrderBuyerInfoStatusCode200Response|GetOrderBuyerInfoStatusCode400 of GetOrderBuyerInfoStatusCode400Response|GetOrderBuyerInfoStatusCode401 of GetOrderBuyerInfoStatusCode401Response|GetOrderBuyerInfoStatusCode403 of GetOrderBuyerInfoStatusCode403Response|GetOrderBuyerInfoStatusCode404 of GetOrderBuyerInfoStatusCode404Response|GetOrderBuyerInfoStatusCode420 of GetOrderBuyerInfoStatusCode420Response|GetOrderBuyerInfoStatusCode500 of GetOrderBuyerInfoStatusCode500Response

    type GetOrderBuyerInfoArgs = {
      pathParams:GetOrderBuyerInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetOrderDeliveryDatePathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetOrderDeliveryDateBodyParams = SetOrderDeliveryDateRequest
    //#endregion


    type SetOrderDeliveryDateStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetOrderDeliveryDateStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetOrderDeliveryDateStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetOrderDeliveryDateStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetOrderDeliveryDateStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetOrderDeliveryDateStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetOrderDeliveryDateStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetOrderDeliveryDateResult = SetOrderDeliveryDateStatusCode200 of SetOrderDeliveryDateStatusCode200Response|SetOrderDeliveryDateStatusCode400 of SetOrderDeliveryDateStatusCode400Response|SetOrderDeliveryDateStatusCode401 of SetOrderDeliveryDateStatusCode401Response|SetOrderDeliveryDateStatusCode403 of SetOrderDeliveryDateStatusCode403Response|SetOrderDeliveryDateStatusCode404 of SetOrderDeliveryDateStatusCode404Response|SetOrderDeliveryDateStatusCode420 of SetOrderDeliveryDateStatusCode420Response|SetOrderDeliveryDateStatusCode500 of SetOrderDeliveryDateStatusCode500Response

    type SetOrderDeliveryDateArgs = {
      pathParams:SetOrderDeliveryDatePathParams;
      bodyParams:SetOrderDeliveryDateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetOrderDeliveryTrackCodePathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetOrderDeliveryTrackCodeBodyParams = SetOrderDeliveryTrackCodeRequest
    //#endregion


    type SetOrderDeliveryTrackCodeStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetOrderDeliveryTrackCodeStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetOrderDeliveryTrackCodeResult = SetOrderDeliveryTrackCodeStatusCode200 of SetOrderDeliveryTrackCodeStatusCode200Response|SetOrderDeliveryTrackCodeStatusCode400 of SetOrderDeliveryTrackCodeStatusCode400Response|SetOrderDeliveryTrackCodeStatusCode401 of SetOrderDeliveryTrackCodeStatusCode401Response|SetOrderDeliveryTrackCodeStatusCode403 of SetOrderDeliveryTrackCodeStatusCode403Response|SetOrderDeliveryTrackCodeStatusCode404 of SetOrderDeliveryTrackCodeStatusCode404Response|SetOrderDeliveryTrackCodeStatusCode420 of SetOrderDeliveryTrackCodeStatusCode420Response|SetOrderDeliveryTrackCodeStatusCode500 of SetOrderDeliveryTrackCodeStatusCode500Response

    type SetOrderDeliveryTrackCodeArgs = {
      pathParams:SetOrderDeliveryTrackCodePathParams;
      bodyParams:SetOrderDeliveryTrackCodeBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOrderStorageLimitPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOrderStorageLimitBodyParams = UpdateOrderStorageLimitRequest
    //#endregion


    type UpdateOrderStorageLimitStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOrderStorageLimitStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOrderStorageLimitResult = UpdateOrderStorageLimitStatusCode200 of UpdateOrderStorageLimitStatusCode200Response|UpdateOrderStorageLimitStatusCode400 of UpdateOrderStorageLimitStatusCode400Response|UpdateOrderStorageLimitStatusCode401 of UpdateOrderStorageLimitStatusCode401Response|UpdateOrderStorageLimitStatusCode403 of UpdateOrderStorageLimitStatusCode403Response|UpdateOrderStorageLimitStatusCode404 of UpdateOrderStorageLimitStatusCode404Response|UpdateOrderStorageLimitStatusCode420 of UpdateOrderStorageLimitStatusCode420Response|UpdateOrderStorageLimitStatusCode500 of UpdateOrderStorageLimitStatusCode500Response

    type UpdateOrderStorageLimitArgs = {
      pathParams:UpdateOrderStorageLimitPathParams;
      bodyParams:UpdateOrderStorageLimitBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type VerifyOrderEacPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type VerifyOrderEacBodyParams = VerifyOrderEacRequest
    //#endregion


    type VerifyOrderEacStatusCode200Response = {
      content:VerifyOrderEacResponse;
      
    }

    type VerifyOrderEacStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type VerifyOrderEacStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type VerifyOrderEacStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type VerifyOrderEacStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type VerifyOrderEacStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type VerifyOrderEacStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type VerifyOrderEacResult = VerifyOrderEacStatusCode200 of VerifyOrderEacStatusCode200Response|VerifyOrderEacStatusCode400 of VerifyOrderEacStatusCode400Response|VerifyOrderEacStatusCode401 of VerifyOrderEacStatusCode401Response|VerifyOrderEacStatusCode403 of VerifyOrderEacStatusCode403Response|VerifyOrderEacStatusCode404 of VerifyOrderEacStatusCode404Response|VerifyOrderEacStatusCode420 of VerifyOrderEacStatusCode420Response|VerifyOrderEacStatusCode500 of VerifyOrderEacStatusCode500Response

    type VerifyOrderEacArgs = {
      pathParams:VerifyOrderEacPathParams;
      bodyParams:VerifyOrderEacBodyParams
    }
