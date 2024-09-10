namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BasePriceDTO
open ympa_fsharp_functions_server.Model.PriceQuarantineVerdictDTO

module QuarantineOfferDTO =

  //#region QuarantineOfferDTO

  [<CLIMutable>]
  type QuarantineOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "currentPrice")>]
    CurrentPrice : BasePriceDTO;
    [<JsonProperty(PropertyName = "lastValidPrice")>]
    LastValidPrice : BasePriceDTO;
    [<JsonProperty(PropertyName = "verdicts")>]
    Verdicts : PriceQuarantineVerdictDTO[];
  }

  //#endregion
