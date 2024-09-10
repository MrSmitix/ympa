namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CalculateTariffsOfferInfoDTO

module CalculateTariffsResponseDTO =

  //#region CalculateTariffsResponseDTO

  [<CLIMutable>]
  type CalculateTariffsResponseDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : CalculateTariffsOfferInfoDTO[];
  }

  //#endregion
