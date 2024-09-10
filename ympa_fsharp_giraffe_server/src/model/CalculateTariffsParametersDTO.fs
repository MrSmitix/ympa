namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PaymentFrequencyType
open ympa_fsharp_giraffe_server.Model.SellingProgramType

module CalculateTariffsParametersDTO =

  //#region CalculateTariffsParametersDTO


  type CalculateTariffsParametersDTO = {
    CampaignId : int64;
    SellingProgram : SellingProgramType;
    Frequency : PaymentFrequencyType;
  }
  //#endregion
