namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingKindType
open ympa_fsharp_giraffe_server.Model.OfferProcessingStatusType
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingEntryRequest
open System.Collections.Generic
open System

module OfferMappingsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferMappingEntriesQueryParams = {
      offerId : string[] option;


      shopSku : string[] option;


      mappingKind : OfferMappingKindType option;


      status : OfferProcessingStatusType[] option;


      availability : OfferAvailabilityStatusType[] option;


      categoryId : int[] option;


      vendor : string[] option;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type GetOfferMappingEntriesStatusCode200Response = {
      content:GetOfferMappingEntriesResponse;
      
    }

    type GetOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferMappingEntriesResult = GetOfferMappingEntriesStatusCode200 of GetOfferMappingEntriesStatusCode200Response|GetOfferMappingEntriesStatusCode400 of GetOfferMappingEntriesStatusCode400Response|GetOfferMappingEntriesStatusCode401 of GetOfferMappingEntriesStatusCode401Response|GetOfferMappingEntriesStatusCode403 of GetOfferMappingEntriesStatusCode403Response|GetOfferMappingEntriesStatusCode404 of GetOfferMappingEntriesStatusCode404Response|GetOfferMappingEntriesStatusCode420 of GetOfferMappingEntriesStatusCode420Response|GetOfferMappingEntriesStatusCode500 of GetOfferMappingEntriesStatusCode500Response

    type GetOfferMappingEntriesArgs = {
      pathParams:GetOfferMappingEntriesPathParams;
      queryParams:Result<GetOfferMappingEntriesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingEntriesBodyParams = GetSuggestedOfferMappingEntriesRequest
    //#endregion


    type GetSuggestedOfferMappingEntriesStatusCode200Response = {
      content:GetSuggestedOfferMappingEntriesResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedOfferMappingEntriesResult = GetSuggestedOfferMappingEntriesStatusCode200 of GetSuggestedOfferMappingEntriesStatusCode200Response|GetSuggestedOfferMappingEntriesStatusCode400 of GetSuggestedOfferMappingEntriesStatusCode400Response|GetSuggestedOfferMappingEntriesStatusCode401 of GetSuggestedOfferMappingEntriesStatusCode401Response|GetSuggestedOfferMappingEntriesStatusCode403 of GetSuggestedOfferMappingEntriesStatusCode403Response|GetSuggestedOfferMappingEntriesStatusCode404 of GetSuggestedOfferMappingEntriesStatusCode404Response|GetSuggestedOfferMappingEntriesStatusCode420 of GetSuggestedOfferMappingEntriesStatusCode420Response|GetSuggestedOfferMappingEntriesStatusCode500 of GetSuggestedOfferMappingEntriesStatusCode500Response

    type GetSuggestedOfferMappingEntriesArgs = {
      pathParams:GetSuggestedOfferMappingEntriesPathParams;
      bodyParams:GetSuggestedOfferMappingEntriesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferMappingEntriesBodyParams = UpdateOfferMappingEntryRequest
    //#endregion


    type UpdateOfferMappingEntriesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferMappingEntriesResult = UpdateOfferMappingEntriesStatusCode200 of UpdateOfferMappingEntriesStatusCode200Response|UpdateOfferMappingEntriesStatusCode400 of UpdateOfferMappingEntriesStatusCode400Response|UpdateOfferMappingEntriesStatusCode401 of UpdateOfferMappingEntriesStatusCode401Response|UpdateOfferMappingEntriesStatusCode403 of UpdateOfferMappingEntriesStatusCode403Response|UpdateOfferMappingEntriesStatusCode404 of UpdateOfferMappingEntriesStatusCode404Response|UpdateOfferMappingEntriesStatusCode420 of UpdateOfferMappingEntriesStatusCode420Response|UpdateOfferMappingEntriesStatusCode423 of UpdateOfferMappingEntriesStatusCode423Response|UpdateOfferMappingEntriesStatusCode500 of UpdateOfferMappingEntriesStatusCode500Response

    type UpdateOfferMappingEntriesArgs = {
      pathParams:UpdateOfferMappingEntriesPathParams;
      bodyParams:UpdateOfferMappingEntriesBodyParams
    }
