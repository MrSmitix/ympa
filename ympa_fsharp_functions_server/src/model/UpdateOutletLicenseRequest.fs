namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OutletLicenseDTO

module UpdateOutletLicenseRequest =

  //#region UpdateOutletLicenseRequest

  [<CLIMutable>]
  type UpdateOutletLicenseRequest = {
    [<JsonProperty(PropertyName = "licenses")>]
    Licenses : OutletLicenseDTO[];
  }

  //#endregion
