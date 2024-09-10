namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PlacementType

module GenerateUnitedNettingReportRequest =

  //#region GenerateUnitedNettingReportRequest

  [<CLIMutable>]
  type GenerateUnitedNettingReportRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "dateTimeFrom")>]
    DateTimeFrom : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "dateTimeTo")>]
    DateTimeTo : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "bankOrderId")>]
    BankOrderId : int64;
    [<JsonProperty(PropertyName = "bankOrderDateTime")>]
    BankOrderDateTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "placementPrograms")>]
    PlacementPrograms : PlacementType[];
    [<JsonProperty(PropertyName = "inns")>]
    Inns : string[];
    [<JsonProperty(PropertyName = "campaignIds")>]
    CampaignIds : int64[];
  }

  //#endregion
