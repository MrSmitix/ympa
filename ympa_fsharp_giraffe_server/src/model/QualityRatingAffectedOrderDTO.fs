namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AffectedOrderQualityRatingComponentType

module QualityRatingAffectedOrderDTO =

  //#region QualityRatingAffectedOrderDTO


  type QualityRatingAffectedOrderDTO = {
    OrderId : int64;
    Description : string;
    ComponentType : AffectedOrderQualityRatingComponentType;
  }
  //#endregion
