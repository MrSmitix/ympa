namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PlacementType

module GenerateUnitedMarketplaceServicesReportRequest =

  //#region GenerateUnitedMarketplaceServicesReportRequest


  type GenerateUnitedMarketplaceServicesReportRequest = {
    BusinessId : int64;
    DateTimeFrom : Nullable<DateTime>;
    DateTimeTo : Nullable<DateTime>;
    DateFrom : DateTime;
    DateTo : DateTime;
    YearFrom : int;
    MonthFrom : int;
    YearTo : int;
    MonthTo : int;
    PlacementPrograms : PlacementType[];
    Inns : string[];
    CampaignIds : int64[];
  }
  //#endregion
