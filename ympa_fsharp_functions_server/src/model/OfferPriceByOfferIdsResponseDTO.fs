namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceDTO

module OfferPriceByOfferIdsResponseDTO =

  //#region OfferPriceByOfferIdsResponseDTO

  [<CLIMutable>]
  type OfferPriceByOfferIdsResponseDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : PriceDTO;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : Nullable<DateTime>;
  }

  //#endregion
