namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OfferMappingDTO =

  //#region OfferMappingDTO


  type OfferMappingDTO = {
    MarketSku : int64;
    ModelId : int64;
    CategoryId : int64;
  }
  //#endregion
