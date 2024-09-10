namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AgeDTO
open ympa_fsharp_functions_server.Model.BasePriceDTO
open ympa_fsharp_functions_server.Model.OfferConditionDTO
open ympa_fsharp_functions_server.Model.OfferManualDTO
open ympa_fsharp_functions_server.Model.OfferParamDTO
open ympa_fsharp_functions_server.Model.OfferType
open ympa_fsharp_functions_server.Model.OfferWeightDimensionsDTO
open ympa_fsharp_functions_server.Model.ParameterValueDTO
open ympa_fsharp_functions_server.Model.TimePeriodDTO
open ympa_fsharp_functions_server.Model.UpdatePriceWithDiscountDTO

module UpdateOfferDTO =

  //#region UpdateOfferDTO

  [<CLIMutable>]
  type UpdateOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "marketCategoryId")>]
    MarketCategoryId : int64;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "pictures")>]
    Pictures : string[];
    [<JsonProperty(PropertyName = "videos")>]
    Videos : string[];
    [<JsonProperty(PropertyName = "manuals")>]
    Manuals : OfferManualDTO[];
    [<JsonProperty(PropertyName = "vendor")>]
    Vendor : string;
    [<JsonProperty(PropertyName = "barcodes")>]
    Barcodes : string[];
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "manufacturerCountries")>]
    ManufacturerCountries : string[];
    [<JsonProperty(PropertyName = "weightDimensions")>]
    WeightDimensions : OfferWeightDimensionsDTO;
    [<JsonProperty(PropertyName = "vendorCode")>]
    VendorCode : string;
    [<JsonProperty(PropertyName = "tags")>]
    Tags : string[];
    [<JsonProperty(PropertyName = "shelfLife")>]
    ShelfLife : TimePeriodDTO;
    [<JsonProperty(PropertyName = "lifeTime")>]
    LifeTime : TimePeriodDTO;
    [<JsonProperty(PropertyName = "guaranteePeriod")>]
    GuaranteePeriod : TimePeriodDTO;
    [<JsonProperty(PropertyName = "customsCommodityCode")>]
    CustomsCommodityCode : string;
    [<JsonProperty(PropertyName = "certificates")>]
    Certificates : string[];
    [<JsonProperty(PropertyName = "boxCount")>]
    BoxCount : int;
    [<JsonProperty(PropertyName = "condition")>]
    Condition : OfferConditionDTO;
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferType;
    [<JsonProperty(PropertyName = "downloadable")>]
    Downloadable : bool;
    [<JsonProperty(PropertyName = "adult")>]
    Adult : bool;
    [<JsonProperty(PropertyName = "age")>]
    Age : AgeDTO;
    [<JsonProperty(PropertyName = "params")>]
    Params : OfferParamDTO[];
    [<JsonProperty(PropertyName = "parameterValues")>]
    ParameterValues : ParameterValueDTO[];
    [<JsonProperty(PropertyName = "basicPrice")>]
    BasicPrice : UpdatePriceWithDiscountDTO;
    [<JsonProperty(PropertyName = "purchasePrice")>]
    PurchasePrice : BasePriceDTO;
    [<JsonProperty(PropertyName = "additionalExpenses")>]
    AdditionalExpenses : BasePriceDTO;
    [<JsonProperty(PropertyName = "cofinancePrice")>]
    CofinancePrice : BasePriceDTO;
  }

  //#endregion
