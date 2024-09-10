namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesResponse
open System.Collections.Generic
open System

module CategoriesApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type GetCategoriesMaxSaleQuantumBodyParams = GetCategoriesMaxSaleQuantumRequest
    //#endregion


    type GetCategoriesMaxSaleQuantumStatusCode200Response = {
      content:GetCategoriesMaxSaleQuantumResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoriesMaxSaleQuantumResult = GetCategoriesMaxSaleQuantumStatusCode200 of GetCategoriesMaxSaleQuantumStatusCode200Response|GetCategoriesMaxSaleQuantumStatusCode400 of GetCategoriesMaxSaleQuantumStatusCode400Response|GetCategoriesMaxSaleQuantumStatusCode401 of GetCategoriesMaxSaleQuantumStatusCode401Response|GetCategoriesMaxSaleQuantumStatusCode403 of GetCategoriesMaxSaleQuantumStatusCode403Response|GetCategoriesMaxSaleQuantumStatusCode404 of GetCategoriesMaxSaleQuantumStatusCode404Response|GetCategoriesMaxSaleQuantumStatusCode420 of GetCategoriesMaxSaleQuantumStatusCode420Response|GetCategoriesMaxSaleQuantumStatusCode500 of GetCategoriesMaxSaleQuantumStatusCode500Response

    type GetCategoriesMaxSaleQuantumArgs = {
      bodyParams:GetCategoriesMaxSaleQuantumBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type GetCategoriesTreeBodyParams = GetCategoriesRequest
    //#endregion


    type GetCategoriesTreeStatusCode200Response = {
      content:GetCategoriesResponse;
      
    }

    type GetCategoriesTreeStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoriesTreeResult = GetCategoriesTreeStatusCode200 of GetCategoriesTreeStatusCode200Response|GetCategoriesTreeStatusCode400 of GetCategoriesTreeStatusCode400Response|GetCategoriesTreeStatusCode401 of GetCategoriesTreeStatusCode401Response|GetCategoriesTreeStatusCode403 of GetCategoriesTreeStatusCode403Response|GetCategoriesTreeStatusCode404 of GetCategoriesTreeStatusCode404Response|GetCategoriesTreeStatusCode420 of GetCategoriesTreeStatusCode420Response|GetCategoriesTreeStatusCode500 of GetCategoriesTreeStatusCode500Response

    type GetCategoriesTreeArgs = {
      bodyParams:GetCategoriesTreeBodyParams
    }
