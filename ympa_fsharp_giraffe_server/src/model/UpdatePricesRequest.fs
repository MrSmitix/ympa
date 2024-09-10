namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferPriceDTO

module UpdatePricesRequest =

  //#region UpdatePricesRequest


  type UpdatePricesRequest = {
    Offers : OfferPriceDTO[];
  }
  //#endregion
