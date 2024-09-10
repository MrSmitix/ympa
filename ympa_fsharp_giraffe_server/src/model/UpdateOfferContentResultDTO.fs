namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferContentErrorDTO

module UpdateOfferContentResultDTO =

  //#region UpdateOfferContentResultDTO


  type UpdateOfferContentResultDTO = {
    OfferId : string;
    Errors : OfferContentErrorDTO[];
    Warnings : OfferContentErrorDTO[];
  }
  //#endregion
