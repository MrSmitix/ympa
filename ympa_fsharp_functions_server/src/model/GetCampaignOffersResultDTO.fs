namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetCampaignOfferDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module GetCampaignOffersResultDTO =

  //#region GetCampaignOffersResultDTO

  [<CLIMutable>]
  type GetCampaignOffersResultDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : GetCampaignOfferDTO[];
  }

  //#endregion
