namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetBusinessSettingsInfoDTO

module GetBusinessSettingsResponse =

  //#region GetBusinessSettingsResponse


  type GetBusinessSettingsResponse = {
    Status : ApiResponseStatusType;
    Result : GetBusinessSettingsInfoDTO;
  }
  //#endregion
