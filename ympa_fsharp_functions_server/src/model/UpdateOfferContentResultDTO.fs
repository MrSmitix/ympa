namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferContentErrorDTO

module UpdateOfferContentResultDTO =

  //#region UpdateOfferContentResultDTO

  [<CLIMutable>]
  type UpdateOfferContentResultDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OfferContentErrorDTO[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : OfferContentErrorDTO[];
  }

  //#endregion
