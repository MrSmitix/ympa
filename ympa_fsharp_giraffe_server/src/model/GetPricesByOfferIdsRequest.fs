namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetPricesByOfferIdsRequest =

  //#region GetPricesByOfferIdsRequest


  type GetPricesByOfferIdsRequest = {
    OfferIds : string[];
  }
  //#endregion
