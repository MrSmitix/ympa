namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CalculatedTariffType
open ympa_fsharp_giraffe_server.Model.TariffParameterDTO

module CalculatedTariffDTO =

  //#region CalculatedTariffDTO


  type CalculatedTariffDTO = {
    Type : CalculatedTariffType;
    Amount : decimal;
    Parameters : TariffParameterDTO[];
  }
  //#endregion
