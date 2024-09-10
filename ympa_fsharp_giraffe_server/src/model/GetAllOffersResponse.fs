namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferDTO

module GetAllOffersResponse =

  //#region GetAllOffersResponse


  type GetAllOffersResponse = {
    Offers : OfferDTO[];
  }
  //#endregion
