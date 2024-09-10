namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.ChangeOutletRequest
open ympa_fsharp_functions_server.Model.CreateOutletResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetOutletResponse
open ympa_fsharp_functions_server.Model.GetOutletsResponse
open System.Collections.Generic
open System

module OutletsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CreateOutletPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateOutletBodyParams = ChangeOutletRequest
    //#endregion


    type CreateOutletStatusCode200Response = {
      content:CreateOutletResponse;
      
    }

    type CreateOutletStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type CreateOutletStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type CreateOutletStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type CreateOutletStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type CreateOutletStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type CreateOutletStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type CreateOutletResult = CreateOutletStatusCode200 of CreateOutletStatusCode200Response|CreateOutletStatusCode400 of CreateOutletStatusCode400Response|CreateOutletStatusCode401 of CreateOutletStatusCode401Response|CreateOutletStatusCode403 of CreateOutletStatusCode403Response|CreateOutletStatusCode404 of CreateOutletStatusCode404Response|CreateOutletStatusCode420 of CreateOutletStatusCode420Response|CreateOutletStatusCode500 of CreateOutletStatusCode500Response

    type CreateOutletArgs = {
      pathParams:CreateOutletPathParams;
      bodyParams:CreateOutletBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteOutletPathParams = {
      campaignId : int64 ;
    //#endregion
      outletId : int64 ;
    }
    //#endregion


    type DeleteOutletStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteOutletStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOutletStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOutletStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOutletStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOutletStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOutletStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOutletResult = DeleteOutletStatusCode200 of DeleteOutletStatusCode200Response|DeleteOutletStatusCode400 of DeleteOutletStatusCode400Response|DeleteOutletStatusCode401 of DeleteOutletStatusCode401Response|DeleteOutletStatusCode403 of DeleteOutletStatusCode403Response|DeleteOutletStatusCode404 of DeleteOutletStatusCode404Response|DeleteOutletStatusCode420 of DeleteOutletStatusCode420Response|DeleteOutletStatusCode500 of DeleteOutletStatusCode500Response

    type DeleteOutletArgs = {
      pathParams:DeleteOutletPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOutletPathParams = {
      campaignId : int64 ;
    //#endregion
      outletId : int64 ;
    }
    //#endregion


    type GetOutletStatusCode200Response = {
      content:GetOutletResponse;
      
    }

    type GetOutletStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOutletStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOutletStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOutletStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOutletStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOutletStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOutletResult = GetOutletStatusCode200 of GetOutletStatusCode200Response|GetOutletStatusCode400 of GetOutletStatusCode400Response|GetOutletStatusCode401 of GetOutletStatusCode401Response|GetOutletStatusCode403 of GetOutletStatusCode403Response|GetOutletStatusCode404 of GetOutletStatusCode404Response|GetOutletStatusCode420 of GetOutletStatusCode420Response|GetOutletStatusCode500 of GetOutletStatusCode500Response

    type GetOutletArgs = {
      pathParams:GetOutletPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOutletsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOutletsQueryParams = {
      pageToken : string option;


      regionId : int64 option;


      shopOutletCode : string option;


      regionId2 : int64 option;

    }
    //#endregion


    type GetOutletsStatusCode200Response = {
      content:GetOutletsResponse;
      
    }

    type GetOutletsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOutletsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOutletsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOutletsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOutletsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOutletsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOutletsResult = GetOutletsStatusCode200 of GetOutletsStatusCode200Response|GetOutletsStatusCode400 of GetOutletsStatusCode400Response|GetOutletsStatusCode401 of GetOutletsStatusCode401Response|GetOutletsStatusCode403 of GetOutletsStatusCode403Response|GetOutletsStatusCode404 of GetOutletsStatusCode404Response|GetOutletsStatusCode420 of GetOutletsStatusCode420Response|GetOutletsStatusCode500 of GetOutletsStatusCode500Response

    type GetOutletsArgs = {
      pathParams:GetOutletsPathParams;
      queryParams:Result<GetOutletsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOutletPathParams = {
      campaignId : int64 ;
    //#endregion
      outletId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOutletBodyParams = ChangeOutletRequest
    //#endregion


    type UpdateOutletStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateOutletStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOutletStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOutletStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOutletStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOutletStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOutletStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOutletResult = UpdateOutletStatusCode200 of UpdateOutletStatusCode200Response|UpdateOutletStatusCode400 of UpdateOutletStatusCode400Response|UpdateOutletStatusCode401 of UpdateOutletStatusCode401Response|UpdateOutletStatusCode403 of UpdateOutletStatusCode403Response|UpdateOutletStatusCode404 of UpdateOutletStatusCode404Response|UpdateOutletStatusCode420 of UpdateOutletStatusCode420Response|UpdateOutletStatusCode500 of UpdateOutletStatusCode500Response

    type UpdateOutletArgs = {
      pathParams:UpdateOutletPathParams;
      bodyParams:UpdateOutletBodyParams
    }
