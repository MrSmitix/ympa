namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.AddOffersToArchiveRequest
open ympa_fsharp_functions_server.Model.AddOffersToArchiveResponse
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.DeleteOffersFromArchiveRequest
open ympa_fsharp_functions_server.Model.DeleteOffersFromArchiveResponse
open ympa_fsharp_functions_server.Model.DeleteOffersRequest
open ympa_fsharp_functions_server.Model.DeleteOffersResponse
open ympa_fsharp_functions_server.Model.GetOfferMappingsRequest
open ympa_fsharp_functions_server.Model.GetOfferMappingsResponse
open ympa_fsharp_functions_server.Model.GetSuggestedOfferMappingsRequest
open ympa_fsharp_functions_server.Model.GetSuggestedOfferMappingsResponse
open ympa_fsharp_functions_server.Model.UpdateOfferMappingsRequest
open ympa_fsharp_functions_server.Model.UpdateOfferMappingsResponse
open System.Collections.Generic
open System

module BusinessOfferMappingsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AddOffersToArchivePathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AddOffersToArchiveBodyParams = AddOffersToArchiveRequest
    //#endregion


    type AddOffersToArchiveStatusCode200Response = {
      content:AddOffersToArchiveResponse;
      
    }

    type AddOffersToArchiveStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type AddOffersToArchiveResult = AddOffersToArchiveStatusCode200 of AddOffersToArchiveStatusCode200Response|AddOffersToArchiveStatusCode400 of AddOffersToArchiveStatusCode400Response|AddOffersToArchiveStatusCode401 of AddOffersToArchiveStatusCode401Response|AddOffersToArchiveStatusCode403 of AddOffersToArchiveStatusCode403Response|AddOffersToArchiveStatusCode404 of AddOffersToArchiveStatusCode404Response|AddOffersToArchiveStatusCode420 of AddOffersToArchiveStatusCode420Response|AddOffersToArchiveStatusCode423 of AddOffersToArchiveStatusCode423Response|AddOffersToArchiveStatusCode500 of AddOffersToArchiveStatusCode500Response

    type AddOffersToArchiveArgs = {
      pathParams:AddOffersToArchivePathParams;
      bodyParams:AddOffersToArchiveBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteOffersBodyParams = DeleteOffersRequest
    //#endregion


    type DeleteOffersStatusCode200Response = {
      content:DeleteOffersResponse;
      
    }

    type DeleteOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOffersResult = DeleteOffersStatusCode200 of DeleteOffersStatusCode200Response|DeleteOffersStatusCode400 of DeleteOffersStatusCode400Response|DeleteOffersStatusCode401 of DeleteOffersStatusCode401Response|DeleteOffersStatusCode403 of DeleteOffersStatusCode403Response|DeleteOffersStatusCode404 of DeleteOffersStatusCode404Response|DeleteOffersStatusCode420 of DeleteOffersStatusCode420Response|DeleteOffersStatusCode423 of DeleteOffersStatusCode423Response|DeleteOffersStatusCode500 of DeleteOffersStatusCode500Response

    type DeleteOffersArgs = {
      pathParams:DeleteOffersPathParams;
      bodyParams:DeleteOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteOffersFromArchivePathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteOffersFromArchiveBodyParams = DeleteOffersFromArchiveRequest
    //#endregion


    type DeleteOffersFromArchiveStatusCode200Response = {
      content:DeleteOffersFromArchiveResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOffersFromArchiveResult = DeleteOffersFromArchiveStatusCode200 of DeleteOffersFromArchiveStatusCode200Response|DeleteOffersFromArchiveStatusCode400 of DeleteOffersFromArchiveStatusCode400Response|DeleteOffersFromArchiveStatusCode401 of DeleteOffersFromArchiveStatusCode401Response|DeleteOffersFromArchiveStatusCode403 of DeleteOffersFromArchiveStatusCode403Response|DeleteOffersFromArchiveStatusCode404 of DeleteOffersFromArchiveStatusCode404Response|DeleteOffersFromArchiveStatusCode420 of DeleteOffersFromArchiveStatusCode420Response|DeleteOffersFromArchiveStatusCode423 of DeleteOffersFromArchiveStatusCode423Response|DeleteOffersFromArchiveStatusCode500 of DeleteOffersFromArchiveStatusCode500Response

    type DeleteOffersFromArchiveArgs = {
      pathParams:DeleteOffersFromArchivePathParams;
      bodyParams:DeleteOffersFromArchiveBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferMappingsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferMappingsBodyParams = GetOfferMappingsRequest
    //#endregion


    type GetOfferMappingsStatusCode200Response = {
      content:GetOfferMappingsResponse;
      
    }

    type GetOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferMappingsResult = GetOfferMappingsStatusCode200 of GetOfferMappingsStatusCode200Response|GetOfferMappingsStatusCode400 of GetOfferMappingsStatusCode400Response|GetOfferMappingsStatusCode401 of GetOfferMappingsStatusCode401Response|GetOfferMappingsStatusCode403 of GetOfferMappingsStatusCode403Response|GetOfferMappingsStatusCode404 of GetOfferMappingsStatusCode404Response|GetOfferMappingsStatusCode420 of GetOfferMappingsStatusCode420Response|GetOfferMappingsStatusCode500 of GetOfferMappingsStatusCode500Response

    type GetOfferMappingsArgs = {
      pathParams:GetOfferMappingsPathParams;
      queryParams:Result<GetOfferMappingsQueryParams,string>;
      bodyParams:GetOfferMappingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingsBodyParams = GetSuggestedOfferMappingsRequest
    //#endregion


    type GetSuggestedOfferMappingsStatusCode200Response = {
      content:GetSuggestedOfferMappingsResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedOfferMappingsResult = GetSuggestedOfferMappingsStatusCode200 of GetSuggestedOfferMappingsStatusCode200Response|GetSuggestedOfferMappingsStatusCode400 of GetSuggestedOfferMappingsStatusCode400Response|GetSuggestedOfferMappingsStatusCode401 of GetSuggestedOfferMappingsStatusCode401Response|GetSuggestedOfferMappingsStatusCode403 of GetSuggestedOfferMappingsStatusCode403Response|GetSuggestedOfferMappingsStatusCode404 of GetSuggestedOfferMappingsStatusCode404Response|GetSuggestedOfferMappingsStatusCode420 of GetSuggestedOfferMappingsStatusCode420Response|GetSuggestedOfferMappingsStatusCode500 of GetSuggestedOfferMappingsStatusCode500Response

    type GetSuggestedOfferMappingsArgs = {
      pathParams:GetSuggestedOfferMappingsPathParams;
      bodyParams:GetSuggestedOfferMappingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferMappingsBodyParams = UpdateOfferMappingsRequest
    //#endregion


    type UpdateOfferMappingsStatusCode200Response = {
      content:UpdateOfferMappingsResponse;
      
    }

    type UpdateOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferMappingsResult = UpdateOfferMappingsStatusCode200 of UpdateOfferMappingsStatusCode200Response|UpdateOfferMappingsStatusCode400 of UpdateOfferMappingsStatusCode400Response|UpdateOfferMappingsStatusCode401 of UpdateOfferMappingsStatusCode401Response|UpdateOfferMappingsStatusCode403 of UpdateOfferMappingsStatusCode403Response|UpdateOfferMappingsStatusCode404 of UpdateOfferMappingsStatusCode404Response|UpdateOfferMappingsStatusCode420 of UpdateOfferMappingsStatusCode420Response|UpdateOfferMappingsStatusCode423 of UpdateOfferMappingsStatusCode423Response|UpdateOfferMappingsStatusCode500 of UpdateOfferMappingsStatusCode500Response

    type UpdateOfferMappingsArgs = {
      pathParams:UpdateOfferMappingsPathParams;
      bodyParams:UpdateOfferMappingsBodyParams
    }
