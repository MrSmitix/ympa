namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CalculateTariffsOfferDTO
open ympa_fsharp_functions_server.Model.CalculatedTariffDTO

module CalculateTariffsOfferInfoDTO =

  //#region CalculateTariffsOfferInfoDTO

  [<CLIMutable>]
  type CalculateTariffsOfferInfoDTO = {
    [<JsonProperty(PropertyName = "offer")>]
    Offer : CalculateTariffsOfferDTO;
    [<JsonProperty(PropertyName = "tariffs")>]
    Tariffs : CalculatedTariffDTO[];
  }

  //#endregion
