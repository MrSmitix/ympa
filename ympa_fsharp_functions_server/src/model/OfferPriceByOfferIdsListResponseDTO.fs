namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferPriceByOfferIdsResponseDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module OfferPriceByOfferIdsListResponseDTO =

  //#region OfferPriceByOfferIdsListResponseDTO

  [<CLIMutable>]
  type OfferPriceByOfferIdsListResponseDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferPriceByOfferIdsResponseDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
  }

  //#endregion
