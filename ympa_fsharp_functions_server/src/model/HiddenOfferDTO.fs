namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module HiddenOfferDTO =

  //#region HiddenOfferDTO

  [<CLIMutable>]
  type HiddenOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
  }

  //#endregion
