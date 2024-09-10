namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CalculateTariffsOfferDTO
open ympa_fsharp_giraffe_server.Model.CalculateTariffsParametersDTO

module CalculateTariffsRequest =

  //#region CalculateTariffsRequest


  type CalculateTariffsRequest = {
    Parameters : CalculateTariffsParametersDTO;
    Offers : CalculateTariffsOfferDTO[];
  }
  //#endregion
