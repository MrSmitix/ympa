namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveErrorType

module AddOffersToArchiveErrorDTO =

  //#region AddOffersToArchiveErrorDTO


  type AddOffersToArchiveErrorDTO = {
    OfferId : string;
    Error : AddOffersToArchiveErrorType;
  }
  //#endregion
