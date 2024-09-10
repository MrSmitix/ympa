namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetCampaignLoginsResponse
open ympa_fsharp_functions_server.Model.GetCampaignRegionResponse
open ympa_fsharp_functions_server.Model.GetCampaignResponse
open ympa_fsharp_functions_server.Model.GetCampaignSettingsResponse
open ympa_fsharp_functions_server.Model.GetCampaignsResponse
open System.Collections.Generic
open System

module CampaignsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignStatusCode200Response = {
      content:GetCampaignResponse;
      
    }

    type GetCampaignStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignResult = GetCampaignStatusCode200 of GetCampaignStatusCode200Response|GetCampaignStatusCode400 of GetCampaignStatusCode400Response|GetCampaignStatusCode401 of GetCampaignStatusCode401Response|GetCampaignStatusCode403 of GetCampaignStatusCode403Response|GetCampaignStatusCode404 of GetCampaignStatusCode404Response|GetCampaignStatusCode420 of GetCampaignStatusCode420Response|GetCampaignStatusCode500 of GetCampaignStatusCode500Response

    type GetCampaignArgs = {
      pathParams:GetCampaignPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignLoginsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignLoginsStatusCode200Response = {
      content:GetCampaignLoginsResponse;
      
    }

    type GetCampaignLoginsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignLoginsResult = GetCampaignLoginsStatusCode200 of GetCampaignLoginsStatusCode200Response|GetCampaignLoginsStatusCode400 of GetCampaignLoginsStatusCode400Response|GetCampaignLoginsStatusCode401 of GetCampaignLoginsStatusCode401Response|GetCampaignLoginsStatusCode403 of GetCampaignLoginsStatusCode403Response|GetCampaignLoginsStatusCode404 of GetCampaignLoginsStatusCode404Response|GetCampaignLoginsStatusCode420 of GetCampaignLoginsStatusCode420Response|GetCampaignLoginsStatusCode500 of GetCampaignLoginsStatusCode500Response

    type GetCampaignLoginsArgs = {
      pathParams:GetCampaignLoginsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignRegionPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignRegionStatusCode200Response = {
      content:GetCampaignRegionResponse;
      
    }

    type GetCampaignRegionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignRegionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignRegionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignRegionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignRegionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignRegionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignRegionResult = GetCampaignRegionStatusCode200 of GetCampaignRegionStatusCode200Response|GetCampaignRegionStatusCode400 of GetCampaignRegionStatusCode400Response|GetCampaignRegionStatusCode401 of GetCampaignRegionStatusCode401Response|GetCampaignRegionStatusCode403 of GetCampaignRegionStatusCode403Response|GetCampaignRegionStatusCode404 of GetCampaignRegionStatusCode404Response|GetCampaignRegionStatusCode420 of GetCampaignRegionStatusCode420Response|GetCampaignRegionStatusCode500 of GetCampaignRegionStatusCode500Response

    type GetCampaignRegionArgs = {
      pathParams:GetCampaignRegionPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignSettingsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignSettingsStatusCode200Response = {
      content:GetCampaignSettingsResponse;
      
    }

    type GetCampaignSettingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignSettingsResult = GetCampaignSettingsStatusCode200 of GetCampaignSettingsStatusCode200Response|GetCampaignSettingsStatusCode400 of GetCampaignSettingsStatusCode400Response|GetCampaignSettingsStatusCode401 of GetCampaignSettingsStatusCode401Response|GetCampaignSettingsStatusCode403 of GetCampaignSettingsStatusCode403Response|GetCampaignSettingsStatusCode404 of GetCampaignSettingsStatusCode404Response|GetCampaignSettingsStatusCode420 of GetCampaignSettingsStatusCode420Response|GetCampaignSettingsStatusCode500 of GetCampaignSettingsStatusCode500Response

    type GetCampaignSettingsArgs = {
      pathParams:GetCampaignSettingsPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignsQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetCampaignsStatusCode200Response = {
      content:GetCampaignsResponse;
      
    }

    type GetCampaignsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignsResult = GetCampaignsStatusCode200 of GetCampaignsStatusCode200Response|GetCampaignsStatusCode400 of GetCampaignsStatusCode400Response|GetCampaignsStatusCode401 of GetCampaignsStatusCode401Response|GetCampaignsStatusCode403 of GetCampaignsStatusCode403Response|GetCampaignsStatusCode404 of GetCampaignsStatusCode404Response|GetCampaignsStatusCode420 of GetCampaignsStatusCode420Response|GetCampaignsStatusCode500 of GetCampaignsStatusCode500Response

    type GetCampaignsArgs = {
      queryParams:Result<GetCampaignsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignsByLoginPathParams = {
      login : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignsByLoginQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetCampaignsByLoginStatusCode200Response = {
      content:GetCampaignsResponse;
      
    }

    type GetCampaignsByLoginStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignsByLoginResult = GetCampaignsByLoginStatusCode200 of GetCampaignsByLoginStatusCode200Response|GetCampaignsByLoginStatusCode400 of GetCampaignsByLoginStatusCode400Response|GetCampaignsByLoginStatusCode401 of GetCampaignsByLoginStatusCode401Response|GetCampaignsByLoginStatusCode403 of GetCampaignsByLoginStatusCode403Response|GetCampaignsByLoginStatusCode404 of GetCampaignsByLoginStatusCode404Response|GetCampaignsByLoginStatusCode420 of GetCampaignsByLoginStatusCode420Response|GetCampaignsByLoginStatusCode500 of GetCampaignsByLoginStatusCode500Response

    type GetCampaignsByLoginArgs = {
      pathParams:GetCampaignsByLoginPathParams;
      queryParams:Result<GetCampaignsByLoginQueryParams,string>;
    }
