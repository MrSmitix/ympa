namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PaymentFrequencyType
open ympa_fsharp_functions_server.Model.SellingProgramType

module CalculateTariffsParametersDTO =

  //#region CalculateTariffsParametersDTO

  [<CLIMutable>]
  type CalculateTariffsParametersDTO = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "sellingProgram")>]
    SellingProgram : SellingProgramType;
    [<JsonProperty(PropertyName = "frequency")>]
    Frequency : PaymentFrequencyType;
  }

  //#endregion
