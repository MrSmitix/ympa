namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DayOfWeekType
open ympa_fsharp_functions_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_functions_server.Model.OfferProcessingStateDTO
open ympa_fsharp_functions_server.Model.OfferWeightDimensionsDTO
open ympa_fsharp_functions_server.Model.TimePeriodDTO

module MappingsOfferDTO =

  //#region MappingsOfferDTO

  [<CLIMutable>]
  type MappingsOfferDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "vendor")>]
    Vendor : string;
    [<JsonProperty(PropertyName = "vendorCode")>]
    VendorCode : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "feedId")>]
    FeedId : int64;
    [<JsonProperty(PropertyName = "barcodes")>]
    Barcodes : string[];
    [<JsonProperty(PropertyName = "urls")>]
    Urls : string[];
    [<JsonProperty(PropertyName = "pictures")>]
    Pictures : string[];
    [<JsonProperty(PropertyName = "manufacturer")>]
    Manufacturer : string;
    [<JsonProperty(PropertyName = "manufacturerCountries")>]
    ManufacturerCountries : string[];
    [<JsonProperty(PropertyName = "minShipment")>]
    MinShipment : int;
    [<JsonProperty(PropertyName = "transportUnitSize")>]
    TransportUnitSize : int;
    [<JsonProperty(PropertyName = "quantumOfSupply")>]
    QuantumOfSupply : int;
    [<JsonProperty(PropertyName = "deliveryDurationDays")>]
    DeliveryDurationDays : int;
    [<JsonProperty(PropertyName = "boxCount")>]
    BoxCount : int;
    [<JsonProperty(PropertyName = "customsCommodityCodes")>]
    CustomsCommodityCodes : string[];
    [<JsonProperty(PropertyName = "weightDimensions")>]
    WeightDimensions : OfferWeightDimensionsDTO;
    [<JsonProperty(PropertyName = "supplyScheduleDays")>]
    SupplyScheduleDays : DayOfWeekType[];
    [<JsonProperty(PropertyName = "shelfLifeDays")>]
    ShelfLifeDays : int;
    [<JsonProperty(PropertyName = "lifeTimeDays")>]
    LifeTimeDays : int;
    [<JsonProperty(PropertyName = "guaranteePeriodDays")>]
    GuaranteePeriodDays : int;
    [<JsonProperty(PropertyName = "processingState")>]
    ProcessingState : OfferProcessingStateDTO;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : OfferAvailabilityStatusType;
    [<JsonProperty(PropertyName = "shelfLife")>]
    ShelfLife : TimePeriodDTO;
    [<JsonProperty(PropertyName = "lifeTime")>]
    LifeTime : TimePeriodDTO;
    [<JsonProperty(PropertyName = "guaranteePeriod")>]
    GuaranteePeriod : TimePeriodDTO;
    [<JsonProperty(PropertyName = "certificate")>]
    Certificate : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
  }

  //#endregion
