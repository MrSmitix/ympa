namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceDTO

module OfferPriceByOfferIdsResponseDTO =

  //#region OfferPriceByOfferIdsResponseDTO


  type OfferPriceByOfferIdsResponseDTO = {
    OfferId : string;
    Price : PriceDTO;
    UpdatedAt : Nullable<DateTime>;
  }
  //#endregion
