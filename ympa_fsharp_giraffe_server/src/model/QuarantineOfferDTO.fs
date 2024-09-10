namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BasePriceDTO
open ympa_fsharp_giraffe_server.Model.PriceQuarantineVerdictDTO

module QuarantineOfferDTO =

  //#region QuarantineOfferDTO


  type QuarantineOfferDTO = {
    OfferId : string;
    CurrentPrice : BasePriceDTO;
    LastValidPrice : BasePriceDTO;
    Verdicts : PriceQuarantineVerdictDTO[];
  }
  //#endregion
