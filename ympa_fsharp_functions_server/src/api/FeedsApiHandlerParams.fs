namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.FeedIndexLogsStatusType
open ympa_fsharp_functions_server.Model.GetFeedIndexLogsResponse
open ympa_fsharp_functions_server.Model.GetFeedResponse
open ympa_fsharp_functions_server.Model.GetFeedsResponse
open ympa_fsharp_functions_server.Model.SetFeedParamsRequest
open System.Collections.Generic
open System

module FeedsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetFeedPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion


    type GetFeedStatusCode200Response = {
      content:GetFeedResponse;
      
    }

    type GetFeedStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedResult = GetFeedStatusCode200 of GetFeedStatusCode200Response|GetFeedStatusCode400 of GetFeedStatusCode400Response|GetFeedStatusCode401 of GetFeedStatusCode401Response|GetFeedStatusCode403 of GetFeedStatusCode403Response|GetFeedStatusCode404 of GetFeedStatusCode404Response|GetFeedStatusCode420 of GetFeedStatusCode420Response|GetFeedStatusCode500 of GetFeedStatusCode500Response

    type GetFeedArgs = {
      pathParams:GetFeedPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedIndexLogsPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetFeedIndexLogsQueryParams = {
      limit : int option;


      publishedTimeFrom : DateTime option;


      publishedTimeTo : DateTime option;


      status : FeedIndexLogsStatusType option;

    }
    //#endregion


    type GetFeedIndexLogsStatusCode200Response = {
      content:GetFeedIndexLogsResponse;
      
    }

    type GetFeedIndexLogsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedIndexLogsResult = GetFeedIndexLogsStatusCode200 of GetFeedIndexLogsStatusCode200Response|GetFeedIndexLogsStatusCode400 of GetFeedIndexLogsStatusCode400Response|GetFeedIndexLogsStatusCode401 of GetFeedIndexLogsStatusCode401Response|GetFeedIndexLogsStatusCode403 of GetFeedIndexLogsStatusCode403Response|GetFeedIndexLogsStatusCode404 of GetFeedIndexLogsStatusCode404Response|GetFeedIndexLogsStatusCode420 of GetFeedIndexLogsStatusCode420Response|GetFeedIndexLogsStatusCode500 of GetFeedIndexLogsStatusCode500Response

    type GetFeedIndexLogsArgs = {
      pathParams:GetFeedIndexLogsPathParams;
      queryParams:Result<GetFeedIndexLogsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetFeedsStatusCode200Response = {
      content:GetFeedsResponse;
      
    }

    type GetFeedsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedsResult = GetFeedsStatusCode200 of GetFeedsStatusCode200Response|GetFeedsStatusCode400 of GetFeedsStatusCode400Response|GetFeedsStatusCode401 of GetFeedsStatusCode401Response|GetFeedsStatusCode403 of GetFeedsStatusCode403Response|GetFeedsStatusCode404 of GetFeedsStatusCode404Response|GetFeedsStatusCode420 of GetFeedsStatusCode420Response|GetFeedsStatusCode500 of GetFeedsStatusCode500Response

    type GetFeedsArgs = {
      pathParams:GetFeedsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RefreshFeedPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion


    type RefreshFeedStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type RefreshFeedStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type RefreshFeedStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type RefreshFeedStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type RefreshFeedStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type RefreshFeedStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type RefreshFeedStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type RefreshFeedResult = RefreshFeedStatusCode200 of RefreshFeedStatusCode200Response|RefreshFeedStatusCode400 of RefreshFeedStatusCode400Response|RefreshFeedStatusCode401 of RefreshFeedStatusCode401Response|RefreshFeedStatusCode403 of RefreshFeedStatusCode403Response|RefreshFeedStatusCode404 of RefreshFeedStatusCode404Response|RefreshFeedStatusCode420 of RefreshFeedStatusCode420Response|RefreshFeedStatusCode500 of RefreshFeedStatusCode500Response

    type RefreshFeedArgs = {
      pathParams:RefreshFeedPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetFeedParamsPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetFeedParamsBodyParams = SetFeedParamsRequest
    //#endregion


    type SetFeedParamsStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetFeedParamsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetFeedParamsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetFeedParamsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetFeedParamsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetFeedParamsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetFeedParamsStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type SetFeedParamsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetFeedParamsResult = SetFeedParamsStatusCode200 of SetFeedParamsStatusCode200Response|SetFeedParamsStatusCode400 of SetFeedParamsStatusCode400Response|SetFeedParamsStatusCode401 of SetFeedParamsStatusCode401Response|SetFeedParamsStatusCode403 of SetFeedParamsStatusCode403Response|SetFeedParamsStatusCode404 of SetFeedParamsStatusCode404Response|SetFeedParamsStatusCode420 of SetFeedParamsStatusCode420Response|SetFeedParamsStatusCode423 of SetFeedParamsStatusCode423Response|SetFeedParamsStatusCode500 of SetFeedParamsStatusCode500Response

    type SetFeedParamsArgs = {
      pathParams:SetFeedParamsPathParams;
      bodyParams:SetFeedParamsBodyParams
    }
