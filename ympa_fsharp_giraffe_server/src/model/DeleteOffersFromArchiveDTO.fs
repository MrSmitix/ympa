namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module DeleteOffersFromArchiveDTO =

  //#region DeleteOffersFromArchiveDTO


  type DeleteOffersFromArchiveDTO = {
    NotUnarchivedOfferIds : string[];
  }
  //#endregion
