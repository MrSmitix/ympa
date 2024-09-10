namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateCampaignOfferDTO

module UpdateCampaignOffersRequest =

  //#region UpdateCampaignOffersRequest

  [<CLIMutable>]
  type UpdateCampaignOffersRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : UpdateCampaignOfferDTO[];
  }

  //#endregion
