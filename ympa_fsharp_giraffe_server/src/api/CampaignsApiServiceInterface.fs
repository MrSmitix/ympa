namespace ympa_fsharp_giraffe_server
open CampaignsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CampaignsApiServiceInterface =

    //#region Service interface
    type ICampaignsApiService =
      abstract member GetCampaign:HttpContext -> GetCampaignArgs->GetCampaignResult
      abstract member GetCampaignLogins:HttpContext -> GetCampaignLoginsArgs->GetCampaignLoginsResult
      abstract member GetCampaignRegion:HttpContext -> GetCampaignRegionArgs->GetCampaignRegionResult
      abstract member GetCampaignSettings:HttpContext -> GetCampaignSettingsArgs->GetCampaignSettingsResult
      abstract member GetCampaigns:HttpContext -> GetCampaignsArgs->GetCampaignsResult
      abstract member GetCampaignsByLogin:HttpContext -> GetCampaignsByLoginArgs->GetCampaignsByLoginResult
    //#endregion