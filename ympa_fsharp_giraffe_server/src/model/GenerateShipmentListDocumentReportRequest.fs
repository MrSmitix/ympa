namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateShipmentListDocumentReportRequest =

  //#region GenerateShipmentListDocumentReportRequest


  type GenerateShipmentListDocumentReportRequest = {
    CampaignId : int64;
    ShipmentId : int64;
    OrderIds : int64[];
  }
  //#endregion
