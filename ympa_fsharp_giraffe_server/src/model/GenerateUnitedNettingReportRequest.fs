namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PlacementType

module GenerateUnitedNettingReportRequest =

  //#region GenerateUnitedNettingReportRequest


  type GenerateUnitedNettingReportRequest = {
    BusinessId : int64;
    DateTimeFrom : Nullable<DateTime>;
    DateTimeTo : Nullable<DateTime>;
    DateFrom : DateTime;
    DateTo : DateTime;
    BankOrderId : int64;
    BankOrderDateTime : Nullable<DateTime>;
    PlacementPrograms : PlacementType[];
    Inns : string[];
    CampaignIds : int64[];
  }
  //#endregion
