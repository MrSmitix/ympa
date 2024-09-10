namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QualityRatingAffectedOrderDTO

module QualityRatingDetailsDTO =

  //#region QualityRatingDetailsDTO


  type QualityRatingDetailsDTO = {
    AffectedOrders : QualityRatingAffectedOrderDTO[];
  }
  //#endregion
