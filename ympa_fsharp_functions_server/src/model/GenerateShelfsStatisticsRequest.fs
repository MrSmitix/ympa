namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ShelfsStatisticsAttributionType

module GenerateShelfsStatisticsRequest =

  //#region GenerateShelfsStatisticsRequest

  [<CLIMutable>]
  type GenerateShelfsStatisticsRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "attributionType")>]
    AttributionType : ShelfsStatisticsAttributionType;
  }

  //#endregion
