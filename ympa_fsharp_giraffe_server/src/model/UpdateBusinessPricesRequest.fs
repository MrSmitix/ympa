namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateBusinessOfferPriceDTO

module UpdateBusinessPricesRequest =

  //#region UpdateBusinessPricesRequest


  type UpdateBusinessPricesRequest = {
    Offers : UpdateBusinessOfferPriceDTO[];
  }
  //#endregion
