namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetCategoryContentParametersResponse
open ympa_fsharp_functions_server.Model.GetOfferCardsContentStatusRequest
open ympa_fsharp_functions_server.Model.GetOfferCardsContentStatusResponse
open ympa_fsharp_functions_server.Model.UpdateOfferContentRequest
open ympa_fsharp_functions_server.Model.UpdateOfferContentResponse
open System.Collections.Generic
open System

module ContentApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetCategoryContentParametersPathParams = {
      categoryId : int64 ;
    }
    //#endregion


    type GetCategoryContentParametersStatusCode200Response = {
      content:GetCategoryContentParametersResponse;
      
    }

    type GetCategoryContentParametersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoryContentParametersResult = GetCategoryContentParametersStatusCode200 of GetCategoryContentParametersStatusCode200Response|GetCategoryContentParametersStatusCode400 of GetCategoryContentParametersStatusCode400Response|GetCategoryContentParametersStatusCode401 of GetCategoryContentParametersStatusCode401Response|GetCategoryContentParametersStatusCode403 of GetCategoryContentParametersStatusCode403Response|GetCategoryContentParametersStatusCode404 of GetCategoryContentParametersStatusCode404Response|GetCategoryContentParametersStatusCode420 of GetCategoryContentParametersStatusCode420Response|GetCategoryContentParametersStatusCode500 of GetCategoryContentParametersStatusCode500Response

    type GetCategoryContentParametersArgs = {
      pathParams:GetCategoryContentParametersPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusBodyParams = GetOfferCardsContentStatusRequest
    //#endregion


    type GetOfferCardsContentStatusStatusCode200Response = {
      content:GetOfferCardsContentStatusResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferCardsContentStatusResult = GetOfferCardsContentStatusStatusCode200 of GetOfferCardsContentStatusStatusCode200Response|GetOfferCardsContentStatusStatusCode400 of GetOfferCardsContentStatusStatusCode400Response|GetOfferCardsContentStatusStatusCode401 of GetOfferCardsContentStatusStatusCode401Response|GetOfferCardsContentStatusStatusCode403 of GetOfferCardsContentStatusStatusCode403Response|GetOfferCardsContentStatusStatusCode404 of GetOfferCardsContentStatusStatusCode404Response|GetOfferCardsContentStatusStatusCode420 of GetOfferCardsContentStatusStatusCode420Response|GetOfferCardsContentStatusStatusCode500 of GetOfferCardsContentStatusStatusCode500Response

    type GetOfferCardsContentStatusArgs = {
      pathParams:GetOfferCardsContentStatusPathParams;
      queryParams:Result<GetOfferCardsContentStatusQueryParams,string>;
      bodyParams:GetOfferCardsContentStatusBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferContentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferContentBodyParams = UpdateOfferContentRequest
    //#endregion


    type UpdateOfferContentStatusCode200Response = {
      content:UpdateOfferContentResponse;
      
    }

    type UpdateOfferContentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferContentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferContentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferContentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferContentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferContentStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferContentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferContentResult = UpdateOfferContentStatusCode200 of UpdateOfferContentStatusCode200Response|UpdateOfferContentStatusCode400 of UpdateOfferContentStatusCode400Response|UpdateOfferContentStatusCode401 of UpdateOfferContentStatusCode401Response|UpdateOfferContentStatusCode403 of UpdateOfferContentStatusCode403Response|UpdateOfferContentStatusCode404 of UpdateOfferContentStatusCode404Response|UpdateOfferContentStatusCode420 of UpdateOfferContentStatusCode420Response|UpdateOfferContentStatusCode423 of UpdateOfferContentStatusCode423Response|UpdateOfferContentStatusCode500 of UpdateOfferContentStatusCode500Response

    type UpdateOfferContentArgs = {
      pathParams:UpdateOfferContentPathParams;
      bodyParams:UpdateOfferContentBodyParams
    }
