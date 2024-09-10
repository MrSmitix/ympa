namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferMappingErrorType

module OfferMappingErrorDTO =

  //#region OfferMappingErrorDTO


  type OfferMappingErrorDTO = {
    Type : OfferMappingErrorType;
    ParameterId : int64;
    Message : string;
  }
  //#endregion
