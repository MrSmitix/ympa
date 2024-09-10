namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BusinessDTO
open ympa_fsharp_giraffe_server.Model.BusinessSettingsDTO

module GetBusinessSettingsInfoDTO =

  //#region GetBusinessSettingsInfoDTO


  type GetBusinessSettingsInfoDTO = {
    Info : BusinessDTO;
    Settings : BusinessSettingsDTO;
  }
  //#endregion
