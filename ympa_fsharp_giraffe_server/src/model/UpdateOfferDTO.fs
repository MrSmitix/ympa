namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AgeDTO
open ympa_fsharp_giraffe_server.Model.BasePriceDTO
open ympa_fsharp_giraffe_server.Model.OfferConditionDTO
open ympa_fsharp_giraffe_server.Model.OfferManualDTO
open ympa_fsharp_giraffe_server.Model.OfferParamDTO
open ympa_fsharp_giraffe_server.Model.OfferType
open ympa_fsharp_giraffe_server.Model.OfferWeightDimensionsDTO
open ympa_fsharp_giraffe_server.Model.ParameterValueDTO
open ympa_fsharp_giraffe_server.Model.TimePeriodDTO
open ympa_fsharp_giraffe_server.Model.UpdatePriceWithDiscountDTO

module UpdateOfferDTO =

  //#region UpdateOfferDTO


  type UpdateOfferDTO = {
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
    ParameterValues : ParameterValueDTO[];
    BasicPrice : UpdatePriceWithDiscountDTO;
    PurchasePrice : BasePriceDTO;
    AdditionalExpenses : BasePriceDTO;
    CofinancePrice : BasePriceDTO;
  }
  //#endregion
