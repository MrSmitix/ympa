namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GetCampaignOffersResultDTO

module GetCampaignOffersResponse =

  //#region GetCampaignOffersResponse

  [<CLIMutable>]
  type GetCampaignOffersResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GetCampaignOffersResultDTO;
  }

  //#endregion
