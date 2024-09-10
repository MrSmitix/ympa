namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferConditionQualityType
open ympa_fsharp_giraffe_server.Model.OfferConditionType

module OfferConditionDTO =

  //#region OfferConditionDTO


  type OfferConditionDTO = {
    Type : OfferConditionType;
    Quality : OfferConditionQualityType;
    Reason : string;
  }
  //#endregion
