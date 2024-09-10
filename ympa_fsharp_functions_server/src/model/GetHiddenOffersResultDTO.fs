namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.HiddenOfferDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module GetHiddenOffersResultDTO =

  //#region GetHiddenOffersResultDTO

  [<CLIMutable>]
  type GetHiddenOffersResultDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "hiddenOffers")>]
    HiddenOffers : HiddenOfferDTO[];
  }

  //#endregion
