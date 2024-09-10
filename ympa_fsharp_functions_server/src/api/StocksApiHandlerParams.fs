namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetWarehouseStocksRequest
open ympa_fsharp_functions_server.Model.GetWarehouseStocksResponse
open ympa_fsharp_functions_server.Model.UpdateStocksRequest
open System.Collections.Generic
open System

module StocksApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetStocksPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetStocksQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetStocksBodyParams = GetWarehouseStocksRequest
    //#endregion


    type GetStocksStatusCode200Response = {
      content:GetWarehouseStocksResponse;
      
    }

    type GetStocksStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetStocksStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetStocksStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetStocksStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetStocksStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetStocksResult = GetStocksStatusCode200 of GetStocksStatusCode200Response|GetStocksStatusCode400 of GetStocksStatusCode400Response|GetStocksStatusCode401 of GetStocksStatusCode401Response|GetStocksStatusCode403 of GetStocksStatusCode403Response|GetStocksStatusCode420 of GetStocksStatusCode420Response|GetStocksStatusCode500 of GetStocksStatusCode500Response

    type GetStocksArgs = {
      pathParams:GetStocksPathParams;
      queryParams:Result<GetStocksQueryParams,string>;
      bodyParams:GetStocksBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateStocksPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateStocksBodyParams = UpdateStocksRequest
    //#endregion


    type UpdateStocksStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateStocksStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateStocksStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateStocksStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateStocksStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateStocksStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateStocksStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateStocksResult = UpdateStocksStatusCode200 of UpdateStocksStatusCode200Response|UpdateStocksStatusCode400 of UpdateStocksStatusCode400Response|UpdateStocksStatusCode401 of UpdateStocksStatusCode401Response|UpdateStocksStatusCode403 of UpdateStocksStatusCode403Response|UpdateStocksStatusCode404 of UpdateStocksStatusCode404Response|UpdateStocksStatusCode420 of UpdateStocksStatusCode420Response|UpdateStocksStatusCode500 of UpdateStocksStatusCode500Response

    type UpdateStocksArgs = {
      pathParams:UpdateStocksPathParams;
      bodyParams:UpdateStocksBodyParams
    }
