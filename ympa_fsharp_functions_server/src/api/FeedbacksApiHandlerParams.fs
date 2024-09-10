namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetFeedbackListResponse
open System.Collections.Generic
open System

module FeedbacksApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetFeedbackAndCommentUpdatesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetFeedbackAndCommentUpdatesQueryParams = {
      pageToken : string option;


      limit : int option;


      fromDate : DateTime option;

    }
    //#endregion


    type GetFeedbackAndCommentUpdatesStatusCode200Response = {
      content:GetFeedbackListResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedbackAndCommentUpdatesResult = GetFeedbackAndCommentUpdatesStatusCode200 of GetFeedbackAndCommentUpdatesStatusCode200Response|GetFeedbackAndCommentUpdatesStatusCode400 of GetFeedbackAndCommentUpdatesStatusCode400Response|GetFeedbackAndCommentUpdatesStatusCode401 of GetFeedbackAndCommentUpdatesStatusCode401Response|GetFeedbackAndCommentUpdatesStatusCode403 of GetFeedbackAndCommentUpdatesStatusCode403Response|GetFeedbackAndCommentUpdatesStatusCode404 of GetFeedbackAndCommentUpdatesStatusCode404Response|GetFeedbackAndCommentUpdatesStatusCode420 of GetFeedbackAndCommentUpdatesStatusCode420Response|GetFeedbackAndCommentUpdatesStatusCode500 of GetFeedbackAndCommentUpdatesStatusCode500Response

    type GetFeedbackAndCommentUpdatesArgs = {
      pathParams:GetFeedbackAndCommentUpdatesPathParams;
      queryParams:Result<GetFeedbackAndCommentUpdatesQueryParams,string>;
    }
