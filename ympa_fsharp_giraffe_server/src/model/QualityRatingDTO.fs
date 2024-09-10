namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QualityRatingComponentDTO

module QualityRatingDTO =

  //#region QualityRatingDTO


  type QualityRatingDTO = {
    Rating : int64;
    CalculationDate : DateTime;
    Components : QualityRatingComponentDTO[];
  }
  //#endregion
