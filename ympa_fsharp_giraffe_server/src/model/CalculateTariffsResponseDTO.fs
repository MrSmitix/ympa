namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CalculateTariffsOfferInfoDTO

module CalculateTariffsResponseDTO =

  //#region CalculateTariffsResponseDTO


  type CalculateTariffsResponseDTO = {
    Offers : CalculateTariffsOfferInfoDTO[];
  }
  //#endregion
