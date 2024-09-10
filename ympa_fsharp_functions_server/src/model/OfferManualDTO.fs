namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferManualDTO =

  //#region OfferManualDTO

  [<CLIMutable>]
  type OfferManualDTO = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
