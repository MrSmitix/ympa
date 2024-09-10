namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveErrorDTO

module AddOffersToArchiveDTO =

  //#region AddOffersToArchiveDTO


  type AddOffersToArchiveDTO = {
    NotArchivedOffers : AddOffersToArchiveErrorDTO[];
  }
  //#endregion
