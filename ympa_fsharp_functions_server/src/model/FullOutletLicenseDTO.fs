namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.LicenseCheckStatusType
open ympa_fsharp_functions_server.Model.LicenseType

module FullOutletLicenseDTO =

  //#region FullOutletLicenseDTO

  [<CLIMutable>]
  type FullOutletLicenseDTO = {
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
    [<JsonProperty(PropertyName = "checkStatus")>]
    CheckStatus : LicenseCheckStatusType;
    [<JsonProperty(PropertyName = "checkComment")>]
    CheckComment : string;
  }

  //#endregion
