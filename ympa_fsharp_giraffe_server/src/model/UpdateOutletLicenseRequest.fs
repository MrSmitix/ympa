namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OutletLicenseDTO

module UpdateOutletLicenseRequest =

  //#region UpdateOutletLicenseRequest


  type UpdateOutletLicenseRequest = {
    Licenses : OutletLicenseDTO[];
  }
  //#endregion
