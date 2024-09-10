namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.SkuBidItemDTO

module GetBidsInfoResponseDTO =

  //#region GetBidsInfoResponseDTO

  [<CLIMutable>]
  type GetBidsInfoResponseDTO = {
    [<JsonProperty(PropertyName = "bids")>]
    Bids : SkuBidItemDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
