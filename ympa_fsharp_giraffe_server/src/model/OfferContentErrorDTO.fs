namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferContentErrorType

module OfferContentErrorDTO =

  //#region OfferContentErrorDTO


  type OfferContentErrorDTO = {
    Type : OfferContentErrorType;
    ParameterId : int64;
    Message : string;
  }
  //#endregion
