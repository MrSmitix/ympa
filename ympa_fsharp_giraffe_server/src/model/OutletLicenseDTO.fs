namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.LicenseType

module OutletLicenseDTO =

  //#region OutletLicenseDTO


  type OutletLicenseDTO = {
    Id : int64;
    OutletId : int64;
    LicenseType : LicenseType;
    Number : string;
    DateOfIssue : Nullable<DateTime>;
    DateOfExpiry : Nullable<DateTime>;
  }
  //#endregion
