namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferErrorDTO =

  //#region OfferErrorDTO

  [<CLIMutable>]
  type OfferErrorDTO = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : string;
  }

  //#endregion
