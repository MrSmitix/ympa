namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetPricesByOfferIdsRequest
open ympa_fsharp_functions_server.Model.GetPricesByOfferIdsResponse
open ympa_fsharp_functions_server.Model.GetPricesResponse
open ympa_fsharp_functions_server.Model.SuggestPricesRequest
open ympa_fsharp_functions_server.Model.SuggestPricesResponse
open ympa_fsharp_functions_server.Model.UpdateBusinessPricesRequest
open ympa_fsharp_functions_server.Model.UpdatePricesRequest
open System.Collections.Generic
open System

module PricesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPricesQueryParams = {
      pageToken : string option;


      limit : int option;


      archived : bool option;

    }
    //#endregion


    type GetPricesStatusCode200Response = {
      content:GetPricesResponse;
      
    }

    type GetPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPricesResult = GetPricesStatusCode200 of GetPricesStatusCode200Response|GetPricesStatusCode400 of GetPricesStatusCode400Response|GetPricesStatusCode401 of GetPricesStatusCode401Response|GetPricesStatusCode403 of GetPricesStatusCode403Response|GetPricesStatusCode404 of GetPricesStatusCode404Response|GetPricesStatusCode420 of GetPricesStatusCode420Response|GetPricesStatusCode500 of GetPricesStatusCode500Response

    type GetPricesArgs = {
      pathParams:GetPricesPathParams;
      queryParams:Result<GetPricesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsBodyParams = GetPricesByOfferIdsRequest
    //#endregion


    type GetPricesByOfferIdsStatusCode200Response = {
      content:GetPricesByOfferIdsResponse;
      
    }

    type GetPricesByOfferIdsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPricesByOfferIdsResult = GetPricesByOfferIdsStatusCode200 of GetPricesByOfferIdsStatusCode200Response|GetPricesByOfferIdsStatusCode400 of GetPricesByOfferIdsStatusCode400Response|GetPricesByOfferIdsStatusCode401 of GetPricesByOfferIdsStatusCode401Response|GetPricesByOfferIdsStatusCode403 of GetPricesByOfferIdsStatusCode403Response|GetPricesByOfferIdsStatusCode404 of GetPricesByOfferIdsStatusCode404Response|GetPricesByOfferIdsStatusCode420 of GetPricesByOfferIdsStatusCode420Response|GetPricesByOfferIdsStatusCode500 of GetPricesByOfferIdsStatusCode500Response

    type GetPricesByOfferIdsArgs = {
      pathParams:GetPricesByOfferIdsPathParams;
      queryParams:Result<GetPricesByOfferIdsQueryParams,string>;
      bodyParams:GetPricesByOfferIdsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedPricesBodyParams = SuggestPricesRequest
    //#endregion


    type GetSuggestedPricesStatusCode200Response = {
      content:SuggestPricesResponse;
      
    }

    type GetSuggestedPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedPricesResult = GetSuggestedPricesStatusCode200 of GetSuggestedPricesStatusCode200Response|GetSuggestedPricesStatusCode400 of GetSuggestedPricesStatusCode400Response|GetSuggestedPricesStatusCode401 of GetSuggestedPricesStatusCode401Response|GetSuggestedPricesStatusCode403 of GetSuggestedPricesStatusCode403Response|GetSuggestedPricesStatusCode404 of GetSuggestedPricesStatusCode404Response|GetSuggestedPricesStatusCode420 of GetSuggestedPricesStatusCode420Response|GetSuggestedPricesStatusCode500 of GetSuggestedPricesStatusCode500Response

    type GetSuggestedPricesArgs = {
      pathParams:GetSuggestedPricesPathParams;
      bodyParams:GetSuggestedPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateBusinessPricesPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateBusinessPricesBodyParams = UpdateBusinessPricesRequest
    //#endregion


    type UpdateBusinessPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateBusinessPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateBusinessPricesResult = UpdateBusinessPricesStatusCode200 of UpdateBusinessPricesStatusCode200Response|UpdateBusinessPricesStatusCode400 of UpdateBusinessPricesStatusCode400Response|UpdateBusinessPricesStatusCode401 of UpdateBusinessPricesStatusCode401Response|UpdateBusinessPricesStatusCode403 of UpdateBusinessPricesStatusCode403Response|UpdateBusinessPricesStatusCode404 of UpdateBusinessPricesStatusCode404Response|UpdateBusinessPricesStatusCode420 of UpdateBusinessPricesStatusCode420Response|UpdateBusinessPricesStatusCode423 of UpdateBusinessPricesStatusCode423Response|UpdateBusinessPricesStatusCode500 of UpdateBusinessPricesStatusCode500Response

    type UpdateBusinessPricesArgs = {
      pathParams:UpdateBusinessPricesPathParams;
      bodyParams:UpdateBusinessPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdatePricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdatePricesBodyParams = UpdatePricesRequest
    //#endregion


    type UpdatePricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdatePricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdatePricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdatePricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdatePricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdatePricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdatePricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdatePricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdatePricesResult = UpdatePricesStatusCode200 of UpdatePricesStatusCode200Response|UpdatePricesStatusCode400 of UpdatePricesStatusCode400Response|UpdatePricesStatusCode401 of UpdatePricesStatusCode401Response|UpdatePricesStatusCode403 of UpdatePricesStatusCode403Response|UpdatePricesStatusCode404 of UpdatePricesStatusCode404Response|UpdatePricesStatusCode420 of UpdatePricesStatusCode420Response|UpdatePricesStatusCode423 of UpdatePricesStatusCode423Response|UpdatePricesStatusCode500 of UpdatePricesStatusCode500Response

    type UpdatePricesArgs = {
      pathParams:UpdatePricesPathParams;
      bodyParams:UpdatePricesBodyParams
    }
