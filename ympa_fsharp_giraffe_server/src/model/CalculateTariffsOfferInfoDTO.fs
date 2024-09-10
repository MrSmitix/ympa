namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CalculateTariffsOfferDTO
open ympa_fsharp_giraffe_server.Model.CalculatedTariffDTO

module CalculateTariffsOfferInfoDTO =

  //#region CalculateTariffsOfferInfoDTO


  type CalculateTariffsOfferInfoDTO = {
    Offer : CalculateTariffsOfferDTO;
    Tariffs : CalculatedTariffDTO[];
  }
  //#endregion
