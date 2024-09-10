namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OutletLicensesResponseDTO

module GetOutletLicensesResponse =

  //#region GetOutletLicensesResponse


  type GetOutletLicensesResponse = {
    Status : ApiResponseStatusType;
    Result : OutletLicensesResponseDTO;
  }
  //#endregion
