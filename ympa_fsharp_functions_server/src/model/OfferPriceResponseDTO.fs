namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceDTO

module OfferPriceResponseDTO =

  //#region OfferPriceResponseDTO

  [<CLIMutable>]
  type OfferPriceResponseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : PriceDTO;
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : Nullable<DateTime>;
  }

  //#endregion
