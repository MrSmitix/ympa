namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CalculateTariffsResponseDTO

module CalculateTariffsResponse =

  //#region CalculateTariffsResponse


  type CalculateTariffsResponse = {
    Status : ApiResponseStatusType;
    Result : CalculateTariffsResponseDTO;
  }
  //#endregion
