namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ShelfsStatisticsAttributionType

module GenerateShelfsStatisticsRequest =

  //#region GenerateShelfsStatisticsRequest


  type GenerateShelfsStatisticsRequest = {
    BusinessId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
    AttributionType : ShelfsStatisticsAttributionType;
  }
  //#endregion
