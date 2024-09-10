namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferSellingProgramStatusType
open ympa_fsharp_giraffe_server.Model.SellingProgramType

module OfferSellingProgramDTO =

  //#region OfferSellingProgramDTO


  type OfferSellingProgramDTO = {
    SellingProgram : SellingProgramType;
    Status : OfferSellingProgramStatusType;
  }
  //#endregion
