namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AgeDTO
open ympa_fsharp_giraffe_server.Model.GetPriceDTO
open ympa_fsharp_giraffe_server.Model.GetPriceWithDiscountDTO
open ympa_fsharp_giraffe_server.Model.OfferCampaignStatusDTO
open ympa_fsharp_giraffe_server.Model.OfferCardStatusType
open ympa_fsharp_giraffe_server.Model.OfferConditionDTO
open ympa_fsharp_giraffe_server.Model.OfferManualDTO
open ympa_fsharp_giraffe_server.Model.OfferParamDTO
open ympa_fsharp_giraffe_server.Model.OfferSellingProgramDTO
open ympa_fsharp_giraffe_server.Model.OfferType
open ympa_fsharp_giraffe_server.Model.OfferWeightDimensionsDTO
open ympa_fsharp_giraffe_server.Model.TimePeriodDTO

module GetOfferDTO =

  //#region GetOfferDTO


  type GetOfferDTO = {
    OfferId : string;
    Name : string;
    MarketCategoryId : int64;
    Category : string;
    Pictures : string[];
    Videos : string[];
    Manuals : OfferManualDTO[];
    Vendor : string;
    Barcodes : string[];
    Description : string;
    ManufacturerCountries : string[];
    WeightDimensions : OfferWeightDimensionsDTO;
    VendorCode : string;
    Tags : string[];
    ShelfLife : TimePeriodDTO;
    LifeTime : TimePeriodDTO;
    GuaranteePeriod : TimePeriodDTO;
    CustomsCommodityCode : string;
    Certificates : string[];
    BoxCount : int;
    Condition : OfferConditionDTO;
    Type : OfferType;
    Downloadable : bool;
    Adult : bool;
    Age : AgeDTO;
    Params : OfferParamDTO[];
    BasicPrice : GetPriceWithDiscountDTO;
    PurchasePrice : GetPriceDTO;
    AdditionalExpenses : GetPriceDTO;
    CofinancePrice : GetPriceDTO;
    CardStatus : OfferCardStatusType;
    Campaigns : OfferCampaignStatusDTO[];
    SellingPrograms : OfferSellingProgramDTO[];
    Archived : bool;
  }
  //#endregion