namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.AddHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeleteHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetHiddenOffersResponse
open System.Collections.Generic
open System

module HiddenOffersApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AddHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AddHiddenOffersBodyParams = AddHiddenOffersRequest
    //#endregion


    type AddHiddenOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type AddHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type AddHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type AddHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type AddHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type AddHiddenOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type AddHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type AddHiddenOffersResult = AddHiddenOffersStatusCode200 of AddHiddenOffersStatusCode200Response|AddHiddenOffersStatusCode400 of AddHiddenOffersStatusCode400Response|AddHiddenOffersStatusCode401 of AddHiddenOffersStatusCode401Response|AddHiddenOffersStatusCode403 of AddHiddenOffersStatusCode403Response|AddHiddenOffersStatusCode420 of AddHiddenOffersStatusCode420Response|AddHiddenOffersStatusCode423 of AddHiddenOffersStatusCode423Response|AddHiddenOffersStatusCode500 of AddHiddenOffersStatusCode500Response

    type AddHiddenOffersArgs = {
      pathParams:AddHiddenOffersPathParams;
      bodyParams:AddHiddenOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteHiddenOffersBodyParams = DeleteHiddenOffersRequest
    //#endregion


    type DeleteHiddenOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteHiddenOffersResult = DeleteHiddenOffersStatusCode200 of DeleteHiddenOffersStatusCode200Response|DeleteHiddenOffersStatusCode400 of DeleteHiddenOffersStatusCode400Response|DeleteHiddenOffersStatusCode401 of DeleteHiddenOffersStatusCode401Response|DeleteHiddenOffersStatusCode403 of DeleteHiddenOffersStatusCode403Response|DeleteHiddenOffersStatusCode404 of DeleteHiddenOffersStatusCode404Response|DeleteHiddenOffersStatusCode420 of DeleteHiddenOffersStatusCode420Response|DeleteHiddenOffersStatusCode423 of DeleteHiddenOffersStatusCode423Response|DeleteHiddenOffersStatusCode500 of DeleteHiddenOffersStatusCode500Response

    type DeleteHiddenOffersArgs = {
      pathParams:DeleteHiddenOffersPathParams;
      bodyParams:DeleteHiddenOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetHiddenOffersQueryParams = {
      offerId : string[] option;


      pageToken : string option;


      limit : int option;


      offset : int option;


      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetHiddenOffersStatusCode200Response = {
      content:GetHiddenOffersResponse;
      
    }

    type GetHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetHiddenOffersResult = GetHiddenOffersStatusCode200 of GetHiddenOffersStatusCode200Response|GetHiddenOffersStatusCode400 of GetHiddenOffersStatusCode400Response|GetHiddenOffersStatusCode401 of GetHiddenOffersStatusCode401Response|GetHiddenOffersStatusCode403 of GetHiddenOffersStatusCode403Response|GetHiddenOffersStatusCode420 of GetHiddenOffersStatusCode420Response|GetHiddenOffersStatusCode500 of GetHiddenOffersStatusCode500Response

    type GetHiddenOffersArgs = {
      pathParams:GetHiddenOffersPathParams;
      queryParams:Result<GetHiddenOffersQueryParams,string>;
    }
