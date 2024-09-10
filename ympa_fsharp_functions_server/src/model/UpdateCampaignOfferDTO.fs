namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QuantumDTO

module UpdateCampaignOfferDTO =

  //#region UpdateCampaignOfferDTO

  [<CLIMutable>]
  type UpdateCampaignOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "quantum")>]
    Quantum : QuantumDTO;
    [<JsonProperty(PropertyName = "available")>]
    Available : bool;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : int;
  }

  //#endregion
