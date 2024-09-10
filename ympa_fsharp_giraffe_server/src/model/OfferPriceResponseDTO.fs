namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceDTO

module OfferPriceResponseDTO =

  //#region OfferPriceResponseDTO


  type OfferPriceResponseDTO = {
    Id : string;
    Price : PriceDTO;
    MarketSku : int64;
    UpdatedAt : Nullable<DateTime>;
  }
  //#endregion
