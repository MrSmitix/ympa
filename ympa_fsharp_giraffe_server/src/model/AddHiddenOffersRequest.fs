namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.HiddenOfferDTO

module AddHiddenOffersRequest =

  //#region AddHiddenOffersRequest


  type AddHiddenOffersRequest = {
    HiddenOffers : HiddenOfferDTO[];
  }
  //#endregion
