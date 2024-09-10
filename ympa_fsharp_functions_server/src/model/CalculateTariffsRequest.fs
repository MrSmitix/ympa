namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CalculateTariffsOfferDTO
open ympa_fsharp_functions_server.Model.CalculateTariffsParametersDTO

module CalculateTariffsRequest =

  //#region CalculateTariffsRequest

  [<CLIMutable>]
  type CalculateTariffsRequest = {
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : CalculateTariffsParametersDTO;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : CalculateTariffsOfferDTO[];
  }

  //#endregion
