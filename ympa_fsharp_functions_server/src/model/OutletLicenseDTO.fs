namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.LicenseType

module OutletLicenseDTO =

  //#region OutletLicenseDTO

  [<CLIMutable>]
  type OutletLicenseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "outletId")>]
    OutletId : int64;
    [<JsonProperty(PropertyName = "licenseType")>]
    LicenseType : LicenseType;
    [<JsonProperty(PropertyName = "number")>]
    Number : string;
    [<JsonProperty(PropertyName = "dateOfIssue")>]
    DateOfIssue : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "dateOfExpiry")>]
    DateOfExpiry : Nullable<DateTime>;
  }

  //#endregion
