namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QualityRatingComponentType

module QualityRatingComponentDTO =

  //#region QualityRatingComponentDTO


  type QualityRatingComponentDTO = {
    Value : double;
    ComponentType : QualityRatingComponentType;
  }
  //#endregion
