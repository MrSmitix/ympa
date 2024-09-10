namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersResponse
open ympa_fsharp_giraffe_server.Model.GetPromoOffersRequest
open ympa_fsharp_giraffe_server.Model.GetPromoOffersResponse
open ympa_fsharp_giraffe_server.Model.GetPromosRequest
open ympa_fsharp_giraffe_server.Model.GetPromosResponse
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersResponse
open System.Collections.Generic
open System

module PromosApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeletePromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeletePromoOffersBodyParams = DeletePromoOffersRequest
    //#endregion


    type DeletePromoOffersStatusCode200Response = {
      content:DeletePromoOffersResponse;
      
    }

    type DeletePromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeletePromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeletePromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeletePromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeletePromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeletePromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeletePromoOffersResult = DeletePromoOffersStatusCode200 of DeletePromoOffersStatusCode200Response|DeletePromoOffersStatusCode400 of DeletePromoOffersStatusCode400Response|DeletePromoOffersStatusCode401 of DeletePromoOffersStatusCode401Response|DeletePromoOffersStatusCode403 of DeletePromoOffersStatusCode403Response|DeletePromoOffersStatusCode404 of DeletePromoOffersStatusCode404Response|DeletePromoOffersStatusCode420 of DeletePromoOffersStatusCode420Response|DeletePromoOffersStatusCode500 of DeletePromoOffersStatusCode500Response

    type DeletePromoOffersArgs = {
      pathParams:DeletePromoOffersPathParams;
      bodyParams:DeletePromoOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPromoOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPromoOffersBodyParams = GetPromoOffersRequest
    //#endregion


    type GetPromoOffersStatusCode200Response = {
      content:GetPromoOffersResponse;
      
    }

    type GetPromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPromoOffersResult = GetPromoOffersStatusCode200 of GetPromoOffersStatusCode200Response|GetPromoOffersStatusCode400 of GetPromoOffersStatusCode400Response|GetPromoOffersStatusCode401 of GetPromoOffersStatusCode401Response|GetPromoOffersStatusCode403 of GetPromoOffersStatusCode403Response|GetPromoOffersStatusCode404 of GetPromoOffersStatusCode404Response|GetPromoOffersStatusCode420 of GetPromoOffersStatusCode420Response|GetPromoOffersStatusCode500 of GetPromoOffersStatusCode500Response

    type GetPromoOffersArgs = {
      pathParams:GetPromoOffersPathParams;
      queryParams:Result<GetPromoOffersQueryParams,string>;
      bodyParams:GetPromoOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPromosPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPromosBodyParams = GetPromosRequest
    //#endregion


    type GetPromosStatusCode200Response = {
      content:GetPromosResponse;
      
    }

    type GetPromosStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPromosStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPromosStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPromosStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPromosStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPromosStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPromosResult = GetPromosStatusCode200 of GetPromosStatusCode200Response|GetPromosStatusCode400 of GetPromosStatusCode400Response|GetPromosStatusCode401 of GetPromosStatusCode401Response|GetPromosStatusCode403 of GetPromosStatusCode403Response|GetPromosStatusCode404 of GetPromosStatusCode404Response|GetPromosStatusCode420 of GetPromosStatusCode420Response|GetPromosStatusCode500 of GetPromosStatusCode500Response

    type GetPromosArgs = {
      pathParams:GetPromosPathParams;
      bodyParams:GetPromosBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdatePromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdatePromoOffersBodyParams = UpdatePromoOffersRequest
    //#endregion


    type UpdatePromoOffersStatusCode200Response = {
      content:UpdatePromoOffersResponse;
      
    }

    type UpdatePromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdatePromoOffersResult = UpdatePromoOffersStatusCode200 of UpdatePromoOffersStatusCode200Response|UpdatePromoOffersStatusCode400 of UpdatePromoOffersStatusCode400Response|UpdatePromoOffersStatusCode401 of UpdatePromoOffersStatusCode401Response|UpdatePromoOffersStatusCode403 of UpdatePromoOffersStatusCode403Response|UpdatePromoOffersStatusCode404 of UpdatePromoOffersStatusCode404Response|UpdatePromoOffersStatusCode420 of UpdatePromoOffersStatusCode420Response|UpdatePromoOffersStatusCode500 of UpdatePromoOffersStatusCode500Response

    type UpdatePromoOffersArgs = {
      pathParams:UpdatePromoOffersPathParams;
      bodyParams:UpdatePromoOffersBodyParams
    }
