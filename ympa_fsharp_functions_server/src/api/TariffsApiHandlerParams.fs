namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.CalculateTariffsRequest
open ympa_fsharp_functions_server.Model.CalculateTariffsResponse
open System.Collections.Generic
open System

module TariffsApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CalculateTariffsBodyParams = CalculateTariffsRequest
    //#endregion


    type CalculateTariffsStatusCode200Response = {
      content:CalculateTariffsResponse;
      
    }

    type CalculateTariffsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type CalculateTariffsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type CalculateTariffsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type CalculateTariffsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type CalculateTariffsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type CalculateTariffsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type CalculateTariffsResult = CalculateTariffsStatusCode200 of CalculateTariffsStatusCode200Response|CalculateTariffsStatusCode400 of CalculateTariffsStatusCode400Response|CalculateTariffsStatusCode401 of CalculateTariffsStatusCode401Response|CalculateTariffsStatusCode403 of CalculateTariffsStatusCode403Response|CalculateTariffsStatusCode404 of CalculateTariffsStatusCode404Response|CalculateTariffsStatusCode420 of CalculateTariffsStatusCode420Response|CalculateTariffsStatusCode500 of CalculateTariffsStatusCode500Response

    type CalculateTariffsArgs = {
      bodyParams:CalculateTariffsBodyParams
    }
