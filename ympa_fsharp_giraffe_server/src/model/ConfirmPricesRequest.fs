namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ConfirmPricesRequest =

  //#region ConfirmPricesRequest


  type ConfirmPricesRequest = {
    OfferIds : string[];
  }
  //#endregion