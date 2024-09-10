namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FullOutletLicenseDTO

module OutletLicensesResponseDTO =

  //#region OutletLicensesResponseDTO


  type OutletLicensesResponseDTO = {
    Licenses : FullOutletLicenseDTO[];
  }
  //#endregion
