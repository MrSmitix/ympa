namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteCampaignOffersDTO =

  //#region DeleteCampaignOffersDTO

  [<CLIMutable>]
  type DeleteCampaignOffersDTO = {
    [<JsonProperty(PropertyName = "notDeletedOfferIds")>]
    NotDeletedOfferIds : string[];
  }

  //#endregion
