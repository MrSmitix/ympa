namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.SkuBidItemDTO

module PutSkuBidsRequest =

  //#region PutSkuBidsRequest


  type PutSkuBidsRequest = {
    Bids : SkuBidItemDTO[];
  }
  //#endregion