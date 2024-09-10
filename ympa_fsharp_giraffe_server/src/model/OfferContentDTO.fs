namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ParameterValueDTO

module OfferContentDTO =

  //#region OfferContentDTO


  type OfferContentDTO = {
    OfferId : string;
    CategoryId : int;
    ParameterValues : ParameterValueDTO[];
  }
  //#endregion
