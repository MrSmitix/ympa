namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QuantumDTO

module BaseCampaignOfferDTO =

  //#region BaseCampaignOfferDTO

  [<CLIMutable>]
  type BaseCampaignOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "quantum")>]
    Quantum : QuantumDTO;
    [<JsonProperty(PropertyName = "available")>]
    Available : bool;
  }

  //#endregion
