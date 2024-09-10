namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateCompetitorsPositionReportRequest =

  //#region GenerateCompetitorsPositionReportRequest

  [<CLIMutable>]
  type GenerateCompetitorsPositionReportRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
  }

  //#endregion
