namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module RegionalModelInfoDTO =

  //#region RegionalModelInfoDTO

  [<CLIMutable>]
  type RegionalModelInfoDTO = {
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
  }

  //#endregion
