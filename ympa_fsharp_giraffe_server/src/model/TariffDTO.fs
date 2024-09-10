namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.TariffParameterDTO
open ympa_fsharp_giraffe_server.Model.TariffType

module TariffDTO =

  //#region TariffDTO


  type TariffDTO = {
    Type : TariffType;
    Percent : decimal;
    Amount : decimal;
    Parameters : TariffParameterDTO[];
  }
  //#endregion
