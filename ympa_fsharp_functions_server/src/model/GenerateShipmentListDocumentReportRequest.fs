namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateShipmentListDocumentReportRequest =

  //#region GenerateShipmentListDocumentReportRequest

  [<CLIMutable>]
  type GenerateShipmentListDocumentReportRequest = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "shipmentId")>]
    ShipmentId : int64;
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
  }

  //#endregion
