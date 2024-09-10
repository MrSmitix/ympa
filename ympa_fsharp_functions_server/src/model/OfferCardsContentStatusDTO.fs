namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.OfferCardDTO

module OfferCardsContentStatusDTO =

  //#region OfferCardsContentStatusDTO

  [<CLIMutable>]
  type OfferCardsContentStatusDTO = {
    [<JsonProperty(PropertyName = "offerCards")>]
    OfferCards : OfferCardDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
