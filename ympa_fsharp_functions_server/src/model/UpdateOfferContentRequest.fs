namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferContentDTO

module UpdateOfferContentRequest =

  //#region UpdateOfferContentRequest

  [<CLIMutable>]
  type UpdateOfferContentRequest = {
    [<JsonProperty(PropertyName = "offersContent")>]
    OffersContent : OfferContentDTO[];
  }

  //#endregion
