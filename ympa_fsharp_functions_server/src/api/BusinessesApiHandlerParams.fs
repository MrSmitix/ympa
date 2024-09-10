namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetBusinessSettingsResponse
open System.Collections.Generic
open System

module BusinessesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessSettingsPathParams = {
      businessId : int64 ;
    }
    //#endregion


    type GetBusinessSettingsStatusCode200Response = {
      content:GetBusinessSettingsResponse;
      
    }

    type GetBusinessSettingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBusinessSettingsResult = GetBusinessSettingsStatusCode200 of GetBusinessSettingsStatusCode200Response|GetBusinessSettingsStatusCode400 of GetBusinessSettingsStatusCode400Response|GetBusinessSettingsStatusCode401 of GetBusinessSettingsStatusCode401Response|GetBusinessSettingsStatusCode403 of GetBusinessSettingsStatusCode403Response|GetBusinessSettingsStatusCode404 of GetBusinessSettingsStatusCode404Response|GetBusinessSettingsStatusCode420 of GetBusinessSettingsStatusCode420Response|GetBusinessSettingsStatusCode500 of GetBusinessSettingsStatusCode500Response

    type GetBusinessSettingsArgs = {
      pathParams:GetBusinessSettingsPathParams;
    }
