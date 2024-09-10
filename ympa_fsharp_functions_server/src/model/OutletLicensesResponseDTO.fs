namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FullOutletLicenseDTO

module OutletLicensesResponseDTO =

  //#region OutletLicensesResponseDTO

  [<CLIMutable>]
  type OutletLicensesResponseDTO = {
    [<JsonProperty(PropertyName = "licenses")>]
    Licenses : FullOutletLicenseDTO[];
  }

  //#endregion
