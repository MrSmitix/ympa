namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetReturnResponse
open ympa_fsharp_giraffe_server.Model.GetReturnsResponse
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReturnType
open ympa_fsharp_giraffe_server.Model.SetReturnDecisionRequest
open System.Collections.Generic
open System

module ReturnsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetReturnPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    }
    //#endregion


    type GetReturnStatusCode200Response = {
      content:GetReturnResponse;
      
    }

    type GetReturnStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnResult = GetReturnStatusCode200 of GetReturnStatusCode200Response|GetReturnStatusCode400 of GetReturnStatusCode400Response|GetReturnStatusCode401 of GetReturnStatusCode401Response|GetReturnStatusCode403 of GetReturnStatusCode403Response|GetReturnStatusCode404 of GetReturnStatusCode404Response|GetReturnStatusCode420 of GetReturnStatusCode420Response|GetReturnStatusCode500 of GetReturnStatusCode500Response

    type GetReturnArgs = {
      pathParams:GetReturnPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnApplicationPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    }
    //#endregion


    type GetReturnApplicationStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type GetReturnApplicationStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnApplicationStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnApplicationStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnApplicationStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnApplicationStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnApplicationStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnApplicationResult = GetReturnApplicationStatusCode200 of GetReturnApplicationStatusCode200Response|GetReturnApplicationStatusCode400 of GetReturnApplicationStatusCode400Response|GetReturnApplicationStatusCode401 of GetReturnApplicationStatusCode401Response|GetReturnApplicationStatusCode403 of GetReturnApplicationStatusCode403Response|GetReturnApplicationStatusCode404 of GetReturnApplicationStatusCode404Response|GetReturnApplicationStatusCode420 of GetReturnApplicationStatusCode420Response|GetReturnApplicationStatusCode500 of GetReturnApplicationStatusCode500Response

    type GetReturnApplicationArgs = {
      pathParams:GetReturnApplicationPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnPhotoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    //#endregion
      itemId : int64 ;
    //#endregion
      imageHash : string ;
    }
    //#endregion


    type GetReturnPhotoStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type GetReturnPhotoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnPhotoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnPhotoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnPhotoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnPhotoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnPhotoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnPhotoResult = GetReturnPhotoStatusCode200 of GetReturnPhotoStatusCode200Response|GetReturnPhotoStatusCode400 of GetReturnPhotoStatusCode400Response|GetReturnPhotoStatusCode401 of GetReturnPhotoStatusCode401Response|GetReturnPhotoStatusCode403 of GetReturnPhotoStatusCode403Response|GetReturnPhotoStatusCode404 of GetReturnPhotoStatusCode404Response|GetReturnPhotoStatusCode420 of GetReturnPhotoStatusCode420Response|GetReturnPhotoStatusCode500 of GetReturnPhotoStatusCode500Response

    type GetReturnPhotoArgs = {
      pathParams:GetReturnPhotoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetReturnsQueryParams = {
      pageToken : string option;


      limit : int option;


      orderIds : int64[] option;


      statuses : RefundStatusType[] option;


      _type : ReturnType option;


      fromDate : DateTime option;


      toDate : DateTime option;


      fromDate2 : DateTime option;


      toDate2 : DateTime option;

    }
    //#endregion


    type GetReturnsStatusCode200Response = {
      content:GetReturnsResponse;
      
    }

    type GetReturnsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnsResult = GetReturnsStatusCode200 of GetReturnsStatusCode200Response|GetReturnsStatusCode400 of GetReturnsStatusCode400Response|GetReturnsStatusCode401 of GetReturnsStatusCode401Response|GetReturnsStatusCode403 of GetReturnsStatusCode403Response|GetReturnsStatusCode404 of GetReturnsStatusCode404Response|GetReturnsStatusCode420 of GetReturnsStatusCode420Response|GetReturnsStatusCode500 of GetReturnsStatusCode500Response

    type GetReturnsArgs = {
      pathParams:GetReturnsPathParams;
      queryParams:Result<GetReturnsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetReturnDecisionPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetReturnDecisionBodyParams = SetReturnDecisionRequest
    //#endregion


    type SetReturnDecisionStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetReturnDecisionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetReturnDecisionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetReturnDecisionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetReturnDecisionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetReturnDecisionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetReturnDecisionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetReturnDecisionResult = SetReturnDecisionStatusCode200 of SetReturnDecisionStatusCode200Response|SetReturnDecisionStatusCode400 of SetReturnDecisionStatusCode400Response|SetReturnDecisionStatusCode401 of SetReturnDecisionStatusCode401Response|SetReturnDecisionStatusCode403 of SetReturnDecisionStatusCode403Response|SetReturnDecisionStatusCode404 of SetReturnDecisionStatusCode404Response|SetReturnDecisionStatusCode420 of SetReturnDecisionStatusCode420Response|SetReturnDecisionStatusCode500 of SetReturnDecisionStatusCode500Response

    type SetReturnDecisionArgs = {
      pathParams:SetReturnDecisionPathParams;
      bodyParams:SetReturnDecisionBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SubmitReturnDecisionPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    }
    //#endregion


    type SubmitReturnDecisionStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SubmitReturnDecisionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SubmitReturnDecisionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SubmitReturnDecisionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SubmitReturnDecisionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SubmitReturnDecisionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SubmitReturnDecisionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SubmitReturnDecisionResult = SubmitReturnDecisionStatusCode200 of SubmitReturnDecisionStatusCode200Response|SubmitReturnDecisionStatusCode400 of SubmitReturnDecisionStatusCode400Response|SubmitReturnDecisionStatusCode401 of SubmitReturnDecisionStatusCode401Response|SubmitReturnDecisionStatusCode403 of SubmitReturnDecisionStatusCode403Response|SubmitReturnDecisionStatusCode404 of SubmitReturnDecisionStatusCode404Response|SubmitReturnDecisionStatusCode420 of SubmitReturnDecisionStatusCode420Response|SubmitReturnDecisionStatusCode500 of SubmitReturnDecisionStatusCode500Response

    type SubmitReturnDecisionArgs = {
      pathParams:SubmitReturnDecisionPathParams;
    }
