namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferPriceResponseDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module OfferPriceListResponseDTO =

  //#region OfferPriceListResponseDTO

  [<CLIMutable>]
  type OfferPriceListResponseDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferPriceResponseDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "total")>]
    Total : int;
  }

  //#endregion
