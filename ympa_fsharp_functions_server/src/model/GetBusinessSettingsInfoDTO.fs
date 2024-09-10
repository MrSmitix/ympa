namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BusinessDTO
open ympa_fsharp_functions_server.Model.BusinessSettingsDTO

module GetBusinessSettingsInfoDTO =

  //#region GetBusinessSettingsInfoDTO

  [<CLIMutable>]
  type GetBusinessSettingsInfoDTO = {
    [<JsonProperty(PropertyName = "info")>]
    Info : BusinessDTO;
    [<JsonProperty(PropertyName = "settings")>]
    Settings : BusinessSettingsDTO;
  }

  //#endregion
