namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DayOfWeekType
open ympa_fsharp_giraffe_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_giraffe_server.Model.OfferProcessingStateDTO
open ympa_fsharp_giraffe_server.Model.OfferWeightDimensionsDTO
open ympa_fsharp_giraffe_server.Model.TimePeriodDTO

module UpdateMappingsOfferDTO =

  //#region UpdateMappingsOfferDTO


  type UpdateMappingsOfferDTO = {
    Name : string;
    ShopSku : string;
    Category : string;
    Vendor : string;
    VendorCode : string;
    Description : string;
    Id : string;
    FeedId : int64;
    Barcodes : string[];
    Urls : string[];
    Pictures : string[];
    Manufacturer : string;
    ManufacturerCountries : string[];
    MinShipment : int;
    TransportUnitSize : int;
    QuantumOfSupply : int;
    DeliveryDurationDays : int;
    BoxCount : int;
    CustomsCommodityCodes : string[];
    WeightDimensions : OfferWeightDimensionsDTO;
    SupplyScheduleDays : DayOfWeekType[];
    ShelfLifeDays : int;
    LifeTimeDays : int;
    GuaranteePeriodDays : int;
    ProcessingState : OfferProcessingStateDTO;
    Availability : OfferAvailabilityStatusType;
    ShelfLife : TimePeriodDTO;
    LifeTime : TimePeriodDTO;
    GuaranteePeriod : TimePeriodDTO;
    Certificate : string;
  }
  //#endregion
