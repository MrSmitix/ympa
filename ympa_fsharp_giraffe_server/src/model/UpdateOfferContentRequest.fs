namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferContentDTO

module UpdateOfferContentRequest =

  //#region UpdateOfferContentRequest


  type UpdateOfferContentRequest = {
    OffersContent : OfferContentDTO[];
  }
  //#endregion
