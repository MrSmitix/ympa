namespace ympa_fsharp_functions_server
open CampaignsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CampaignsApiServiceInterface =

    //#region Service interface
    type ICampaignsApiService =
      abstract member GetCampaign : unit -> GetCampaignResult
      abstract member GetCampaignLogins : unit -> GetCampaignLoginsResult
      abstract member GetCampaignRegion : unit -> GetCampaignRegionResult
      abstract member GetCampaignSettings : unit -> GetCampaignSettingsResult
      abstract member GetCampaigns : unit -> GetCampaignsResult
      abstract member GetCampaignsByLogin : unit -> GetCampaignsByLoginResult
    //#endregion