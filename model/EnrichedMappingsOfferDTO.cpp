/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "EnrichedMappingsOfferDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

EnrichedMappingsOfferDTO::EnrichedMappingsOfferDTO()
{
    m_Name = "";
    m_NameIsSet = false;
    m_ShopSku = "";
    m_ShopSkuIsSet = false;
    m_Category = "";
    m_CategoryIsSet = false;
    m_Vendor = "";
    m_VendorIsSet = false;
    m_VendorCode = "";
    m_VendorCodeIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Id = "";
    m_IdIsSet = false;
    m_FeedId = 0L;
    m_FeedIdIsSet = false;
    m_BarcodesIsSet = false;
    m_UrlsIsSet = false;
    m_PicturesIsSet = false;
    m_Manufacturer = "";
    m_ManufacturerIsSet = false;
    m_ManufacturerCountriesIsSet = false;
    m_MinShipment = 0;
    m_MinShipmentIsSet = false;
    m_TransportUnitSize = 0;
    m_TransportUnitSizeIsSet = false;
    m_QuantumOfSupply = 0;
    m_QuantumOfSupplyIsSet = false;
    m_DeliveryDurationDays = 0;
    m_DeliveryDurationDaysIsSet = false;
    m_BoxCount = 0;
    m_BoxCountIsSet = false;
    m_CustomsCommodityCodesIsSet = false;
    m_WeightDimensionsIsSet = false;
    m_SupplyScheduleDaysIsSet = false;
    m_ShelfLifeDays = 0;
    m_ShelfLifeDaysIsSet = false;
    m_LifeTimeDays = 0;
    m_LifeTimeDaysIsSet = false;
    m_GuaranteePeriodDays = 0;
    m_GuaranteePeriodDaysIsSet = false;
    m_ProcessingStateIsSet = false;
    m_AvailabilityIsSet = false;
    m_ShelfLifeIsSet = false;
    m_LifeTimeIsSet = false;
    m_GuaranteePeriodIsSet = false;
    m_Certificate = "";
    m_CertificateIsSet = false;
    m_Price = 0.0;
    m_PriceIsSet = false;
    m_MarketCategoryId = 0L;
    m_MarketCategoryIdIsSet = false;
    m_MarketCategoryName = "";
    m_MarketCategoryNameIsSet = false;
    m_MarketModelId = 0L;
    m_MarketModelIdIsSet = false;
    m_MarketModelName = "";
    m_MarketModelNameIsSet = false;
    m_MarketSku = 0L;
    m_MarketSkuIsSet = false;
    m_MarketSkuName = "";
    m_MarketSkuNameIsSet = false;
    
}

void EnrichedMappingsOfferDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool EnrichedMappingsOfferDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool EnrichedMappingsOfferDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "EnrichedMappingsOfferDTO" : pathPrefix;

         
    if (nameIsSet())
    {
        const std::string& value = m_Name;
        const std::string currentValuePath = _pathPrefix + ".name";
                
        
        if (value.length() > 256)
        {
            success = false;
            msg << currentValuePath << ": must be at most 256 characters long;";
        }

    }
         
    if (shopSkuIsSet())
    {
        const std::string& value = m_ShopSku;
        const std::string currentValuePath = _pathPrefix + ".shopSku";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 255)
        {
            success = false;
            msg << currentValuePath << ": must be at most 255 characters long;";
        }

    }
                     
    if (descriptionIsSet())
    {
        const std::string& value = m_Description;
        const std::string currentValuePath = _pathPrefix + ".description";
                
        
        if (value.length() > 6000)
        {
            success = false;
            msg << currentValuePath << ": must be at most 6000 characters long;";
        }

    }
         
    if (idIsSet())
    {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 255)
        {
            success = false;
            msg << currentValuePath << ": must be at most 255 characters long;";
        }

    }
             
    if (barcodesIsSet())
    {
        const std::vector<std::string>& value = m_Barcodes;
        const std::string currentValuePath = _pathPrefix + ".barcodes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (urlsIsSet())
    {
        const std::vector<std::string>& value = m_Urls;
        const std::string currentValuePath = _pathPrefix + ".urls";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (picturesIsSet())
    {
        const std::vector<std::string>& value = m_Pictures;
        const std::string currentValuePath = _pathPrefix + ".pictures";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
             
    if (manufacturerCountriesIsSet())
    {
        const std::vector<std::string>& value = m_ManufacturerCountries;
        const std::string currentValuePath = _pathPrefix + ".manufacturerCountries";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
                             
    if (customsCommodityCodesIsSet())
    {
        const std::vector<std::string>& value = m_CustomsCommodityCodes;
        const std::string currentValuePath = _pathPrefix + ".customsCommodityCodes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
             
    if (supplyScheduleDaysIsSet())
    {
        const std::vector<org::openapitools::server::model::DayOfWeekType>& value = m_SupplyScheduleDays;
        const std::string currentValuePath = _pathPrefix + ".supplyScheduleDays";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::DayOfWeekType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
                                                                    
    return success;
}

bool EnrichedMappingsOfferDTO::operator==(const EnrichedMappingsOfferDTO& rhs) const
{
    return
    
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!shopSkuIsSet() && !rhs.shopSkuIsSet()) || (shopSkuIsSet() && rhs.shopSkuIsSet() && getShopSku() == rhs.getShopSku())) &&
    
    
    ((!categoryIsSet() && !rhs.categoryIsSet()) || (categoryIsSet() && rhs.categoryIsSet() && getCategory() == rhs.getCategory())) &&
    
    
    ((!vendorIsSet() && !rhs.vendorIsSet()) || (vendorIsSet() && rhs.vendorIsSet() && getVendor() == rhs.getVendor())) &&
    
    
    ((!vendorCodeIsSet() && !rhs.vendorCodeIsSet()) || (vendorCodeIsSet() && rhs.vendorCodeIsSet() && getVendorCode() == rhs.getVendorCode())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!feedIdIsSet() && !rhs.feedIdIsSet()) || (feedIdIsSet() && rhs.feedIdIsSet() && getFeedId() == rhs.getFeedId())) &&
    
    
    ((!barcodesIsSet() && !rhs.barcodesIsSet()) || (barcodesIsSet() && rhs.barcodesIsSet() && getBarcodes() == rhs.getBarcodes())) &&
    
    
    ((!urlsIsSet() && !rhs.urlsIsSet()) || (urlsIsSet() && rhs.urlsIsSet() && getUrls() == rhs.getUrls())) &&
    
    
    ((!picturesIsSet() && !rhs.picturesIsSet()) || (picturesIsSet() && rhs.picturesIsSet() && getPictures() == rhs.getPictures())) &&
    
    
    ((!manufacturerIsSet() && !rhs.manufacturerIsSet()) || (manufacturerIsSet() && rhs.manufacturerIsSet() && getManufacturer() == rhs.getManufacturer())) &&
    
    
    ((!manufacturerCountriesIsSet() && !rhs.manufacturerCountriesIsSet()) || (manufacturerCountriesIsSet() && rhs.manufacturerCountriesIsSet() && getManufacturerCountries() == rhs.getManufacturerCountries())) &&
    
    
    ((!minShipmentIsSet() && !rhs.minShipmentIsSet()) || (minShipmentIsSet() && rhs.minShipmentIsSet() && getMinShipment() == rhs.getMinShipment())) &&
    
    
    ((!transportUnitSizeIsSet() && !rhs.transportUnitSizeIsSet()) || (transportUnitSizeIsSet() && rhs.transportUnitSizeIsSet() && getTransportUnitSize() == rhs.getTransportUnitSize())) &&
    
    
    ((!quantumOfSupplyIsSet() && !rhs.quantumOfSupplyIsSet()) || (quantumOfSupplyIsSet() && rhs.quantumOfSupplyIsSet() && getQuantumOfSupply() == rhs.getQuantumOfSupply())) &&
    
    
    ((!deliveryDurationDaysIsSet() && !rhs.deliveryDurationDaysIsSet()) || (deliveryDurationDaysIsSet() && rhs.deliveryDurationDaysIsSet() && getDeliveryDurationDays() == rhs.getDeliveryDurationDays())) &&
    
    
    ((!boxCountIsSet() && !rhs.boxCountIsSet()) || (boxCountIsSet() && rhs.boxCountIsSet() && getBoxCount() == rhs.getBoxCount())) &&
    
    
    ((!customsCommodityCodesIsSet() && !rhs.customsCommodityCodesIsSet()) || (customsCommodityCodesIsSet() && rhs.customsCommodityCodesIsSet() && getCustomsCommodityCodes() == rhs.getCustomsCommodityCodes())) &&
    
    
    ((!weightDimensionsIsSet() && !rhs.weightDimensionsIsSet()) || (weightDimensionsIsSet() && rhs.weightDimensionsIsSet() && getWeightDimensions() == rhs.getWeightDimensions())) &&
    
    
    ((!supplyScheduleDaysIsSet() && !rhs.supplyScheduleDaysIsSet()) || (supplyScheduleDaysIsSet() && rhs.supplyScheduleDaysIsSet() && getSupplyScheduleDays() == rhs.getSupplyScheduleDays())) &&
    
    
    ((!shelfLifeDaysIsSet() && !rhs.shelfLifeDaysIsSet()) || (shelfLifeDaysIsSet() && rhs.shelfLifeDaysIsSet() && getShelfLifeDays() == rhs.getShelfLifeDays())) &&
    
    
    ((!lifeTimeDaysIsSet() && !rhs.lifeTimeDaysIsSet()) || (lifeTimeDaysIsSet() && rhs.lifeTimeDaysIsSet() && getLifeTimeDays() == rhs.getLifeTimeDays())) &&
    
    
    ((!guaranteePeriodDaysIsSet() && !rhs.guaranteePeriodDaysIsSet()) || (guaranteePeriodDaysIsSet() && rhs.guaranteePeriodDaysIsSet() && getGuaranteePeriodDays() == rhs.getGuaranteePeriodDays())) &&
    
    
    ((!processingStateIsSet() && !rhs.processingStateIsSet()) || (processingStateIsSet() && rhs.processingStateIsSet() && getProcessingState() == rhs.getProcessingState())) &&
    
    
    ((!availabilityIsSet() && !rhs.availabilityIsSet()) || (availabilityIsSet() && rhs.availabilityIsSet() && getAvailability() == rhs.getAvailability())) &&
    
    
    ((!shelfLifeIsSet() && !rhs.shelfLifeIsSet()) || (shelfLifeIsSet() && rhs.shelfLifeIsSet() && getShelfLife() == rhs.getShelfLife())) &&
    
    
    ((!lifeTimeIsSet() && !rhs.lifeTimeIsSet()) || (lifeTimeIsSet() && rhs.lifeTimeIsSet() && getLifeTime() == rhs.getLifeTime())) &&
    
    
    ((!guaranteePeriodIsSet() && !rhs.guaranteePeriodIsSet()) || (guaranteePeriodIsSet() && rhs.guaranteePeriodIsSet() && getGuaranteePeriod() == rhs.getGuaranteePeriod())) &&
    
    
    ((!certificateIsSet() && !rhs.certificateIsSet()) || (certificateIsSet() && rhs.certificateIsSet() && getCertificate() == rhs.getCertificate())) &&
    
    
    ((!priceIsSet() && !rhs.priceIsSet()) || (priceIsSet() && rhs.priceIsSet() && getPrice() == rhs.getPrice())) &&
    
    
    ((!marketCategoryIdIsSet() && !rhs.marketCategoryIdIsSet()) || (marketCategoryIdIsSet() && rhs.marketCategoryIdIsSet() && getMarketCategoryId() == rhs.getMarketCategoryId())) &&
    
    
    ((!marketCategoryNameIsSet() && !rhs.marketCategoryNameIsSet()) || (marketCategoryNameIsSet() && rhs.marketCategoryNameIsSet() && getMarketCategoryName() == rhs.getMarketCategoryName())) &&
    
    
    ((!marketModelIdIsSet() && !rhs.marketModelIdIsSet()) || (marketModelIdIsSet() && rhs.marketModelIdIsSet() && getMarketModelId() == rhs.getMarketModelId())) &&
    
    
    ((!marketModelNameIsSet() && !rhs.marketModelNameIsSet()) || (marketModelNameIsSet() && rhs.marketModelNameIsSet() && getMarketModelName() == rhs.getMarketModelName())) &&
    
    
    ((!marketSkuIsSet() && !rhs.marketSkuIsSet()) || (marketSkuIsSet() && rhs.marketSkuIsSet() && getMarketSku() == rhs.getMarketSku())) &&
    
    
    ((!marketSkuNameIsSet() && !rhs.marketSkuNameIsSet()) || (marketSkuNameIsSet() && rhs.marketSkuNameIsSet() && getMarketSkuName() == rhs.getMarketSkuName()))
    
    ;
}

bool EnrichedMappingsOfferDTO::operator!=(const EnrichedMappingsOfferDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const EnrichedMappingsOfferDTO& o)
{
    j = nlohmann::json::object();
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.shopSkuIsSet())
        j["shopSku"] = o.m_ShopSku;
    if(o.categoryIsSet())
        j["category"] = o.m_Category;
    if(o.vendorIsSet())
        j["vendor"] = o.m_Vendor;
    if(o.vendorCodeIsSet())
        j["vendorCode"] = o.m_VendorCode;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.feedIdIsSet())
        j["feedId"] = o.m_FeedId;
    if(o.barcodesIsSet() || !o.m_Barcodes.empty())
        j["barcodes"] = o.m_Barcodes;
    if(o.urlsIsSet() || !o.m_Urls.empty())
        j["urls"] = o.m_Urls;
    if(o.picturesIsSet() || !o.m_Pictures.empty())
        j["pictures"] = o.m_Pictures;
    if(o.manufacturerIsSet())
        j["manufacturer"] = o.m_Manufacturer;
    if(o.manufacturerCountriesIsSet() || !o.m_ManufacturerCountries.empty())
        j["manufacturerCountries"] = o.m_ManufacturerCountries;
    if(o.minShipmentIsSet())
        j["minShipment"] = o.m_MinShipment;
    if(o.transportUnitSizeIsSet())
        j["transportUnitSize"] = o.m_TransportUnitSize;
    if(o.quantumOfSupplyIsSet())
        j["quantumOfSupply"] = o.m_QuantumOfSupply;
    if(o.deliveryDurationDaysIsSet())
        j["deliveryDurationDays"] = o.m_DeliveryDurationDays;
    if(o.boxCountIsSet())
        j["boxCount"] = o.m_BoxCount;
    if(o.customsCommodityCodesIsSet() || !o.m_CustomsCommodityCodes.empty())
        j["customsCommodityCodes"] = o.m_CustomsCommodityCodes;
    if(o.weightDimensionsIsSet())
        j["weightDimensions"] = o.m_WeightDimensions;
    if(o.supplyScheduleDaysIsSet() || !o.m_SupplyScheduleDays.empty())
        j["supplyScheduleDays"] = o.m_SupplyScheduleDays;
    if(o.shelfLifeDaysIsSet())
        j["shelfLifeDays"] = o.m_ShelfLifeDays;
    if(o.lifeTimeDaysIsSet())
        j["lifeTimeDays"] = o.m_LifeTimeDays;
    if(o.guaranteePeriodDaysIsSet())
        j["guaranteePeriodDays"] = o.m_GuaranteePeriodDays;
    if(o.processingStateIsSet())
        j["processingState"] = o.m_ProcessingState;
    if(o.availabilityIsSet())
        j["availability"] = o.m_Availability;
    if(o.shelfLifeIsSet())
        j["shelfLife"] = o.m_ShelfLife;
    if(o.lifeTimeIsSet())
        j["lifeTime"] = o.m_LifeTime;
    if(o.guaranteePeriodIsSet())
        j["guaranteePeriod"] = o.m_GuaranteePeriod;
    if(o.certificateIsSet())
        j["certificate"] = o.m_Certificate;
    if(o.priceIsSet())
        j["price"] = o.m_Price;
    if(o.marketCategoryIdIsSet())
        j["marketCategoryId"] = o.m_MarketCategoryId;
    if(o.marketCategoryNameIsSet())
        j["marketCategoryName"] = o.m_MarketCategoryName;
    if(o.marketModelIdIsSet())
        j["marketModelId"] = o.m_MarketModelId;
    if(o.marketModelNameIsSet())
        j["marketModelName"] = o.m_MarketModelName;
    if(o.marketSkuIsSet())
        j["marketSku"] = o.m_MarketSku;
    if(o.marketSkuNameIsSet())
        j["marketSkuName"] = o.m_MarketSkuName;
    
}

void from_json(const nlohmann::json& j, EnrichedMappingsOfferDTO& o)
{
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("shopSku") != j.end())
    {
        j.at("shopSku").get_to(o.m_ShopSku);
        o.m_ShopSkuIsSet = true;
    } 
    if(j.find("category") != j.end())
    {
        j.at("category").get_to(o.m_Category);
        o.m_CategoryIsSet = true;
    } 
    if(j.find("vendor") != j.end())
    {
        j.at("vendor").get_to(o.m_Vendor);
        o.m_VendorIsSet = true;
    } 
    if(j.find("vendorCode") != j.end())
    {
        j.at("vendorCode").get_to(o.m_VendorCode);
        o.m_VendorCodeIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("feedId") != j.end())
    {
        j.at("feedId").get_to(o.m_FeedId);
        o.m_FeedIdIsSet = true;
    } 
    if(j.find("barcodes") != j.end())
    {
        j.at("barcodes").get_to(o.m_Barcodes);
        o.m_BarcodesIsSet = true;
    } 
    if(j.find("urls") != j.end())
    {
        j.at("urls").get_to(o.m_Urls);
        o.m_UrlsIsSet = true;
    } 
    if(j.find("pictures") != j.end())
    {
        j.at("pictures").get_to(o.m_Pictures);
        o.m_PicturesIsSet = true;
    } 
    if(j.find("manufacturer") != j.end())
    {
        j.at("manufacturer").get_to(o.m_Manufacturer);
        o.m_ManufacturerIsSet = true;
    } 
    if(j.find("manufacturerCountries") != j.end())
    {
        j.at("manufacturerCountries").get_to(o.m_ManufacturerCountries);
        o.m_ManufacturerCountriesIsSet = true;
    } 
    if(j.find("minShipment") != j.end())
    {
        j.at("minShipment").get_to(o.m_MinShipment);
        o.m_MinShipmentIsSet = true;
    } 
    if(j.find("transportUnitSize") != j.end())
    {
        j.at("transportUnitSize").get_to(o.m_TransportUnitSize);
        o.m_TransportUnitSizeIsSet = true;
    } 
    if(j.find("quantumOfSupply") != j.end())
    {
        j.at("quantumOfSupply").get_to(o.m_QuantumOfSupply);
        o.m_QuantumOfSupplyIsSet = true;
    } 
    if(j.find("deliveryDurationDays") != j.end())
    {
        j.at("deliveryDurationDays").get_to(o.m_DeliveryDurationDays);
        o.m_DeliveryDurationDaysIsSet = true;
    } 
    if(j.find("boxCount") != j.end())
    {
        j.at("boxCount").get_to(o.m_BoxCount);
        o.m_BoxCountIsSet = true;
    } 
    if(j.find("customsCommodityCodes") != j.end())
    {
        j.at("customsCommodityCodes").get_to(o.m_CustomsCommodityCodes);
        o.m_CustomsCommodityCodesIsSet = true;
    } 
    if(j.find("weightDimensions") != j.end())
    {
        j.at("weightDimensions").get_to(o.m_WeightDimensions);
        o.m_WeightDimensionsIsSet = true;
    } 
    if(j.find("supplyScheduleDays") != j.end())
    {
        j.at("supplyScheduleDays").get_to(o.m_SupplyScheduleDays);
        o.m_SupplyScheduleDaysIsSet = true;
    } 
    if(j.find("shelfLifeDays") != j.end())
    {
        j.at("shelfLifeDays").get_to(o.m_ShelfLifeDays);
        o.m_ShelfLifeDaysIsSet = true;
    } 
    if(j.find("lifeTimeDays") != j.end())
    {
        j.at("lifeTimeDays").get_to(o.m_LifeTimeDays);
        o.m_LifeTimeDaysIsSet = true;
    } 
    if(j.find("guaranteePeriodDays") != j.end())
    {
        j.at("guaranteePeriodDays").get_to(o.m_GuaranteePeriodDays);
        o.m_GuaranteePeriodDaysIsSet = true;
    } 
    if(j.find("processingState") != j.end())
    {
        j.at("processingState").get_to(o.m_ProcessingState);
        o.m_ProcessingStateIsSet = true;
    } 
    if(j.find("availability") != j.end())
    {
        j.at("availability").get_to(o.m_Availability);
        o.m_AvailabilityIsSet = true;
    } 
    if(j.find("shelfLife") != j.end())
    {
        j.at("shelfLife").get_to(o.m_ShelfLife);
        o.m_ShelfLifeIsSet = true;
    } 
    if(j.find("lifeTime") != j.end())
    {
        j.at("lifeTime").get_to(o.m_LifeTime);
        o.m_LifeTimeIsSet = true;
    } 
    if(j.find("guaranteePeriod") != j.end())
    {
        j.at("guaranteePeriod").get_to(o.m_GuaranteePeriod);
        o.m_GuaranteePeriodIsSet = true;
    } 
    if(j.find("certificate") != j.end())
    {
        j.at("certificate").get_to(o.m_Certificate);
        o.m_CertificateIsSet = true;
    } 
    if(j.find("price") != j.end())
    {
        j.at("price").get_to(o.m_Price);
        o.m_PriceIsSet = true;
    } 
    if(j.find("marketCategoryId") != j.end())
    {
        j.at("marketCategoryId").get_to(o.m_MarketCategoryId);
        o.m_MarketCategoryIdIsSet = true;
    } 
    if(j.find("marketCategoryName") != j.end())
    {
        j.at("marketCategoryName").get_to(o.m_MarketCategoryName);
        o.m_MarketCategoryNameIsSet = true;
    } 
    if(j.find("marketModelId") != j.end())
    {
        j.at("marketModelId").get_to(o.m_MarketModelId);
        o.m_MarketModelIdIsSet = true;
    } 
    if(j.find("marketModelName") != j.end())
    {
        j.at("marketModelName").get_to(o.m_MarketModelName);
        o.m_MarketModelNameIsSet = true;
    } 
    if(j.find("marketSku") != j.end())
    {
        j.at("marketSku").get_to(o.m_MarketSku);
        o.m_MarketSkuIsSet = true;
    } 
    if(j.find("marketSkuName") != j.end())
    {
        j.at("marketSkuName").get_to(o.m_MarketSkuName);
        o.m_MarketSkuNameIsSet = true;
    } 
    
}

std::string EnrichedMappingsOfferDTO::getName() const
{
    return m_Name;
}
void EnrichedMappingsOfferDTO::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool EnrichedMappingsOfferDTO::nameIsSet() const
{
    return m_NameIsSet;
}
void EnrichedMappingsOfferDTO::unsetName()
{
    m_NameIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getShopSku() const
{
    return m_ShopSku;
}
void EnrichedMappingsOfferDTO::setShopSku(std::string const& value)
{
    m_ShopSku = value;
    m_ShopSkuIsSet = true;
}
bool EnrichedMappingsOfferDTO::shopSkuIsSet() const
{
    return m_ShopSkuIsSet;
}
void EnrichedMappingsOfferDTO::unsetShopSku()
{
    m_ShopSkuIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getCategory() const
{
    return m_Category;
}
void EnrichedMappingsOfferDTO::setCategory(std::string const& value)
{
    m_Category = value;
    m_CategoryIsSet = true;
}
bool EnrichedMappingsOfferDTO::categoryIsSet() const
{
    return m_CategoryIsSet;
}
void EnrichedMappingsOfferDTO::unsetCategory()
{
    m_CategoryIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getVendor() const
{
    return m_Vendor;
}
void EnrichedMappingsOfferDTO::setVendor(std::string const& value)
{
    m_Vendor = value;
    m_VendorIsSet = true;
}
bool EnrichedMappingsOfferDTO::vendorIsSet() const
{
    return m_VendorIsSet;
}
void EnrichedMappingsOfferDTO::unsetVendor()
{
    m_VendorIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getVendorCode() const
{
    return m_VendorCode;
}
void EnrichedMappingsOfferDTO::setVendorCode(std::string const& value)
{
    m_VendorCode = value;
    m_VendorCodeIsSet = true;
}
bool EnrichedMappingsOfferDTO::vendorCodeIsSet() const
{
    return m_VendorCodeIsSet;
}
void EnrichedMappingsOfferDTO::unsetVendorCode()
{
    m_VendorCodeIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getDescription() const
{
    return m_Description;
}
void EnrichedMappingsOfferDTO::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool EnrichedMappingsOfferDTO::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void EnrichedMappingsOfferDTO::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getId() const
{
    return m_Id;
}
void EnrichedMappingsOfferDTO::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool EnrichedMappingsOfferDTO::idIsSet() const
{
    return m_IdIsSet;
}
void EnrichedMappingsOfferDTO::unsetId()
{
    m_IdIsSet = false;
}
int64_t EnrichedMappingsOfferDTO::getFeedId() const
{
    return m_FeedId;
}
void EnrichedMappingsOfferDTO::setFeedId(int64_t const value)
{
    m_FeedId = value;
    m_FeedIdIsSet = true;
}
bool EnrichedMappingsOfferDTO::feedIdIsSet() const
{
    return m_FeedIdIsSet;
}
void EnrichedMappingsOfferDTO::unsetFeedId()
{
    m_FeedIdIsSet = false;
}
std::vector<std::string> EnrichedMappingsOfferDTO::getBarcodes() const
{
    return m_Barcodes;
}
void EnrichedMappingsOfferDTO::setBarcodes(std::vector<std::string> const& value)
{
    m_Barcodes = value;
    m_BarcodesIsSet = true;
}
bool EnrichedMappingsOfferDTO::barcodesIsSet() const
{
    return m_BarcodesIsSet;
}
void EnrichedMappingsOfferDTO::unsetBarcodes()
{
    m_BarcodesIsSet = false;
}
std::vector<std::string> EnrichedMappingsOfferDTO::getUrls() const
{
    return m_Urls;
}
void EnrichedMappingsOfferDTO::setUrls(std::vector<std::string> const& value)
{
    m_Urls = value;
    m_UrlsIsSet = true;
}
bool EnrichedMappingsOfferDTO::urlsIsSet() const
{
    return m_UrlsIsSet;
}
void EnrichedMappingsOfferDTO::unsetUrls()
{
    m_UrlsIsSet = false;
}
std::vector<std::string> EnrichedMappingsOfferDTO::getPictures() const
{
    return m_Pictures;
}
void EnrichedMappingsOfferDTO::setPictures(std::vector<std::string> const& value)
{
    m_Pictures = value;
    m_PicturesIsSet = true;
}
bool EnrichedMappingsOfferDTO::picturesIsSet() const
{
    return m_PicturesIsSet;
}
void EnrichedMappingsOfferDTO::unsetPictures()
{
    m_PicturesIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getManufacturer() const
{
    return m_Manufacturer;
}
void EnrichedMappingsOfferDTO::setManufacturer(std::string const& value)
{
    m_Manufacturer = value;
    m_ManufacturerIsSet = true;
}
bool EnrichedMappingsOfferDTO::manufacturerIsSet() const
{
    return m_ManufacturerIsSet;
}
void EnrichedMappingsOfferDTO::unsetManufacturer()
{
    m_ManufacturerIsSet = false;
}
std::vector<std::string> EnrichedMappingsOfferDTO::getManufacturerCountries() const
{
    return m_ManufacturerCountries;
}
void EnrichedMappingsOfferDTO::setManufacturerCountries(std::vector<std::string> const& value)
{
    m_ManufacturerCountries = value;
    m_ManufacturerCountriesIsSet = true;
}
bool EnrichedMappingsOfferDTO::manufacturerCountriesIsSet() const
{
    return m_ManufacturerCountriesIsSet;
}
void EnrichedMappingsOfferDTO::unsetManufacturerCountries()
{
    m_ManufacturerCountriesIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getMinShipment() const
{
    return m_MinShipment;
}
void EnrichedMappingsOfferDTO::setMinShipment(int32_t const value)
{
    m_MinShipment = value;
    m_MinShipmentIsSet = true;
}
bool EnrichedMappingsOfferDTO::minShipmentIsSet() const
{
    return m_MinShipmentIsSet;
}
void EnrichedMappingsOfferDTO::unsetMinShipment()
{
    m_MinShipmentIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getTransportUnitSize() const
{
    return m_TransportUnitSize;
}
void EnrichedMappingsOfferDTO::setTransportUnitSize(int32_t const value)
{
    m_TransportUnitSize = value;
    m_TransportUnitSizeIsSet = true;
}
bool EnrichedMappingsOfferDTO::transportUnitSizeIsSet() const
{
    return m_TransportUnitSizeIsSet;
}
void EnrichedMappingsOfferDTO::unsetTransportUnitSize()
{
    m_TransportUnitSizeIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getQuantumOfSupply() const
{
    return m_QuantumOfSupply;
}
void EnrichedMappingsOfferDTO::setQuantumOfSupply(int32_t const value)
{
    m_QuantumOfSupply = value;
    m_QuantumOfSupplyIsSet = true;
}
bool EnrichedMappingsOfferDTO::quantumOfSupplyIsSet() const
{
    return m_QuantumOfSupplyIsSet;
}
void EnrichedMappingsOfferDTO::unsetQuantumOfSupply()
{
    m_QuantumOfSupplyIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getDeliveryDurationDays() const
{
    return m_DeliveryDurationDays;
}
void EnrichedMappingsOfferDTO::setDeliveryDurationDays(int32_t const value)
{
    m_DeliveryDurationDays = value;
    m_DeliveryDurationDaysIsSet = true;
}
bool EnrichedMappingsOfferDTO::deliveryDurationDaysIsSet() const
{
    return m_DeliveryDurationDaysIsSet;
}
void EnrichedMappingsOfferDTO::unsetDeliveryDurationDays()
{
    m_DeliveryDurationDaysIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getBoxCount() const
{
    return m_BoxCount;
}
void EnrichedMappingsOfferDTO::setBoxCount(int32_t const value)
{
    m_BoxCount = value;
    m_BoxCountIsSet = true;
}
bool EnrichedMappingsOfferDTO::boxCountIsSet() const
{
    return m_BoxCountIsSet;
}
void EnrichedMappingsOfferDTO::unsetBoxCount()
{
    m_BoxCountIsSet = false;
}
std::vector<std::string> EnrichedMappingsOfferDTO::getCustomsCommodityCodes() const
{
    return m_CustomsCommodityCodes;
}
void EnrichedMappingsOfferDTO::setCustomsCommodityCodes(std::vector<std::string> const& value)
{
    m_CustomsCommodityCodes = value;
    m_CustomsCommodityCodesIsSet = true;
}
bool EnrichedMappingsOfferDTO::customsCommodityCodesIsSet() const
{
    return m_CustomsCommodityCodesIsSet;
}
void EnrichedMappingsOfferDTO::unsetCustomsCommodityCodes()
{
    m_CustomsCommodityCodesIsSet = false;
}
org::openapitools::server::model::OfferWeightDimensionsDTO EnrichedMappingsOfferDTO::getWeightDimensions() const
{
    return m_WeightDimensions;
}
void EnrichedMappingsOfferDTO::setWeightDimensions(org::openapitools::server::model::OfferWeightDimensionsDTO const& value)
{
    m_WeightDimensions = value;
    m_WeightDimensionsIsSet = true;
}
bool EnrichedMappingsOfferDTO::weightDimensionsIsSet() const
{
    return m_WeightDimensionsIsSet;
}
void EnrichedMappingsOfferDTO::unsetWeightDimensions()
{
    m_WeightDimensionsIsSet = false;
}
std::vector<org::openapitools::server::model::DayOfWeekType> EnrichedMappingsOfferDTO::getSupplyScheduleDays() const
{
    return m_SupplyScheduleDays;
}
void EnrichedMappingsOfferDTO::setSupplyScheduleDays(std::vector<org::openapitools::server::model::DayOfWeekType> const& value)
{
    m_SupplyScheduleDays = value;
    m_SupplyScheduleDaysIsSet = true;
}
bool EnrichedMappingsOfferDTO::supplyScheduleDaysIsSet() const
{
    return m_SupplyScheduleDaysIsSet;
}
void EnrichedMappingsOfferDTO::unsetSupplyScheduleDays()
{
    m_SupplyScheduleDaysIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getShelfLifeDays() const
{
    return m_ShelfLifeDays;
}
void EnrichedMappingsOfferDTO::setShelfLifeDays(int32_t const value)
{
    m_ShelfLifeDays = value;
    m_ShelfLifeDaysIsSet = true;
}
bool EnrichedMappingsOfferDTO::shelfLifeDaysIsSet() const
{
    return m_ShelfLifeDaysIsSet;
}
void EnrichedMappingsOfferDTO::unsetShelfLifeDays()
{
    m_ShelfLifeDaysIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getLifeTimeDays() const
{
    return m_LifeTimeDays;
}
void EnrichedMappingsOfferDTO::setLifeTimeDays(int32_t const value)
{
    m_LifeTimeDays = value;
    m_LifeTimeDaysIsSet = true;
}
bool EnrichedMappingsOfferDTO::lifeTimeDaysIsSet() const
{
    return m_LifeTimeDaysIsSet;
}
void EnrichedMappingsOfferDTO::unsetLifeTimeDays()
{
    m_LifeTimeDaysIsSet = false;
}
int32_t EnrichedMappingsOfferDTO::getGuaranteePeriodDays() const
{
    return m_GuaranteePeriodDays;
}
void EnrichedMappingsOfferDTO::setGuaranteePeriodDays(int32_t const value)
{
    m_GuaranteePeriodDays = value;
    m_GuaranteePeriodDaysIsSet = true;
}
bool EnrichedMappingsOfferDTO::guaranteePeriodDaysIsSet() const
{
    return m_GuaranteePeriodDaysIsSet;
}
void EnrichedMappingsOfferDTO::unsetGuaranteePeriodDays()
{
    m_GuaranteePeriodDaysIsSet = false;
}
org::openapitools::server::model::OfferProcessingStateDTO EnrichedMappingsOfferDTO::getProcessingState() const
{
    return m_ProcessingState;
}
void EnrichedMappingsOfferDTO::setProcessingState(org::openapitools::server::model::OfferProcessingStateDTO const& value)
{
    m_ProcessingState = value;
    m_ProcessingStateIsSet = true;
}
bool EnrichedMappingsOfferDTO::processingStateIsSet() const
{
    return m_ProcessingStateIsSet;
}
void EnrichedMappingsOfferDTO::unsetProcessingState()
{
    m_ProcessingStateIsSet = false;
}
org::openapitools::server::model::OfferAvailabilityStatusType EnrichedMappingsOfferDTO::getAvailability() const
{
    return m_Availability;
}
void EnrichedMappingsOfferDTO::setAvailability(org::openapitools::server::model::OfferAvailabilityStatusType const& value)
{
    m_Availability = value;
    m_AvailabilityIsSet = true;
}
bool EnrichedMappingsOfferDTO::availabilityIsSet() const
{
    return m_AvailabilityIsSet;
}
void EnrichedMappingsOfferDTO::unsetAvailability()
{
    m_AvailabilityIsSet = false;
}
org::openapitools::server::model::TimePeriodDTO EnrichedMappingsOfferDTO::getShelfLife() const
{
    return m_ShelfLife;
}
void EnrichedMappingsOfferDTO::setShelfLife(org::openapitools::server::model::TimePeriodDTO const& value)
{
    m_ShelfLife = value;
    m_ShelfLifeIsSet = true;
}
bool EnrichedMappingsOfferDTO::shelfLifeIsSet() const
{
    return m_ShelfLifeIsSet;
}
void EnrichedMappingsOfferDTO::unsetShelfLife()
{
    m_ShelfLifeIsSet = false;
}
org::openapitools::server::model::TimePeriodDTO EnrichedMappingsOfferDTO::getLifeTime() const
{
    return m_LifeTime;
}
void EnrichedMappingsOfferDTO::setLifeTime(org::openapitools::server::model::TimePeriodDTO const& value)
{
    m_LifeTime = value;
    m_LifeTimeIsSet = true;
}
bool EnrichedMappingsOfferDTO::lifeTimeIsSet() const
{
    return m_LifeTimeIsSet;
}
void EnrichedMappingsOfferDTO::unsetLifeTime()
{
    m_LifeTimeIsSet = false;
}
org::openapitools::server::model::TimePeriodDTO EnrichedMappingsOfferDTO::getGuaranteePeriod() const
{
    return m_GuaranteePeriod;
}
void EnrichedMappingsOfferDTO::setGuaranteePeriod(org::openapitools::server::model::TimePeriodDTO const& value)
{
    m_GuaranteePeriod = value;
    m_GuaranteePeriodIsSet = true;
}
bool EnrichedMappingsOfferDTO::guaranteePeriodIsSet() const
{
    return m_GuaranteePeriodIsSet;
}
void EnrichedMappingsOfferDTO::unsetGuaranteePeriod()
{
    m_GuaranteePeriodIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getCertificate() const
{
    return m_Certificate;
}
void EnrichedMappingsOfferDTO::setCertificate(std::string const& value)
{
    m_Certificate = value;
    m_CertificateIsSet = true;
}
bool EnrichedMappingsOfferDTO::certificateIsSet() const
{
    return m_CertificateIsSet;
}
void EnrichedMappingsOfferDTO::unsetCertificate()
{
    m_CertificateIsSet = false;
}
double EnrichedMappingsOfferDTO::getPrice() const
{
    return m_Price;
}
void EnrichedMappingsOfferDTO::setPrice(double const value)
{
    m_Price = value;
    m_PriceIsSet = true;
}
bool EnrichedMappingsOfferDTO::priceIsSet() const
{
    return m_PriceIsSet;
}
void EnrichedMappingsOfferDTO::unsetPrice()
{
    m_PriceIsSet = false;
}
int64_t EnrichedMappingsOfferDTO::getMarketCategoryId() const
{
    return m_MarketCategoryId;
}
void EnrichedMappingsOfferDTO::setMarketCategoryId(int64_t const value)
{
    m_MarketCategoryId = value;
    m_MarketCategoryIdIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketCategoryIdIsSet() const
{
    return m_MarketCategoryIdIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketCategoryId()
{
    m_MarketCategoryIdIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getMarketCategoryName() const
{
    return m_MarketCategoryName;
}
void EnrichedMappingsOfferDTO::setMarketCategoryName(std::string const& value)
{
    m_MarketCategoryName = value;
    m_MarketCategoryNameIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketCategoryNameIsSet() const
{
    return m_MarketCategoryNameIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketCategoryName()
{
    m_MarketCategoryNameIsSet = false;
}
int64_t EnrichedMappingsOfferDTO::getMarketModelId() const
{
    return m_MarketModelId;
}
void EnrichedMappingsOfferDTO::setMarketModelId(int64_t const value)
{
    m_MarketModelId = value;
    m_MarketModelIdIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketModelIdIsSet() const
{
    return m_MarketModelIdIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketModelId()
{
    m_MarketModelIdIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getMarketModelName() const
{
    return m_MarketModelName;
}
void EnrichedMappingsOfferDTO::setMarketModelName(std::string const& value)
{
    m_MarketModelName = value;
    m_MarketModelNameIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketModelNameIsSet() const
{
    return m_MarketModelNameIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketModelName()
{
    m_MarketModelNameIsSet = false;
}
int64_t EnrichedMappingsOfferDTO::getMarketSku() const
{
    return m_MarketSku;
}
void EnrichedMappingsOfferDTO::setMarketSku(int64_t const value)
{
    m_MarketSku = value;
    m_MarketSkuIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketSkuIsSet() const
{
    return m_MarketSkuIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketSku()
{
    m_MarketSkuIsSet = false;
}
std::string EnrichedMappingsOfferDTO::getMarketSkuName() const
{
    return m_MarketSkuName;
}
void EnrichedMappingsOfferDTO::setMarketSkuName(std::string const& value)
{
    m_MarketSkuName = value;
    m_MarketSkuNameIsSet = true;
}
bool EnrichedMappingsOfferDTO::marketSkuNameIsSet() const
{
    return m_MarketSkuNameIsSet;
}
void EnrichedMappingsOfferDTO::unsetMarketSkuName()
{
    m_MarketSkuNameIsSet = false;
}


} // namespace org::openapitools::server::model

