namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOutletLicensesResponse
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.UpdateOutletLicenseRequest
open System.Collections.Generic
open System

module OutletLicensesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteOutletLicensesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type DeleteOutletLicensesQueryParams = {
      ids : int64[] option;

    }
    //#endregion


    type DeleteOutletLicensesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteOutletLicensesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOutletLicensesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOutletLicensesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOutletLicensesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOutletLicensesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOutletLicensesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOutletLicensesResult = DeleteOutletLicensesStatusCode200 of DeleteOutletLicensesStatusCode200Response|DeleteOutletLicensesStatusCode400 of DeleteOutletLicensesStatusCode400Response|DeleteOutletLicensesStatusCode401 of DeleteOutletLicensesStatusCode401Response|DeleteOutletLicensesStatusCode403 of DeleteOutletLicensesStatusCode403Response|DeleteOutletLicensesStatusCode404 of DeleteOutletLicensesStatusCode404Response|DeleteOutletLicensesStatusCode420 of DeleteOutletLicensesStatusCode420Response|DeleteOutletLicensesStatusCode500 of DeleteOutletLicensesStatusCode500Response

    type DeleteOutletLicensesArgs = {
      pathParams:DeleteOutletLicensesPathParams;
      queryParams:Result<DeleteOutletLicensesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOutletLicensesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOutletLicensesQueryParams = {
      outletIds : int64[] option;


      ids : int64[] option;

    }
    //#endregion


    type GetOutletLicensesStatusCode200Response = {
      content:GetOutletLicensesResponse;
      
    }

    type GetOutletLicensesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOutletLicensesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOutletLicensesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOutletLicensesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOutletLicensesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOutletLicensesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOutletLicensesResult = GetOutletLicensesStatusCode200 of GetOutletLicensesStatusCode200Response|GetOutletLicensesStatusCode400 of GetOutletLicensesStatusCode400Response|GetOutletLicensesStatusCode401 of GetOutletLicensesStatusCode401Response|GetOutletLicensesStatusCode403 of GetOutletLicensesStatusCode403Response|GetOutletLicensesStatusCode404 of GetOutletLicensesStatusCode404Response|GetOutletLicensesStatusCode420 of GetOutletLicensesStatusCode420Response|GetOutletLicensesStatusCode500 of GetOutletLicensesStatusCode500Response

    type GetOutletLicensesArgs = {
      pathParams:GetOutletLicensesPathParams;
      queryParams:Result<GetOutletLicensesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOutletLicensesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOutletLicensesBodyParams = UpdateOutletLicenseRequest
    //#endregion


    type UpdateOutletLicensesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateOutletLicensesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOutletLicensesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOutletLicensesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOutletLicensesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOutletLicensesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOutletLicensesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOutletLicensesResult = UpdateOutletLicensesStatusCode200 of UpdateOutletLicensesStatusCode200Response|UpdateOutletLicensesStatusCode400 of UpdateOutletLicensesStatusCode400Response|UpdateOutletLicensesStatusCode401 of UpdateOutletLicensesStatusCode401Response|UpdateOutletLicensesStatusCode403 of UpdateOutletLicensesStatusCode403Response|UpdateOutletLicensesStatusCode404 of UpdateOutletLicensesStatusCode404Response|UpdateOutletLicensesStatusCode420 of UpdateOutletLicensesStatusCode420Response|UpdateOutletLicensesStatusCode500 of UpdateOutletLicensesStatusCode500Response

    type UpdateOutletLicensesArgs = {
      pathParams:UpdateOutletLicensesPathParams;
      bodyParams:UpdateOutletLicensesBodyParams
    }
