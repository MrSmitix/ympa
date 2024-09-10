namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.DeleteGoodsFeedbackCommentRequest
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetGoodsFeedbackCommentsRequest
open ympa_fsharp_functions_server.Model.GetGoodsFeedbackCommentsResponse
open ympa_fsharp_functions_server.Model.GetGoodsFeedbackRequest
open ympa_fsharp_functions_server.Model.GetGoodsFeedbackResponse
open ympa_fsharp_functions_server.Model.SkipGoodsFeedbackReactionRequest
open ympa_fsharp_functions_server.Model.UpdateGoodsFeedbackCommentRequest
open ympa_fsharp_functions_server.Model.UpdateGoodsFeedbackCommentResponse
open System.Collections.Generic
open System

module GoodsFeedbackApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteGoodsFeedbackCommentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteGoodsFeedbackCommentBodyParams = DeleteGoodsFeedbackCommentRequest
    //#endregion


    type DeleteGoodsFeedbackCommentStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteGoodsFeedbackCommentResult = DeleteGoodsFeedbackCommentStatusCode200 of DeleteGoodsFeedbackCommentStatusCode200Response|DeleteGoodsFeedbackCommentStatusCode400 of DeleteGoodsFeedbackCommentStatusCode400Response|DeleteGoodsFeedbackCommentStatusCode401 of DeleteGoodsFeedbackCommentStatusCode401Response|DeleteGoodsFeedbackCommentStatusCode403 of DeleteGoodsFeedbackCommentStatusCode403Response|DeleteGoodsFeedbackCommentStatusCode404 of DeleteGoodsFeedbackCommentStatusCode404Response|DeleteGoodsFeedbackCommentStatusCode420 of DeleteGoodsFeedbackCommentStatusCode420Response|DeleteGoodsFeedbackCommentStatusCode500 of DeleteGoodsFeedbackCommentStatusCode500Response

    type DeleteGoodsFeedbackCommentArgs = {
      pathParams:DeleteGoodsFeedbackCommentPathParams;
      bodyParams:DeleteGoodsFeedbackCommentBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsBodyParams = GetGoodsFeedbackCommentsRequest
    //#endregion


    type GetGoodsFeedbackCommentsStatusCode200Response = {
      content:GetGoodsFeedbackCommentsResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsFeedbackCommentsResult = GetGoodsFeedbackCommentsStatusCode200 of GetGoodsFeedbackCommentsStatusCode200Response|GetGoodsFeedbackCommentsStatusCode400 of GetGoodsFeedbackCommentsStatusCode400Response|GetGoodsFeedbackCommentsStatusCode401 of GetGoodsFeedbackCommentsStatusCode401Response|GetGoodsFeedbackCommentsStatusCode403 of GetGoodsFeedbackCommentsStatusCode403Response|GetGoodsFeedbackCommentsStatusCode404 of GetGoodsFeedbackCommentsStatusCode404Response|GetGoodsFeedbackCommentsStatusCode420 of GetGoodsFeedbackCommentsStatusCode420Response|GetGoodsFeedbackCommentsStatusCode500 of GetGoodsFeedbackCommentsStatusCode500Response

    type GetGoodsFeedbackCommentsArgs = {
      pathParams:GetGoodsFeedbackCommentsPathParams;
      queryParams:Result<GetGoodsFeedbackCommentsQueryParams,string>;
      bodyParams:GetGoodsFeedbackCommentsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksBodyParams = GetGoodsFeedbackRequest
    //#endregion


    type GetGoodsFeedbacksStatusCode200Response = {
      content:GetGoodsFeedbackResponse;
      
    }

    type GetGoodsFeedbacksStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsFeedbacksResult = GetGoodsFeedbacksStatusCode200 of GetGoodsFeedbacksStatusCode200Response|GetGoodsFeedbacksStatusCode400 of GetGoodsFeedbacksStatusCode400Response|GetGoodsFeedbacksStatusCode401 of GetGoodsFeedbacksStatusCode401Response|GetGoodsFeedbacksStatusCode403 of GetGoodsFeedbacksStatusCode403Response|GetGoodsFeedbacksStatusCode404 of GetGoodsFeedbacksStatusCode404Response|GetGoodsFeedbacksStatusCode420 of GetGoodsFeedbacksStatusCode420Response|GetGoodsFeedbacksStatusCode500 of GetGoodsFeedbacksStatusCode500Response

    type GetGoodsFeedbacksArgs = {
      pathParams:GetGoodsFeedbacksPathParams;
      queryParams:Result<GetGoodsFeedbacksQueryParams,string>;
      bodyParams:GetGoodsFeedbacksBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SkipGoodsFeedbacksReactionPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SkipGoodsFeedbacksReactionBodyParams = SkipGoodsFeedbackReactionRequest
    //#endregion


    type SkipGoodsFeedbacksReactionStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SkipGoodsFeedbacksReactionResult = SkipGoodsFeedbacksReactionStatusCode200 of SkipGoodsFeedbacksReactionStatusCode200Response|SkipGoodsFeedbacksReactionStatusCode400 of SkipGoodsFeedbacksReactionStatusCode400Response|SkipGoodsFeedbacksReactionStatusCode401 of SkipGoodsFeedbacksReactionStatusCode401Response|SkipGoodsFeedbacksReactionStatusCode403 of SkipGoodsFeedbacksReactionStatusCode403Response|SkipGoodsFeedbacksReactionStatusCode404 of SkipGoodsFeedbacksReactionStatusCode404Response|SkipGoodsFeedbacksReactionStatusCode420 of SkipGoodsFeedbacksReactionStatusCode420Response|SkipGoodsFeedbacksReactionStatusCode500 of SkipGoodsFeedbacksReactionStatusCode500Response

    type SkipGoodsFeedbacksReactionArgs = {
      pathParams:SkipGoodsFeedbacksReactionPathParams;
      bodyParams:SkipGoodsFeedbacksReactionBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateGoodsFeedbackCommentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateGoodsFeedbackCommentBodyParams = UpdateGoodsFeedbackCommentRequest
    //#endregion


    type UpdateGoodsFeedbackCommentStatusCode200Response = {
      content:UpdateGoodsFeedbackCommentResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateGoodsFeedbackCommentResult = UpdateGoodsFeedbackCommentStatusCode200 of UpdateGoodsFeedbackCommentStatusCode200Response|UpdateGoodsFeedbackCommentStatusCode400 of UpdateGoodsFeedbackCommentStatusCode400Response|UpdateGoodsFeedbackCommentStatusCode401 of UpdateGoodsFeedbackCommentStatusCode401Response|UpdateGoodsFeedbackCommentStatusCode403 of UpdateGoodsFeedbackCommentStatusCode403Response|UpdateGoodsFeedbackCommentStatusCode404 of UpdateGoodsFeedbackCommentStatusCode404Response|UpdateGoodsFeedbackCommentStatusCode420 of UpdateGoodsFeedbackCommentStatusCode420Response|UpdateGoodsFeedbackCommentStatusCode500 of UpdateGoodsFeedbackCommentStatusCode500Response

    type UpdateGoodsFeedbackCommentArgs = {
      pathParams:UpdateGoodsFeedbackCommentPathParams;
      bodyParams:UpdateGoodsFeedbackCommentBodyParams
    }
