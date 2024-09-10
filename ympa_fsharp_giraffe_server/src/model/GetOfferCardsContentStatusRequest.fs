namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferCardStatusType
open ympa_fsharp_giraffe_server.Model.Set

module GetOfferCardsContentStatusRequest =

  //#region GetOfferCardsContentStatusRequest


  type GetOfferCardsContentStatusRequest = {
    OfferIds : string[];
    CardStatuses : OfferCardStatusType[];
    CategoryIds : int[];
  }
  //#endregion
