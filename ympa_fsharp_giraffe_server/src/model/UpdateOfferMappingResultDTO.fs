namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferMappingErrorDTO

module UpdateOfferMappingResultDTO =

  //#region UpdateOfferMappingResultDTO


  type UpdateOfferMappingResultDTO = {
    OfferId : string;
    Errors : OfferMappingErrorDTO[];
    Warnings : OfferMappingErrorDTO[];
  }
  //#endregion
