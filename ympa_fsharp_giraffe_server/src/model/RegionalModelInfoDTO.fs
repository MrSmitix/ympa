namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module RegionalModelInfoDTO =

  //#region RegionalModelInfoDTO


  type RegionalModelInfoDTO = {
    Currency : CurrencyType;
    RegionId : int64;
  }
  //#endregion
