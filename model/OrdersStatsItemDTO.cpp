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


#include "OrdersStatsItemDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrdersStatsItemDTO::OrdersStatsItemDTO()
{
    m_OfferName = "";
    m_OfferNameIsSet = false;
    m_MarketSku = 0L;
    m_MarketSkuIsSet = false;
    m_ShopSku = "";
    m_ShopSkuIsSet = false;
    m_Count = 0;
    m_CountIsSet = false;
    m_PricesIsSet = false;
    m_WarehouseIsSet = false;
    m_DetailsIsSet = false;
    m_CisListIsSet = false;
    m_InitialCount = 0;
    m_InitialCountIsSet = false;
    m_BidFee = 0;
    m_BidFeeIsSet = false;
    m_CofinanceThreshold = 0.0;
    m_CofinanceThresholdIsSet = false;
    m_CofinanceValue = 0.0;
    m_CofinanceValueIsSet = false;
    
}

void OrdersStatsItemDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrdersStatsItemDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrdersStatsItemDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrdersStatsItemDTO" : pathPrefix;

                 
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
             
    if (pricesIsSet())
    {
        const std::vector<org::openapitools::server::model::OrdersStatsPriceDTO>& value = m_Prices;
        const std::string currentValuePath = _pathPrefix + ".prices";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OrdersStatsPriceDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".prices") && success;
 
                i++;
            }
        }

    }
             
    if (detailsIsSet())
    {
        const std::vector<org::openapitools::server::model::OrdersStatsDetailsDTO>& value = m_Details;
        const std::string currentValuePath = _pathPrefix + ".details";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OrdersStatsDetailsDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".details") && success;
 
                i++;
            }
        }

    }
         
    if (cisListIsSet())
    {
        const std::vector<std::string>& value = m_CisList;
        const std::string currentValuePath = _pathPrefix + ".cisList";
                
        
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
             
    if (bidFeeIsSet())
    {
        const int32_t& value = m_BidFee;
        const std::string currentValuePath = _pathPrefix + ".bidFee";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 10000)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 10000;";
        }

    }
            
    return success;
}

bool OrdersStatsItemDTO::operator==(const OrdersStatsItemDTO& rhs) const
{
    return
    
    
    
    ((!offerNameIsSet() && !rhs.offerNameIsSet()) || (offerNameIsSet() && rhs.offerNameIsSet() && getOfferName() == rhs.getOfferName())) &&
    
    
    ((!marketSkuIsSet() && !rhs.marketSkuIsSet()) || (marketSkuIsSet() && rhs.marketSkuIsSet() && getMarketSku() == rhs.getMarketSku())) &&
    
    
    ((!shopSkuIsSet() && !rhs.shopSkuIsSet()) || (shopSkuIsSet() && rhs.shopSkuIsSet() && getShopSku() == rhs.getShopSku())) &&
    
    
    ((!countIsSet() && !rhs.countIsSet()) || (countIsSet() && rhs.countIsSet() && getCount() == rhs.getCount())) &&
    
    
    ((!pricesIsSet() && !rhs.pricesIsSet()) || (pricesIsSet() && rhs.pricesIsSet() && getPrices() == rhs.getPrices())) &&
    
    
    ((!warehouseIsSet() && !rhs.warehouseIsSet()) || (warehouseIsSet() && rhs.warehouseIsSet() && getWarehouse() == rhs.getWarehouse())) &&
    
    
    ((!detailsIsSet() && !rhs.detailsIsSet()) || (detailsIsSet() && rhs.detailsIsSet() && getDetails() == rhs.getDetails())) &&
    
    
    ((!cisListIsSet() && !rhs.cisListIsSet()) || (cisListIsSet() && rhs.cisListIsSet() && getCisList() == rhs.getCisList())) &&
    
    
    ((!initialCountIsSet() && !rhs.initialCountIsSet()) || (initialCountIsSet() && rhs.initialCountIsSet() && getInitialCount() == rhs.getInitialCount())) &&
    
    
    ((!bidFeeIsSet() && !rhs.bidFeeIsSet()) || (bidFeeIsSet() && rhs.bidFeeIsSet() && getBidFee() == rhs.getBidFee())) &&
    
    
    ((!cofinanceThresholdIsSet() && !rhs.cofinanceThresholdIsSet()) || (cofinanceThresholdIsSet() && rhs.cofinanceThresholdIsSet() && getCofinanceThreshold() == rhs.getCofinanceThreshold())) &&
    
    
    ((!cofinanceValueIsSet() && !rhs.cofinanceValueIsSet()) || (cofinanceValueIsSet() && rhs.cofinanceValueIsSet() && getCofinanceValue() == rhs.getCofinanceValue()))
    
    ;
}

bool OrdersStatsItemDTO::operator!=(const OrdersStatsItemDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrdersStatsItemDTO& o)
{
    j = nlohmann::json::object();
    if(o.offerNameIsSet())
        j["offerName"] = o.m_OfferName;
    if(o.marketSkuIsSet())
        j["marketSku"] = o.m_MarketSku;
    if(o.shopSkuIsSet())
        j["shopSku"] = o.m_ShopSku;
    if(o.countIsSet())
        j["count"] = o.m_Count;
    if(o.pricesIsSet() || !o.m_Prices.empty())
        j["prices"] = o.m_Prices;
    if(o.warehouseIsSet())
        j["warehouse"] = o.m_Warehouse;
    if(o.detailsIsSet() || !o.m_Details.empty())
        j["details"] = o.m_Details;
    if(o.cisListIsSet() || !o.m_CisList.empty())
        j["cisList"] = o.m_CisList;
    if(o.initialCountIsSet())
        j["initialCount"] = o.m_InitialCount;
    if(o.bidFeeIsSet())
        j["bidFee"] = o.m_BidFee;
    if(o.cofinanceThresholdIsSet())
        j["cofinanceThreshold"] = o.m_CofinanceThreshold;
    if(o.cofinanceValueIsSet())
        j["cofinanceValue"] = o.m_CofinanceValue;
    
}

void from_json(const nlohmann::json& j, OrdersStatsItemDTO& o)
{
    if(j.find("offerName") != j.end())
    {
        j.at("offerName").get_to(o.m_OfferName);
        o.m_OfferNameIsSet = true;
    } 
    if(j.find("marketSku") != j.end())
    {
        j.at("marketSku").get_to(o.m_MarketSku);
        o.m_MarketSkuIsSet = true;
    } 
    if(j.find("shopSku") != j.end())
    {
        j.at("shopSku").get_to(o.m_ShopSku);
        o.m_ShopSkuIsSet = true;
    } 
    if(j.find("count") != j.end())
    {
        j.at("count").get_to(o.m_Count);
        o.m_CountIsSet = true;
    } 
    if(j.find("prices") != j.end())
    {
        j.at("prices").get_to(o.m_Prices);
        o.m_PricesIsSet = true;
    } 
    if(j.find("warehouse") != j.end())
    {
        j.at("warehouse").get_to(o.m_Warehouse);
        o.m_WarehouseIsSet = true;
    } 
    if(j.find("details") != j.end())
    {
        j.at("details").get_to(o.m_Details);
        o.m_DetailsIsSet = true;
    } 
    if(j.find("cisList") != j.end())
    {
        j.at("cisList").get_to(o.m_CisList);
        o.m_CisListIsSet = true;
    } 
    if(j.find("initialCount") != j.end())
    {
        j.at("initialCount").get_to(o.m_InitialCount);
        o.m_InitialCountIsSet = true;
    } 
    if(j.find("bidFee") != j.end())
    {
        j.at("bidFee").get_to(o.m_BidFee);
        o.m_BidFeeIsSet = true;
    } 
    if(j.find("cofinanceThreshold") != j.end())
    {
        j.at("cofinanceThreshold").get_to(o.m_CofinanceThreshold);
        o.m_CofinanceThresholdIsSet = true;
    } 
    if(j.find("cofinanceValue") != j.end())
    {
        j.at("cofinanceValue").get_to(o.m_CofinanceValue);
        o.m_CofinanceValueIsSet = true;
    } 
    
}

std::string OrdersStatsItemDTO::getOfferName() const
{
    return m_OfferName;
}
void OrdersStatsItemDTO::setOfferName(std::string const& value)
{
    m_OfferName = value;
    m_OfferNameIsSet = true;
}
bool OrdersStatsItemDTO::offerNameIsSet() const
{
    return m_OfferNameIsSet;
}
void OrdersStatsItemDTO::unsetOfferName()
{
    m_OfferNameIsSet = false;
}
int64_t OrdersStatsItemDTO::getMarketSku() const
{
    return m_MarketSku;
}
void OrdersStatsItemDTO::setMarketSku(int64_t const value)
{
    m_MarketSku = value;
    m_MarketSkuIsSet = true;
}
bool OrdersStatsItemDTO::marketSkuIsSet() const
{
    return m_MarketSkuIsSet;
}
void OrdersStatsItemDTO::unsetMarketSku()
{
    m_MarketSkuIsSet = false;
}
std::string OrdersStatsItemDTO::getShopSku() const
{
    return m_ShopSku;
}
void OrdersStatsItemDTO::setShopSku(std::string const& value)
{
    m_ShopSku = value;
    m_ShopSkuIsSet = true;
}
bool OrdersStatsItemDTO::shopSkuIsSet() const
{
    return m_ShopSkuIsSet;
}
void OrdersStatsItemDTO::unsetShopSku()
{
    m_ShopSkuIsSet = false;
}
int32_t OrdersStatsItemDTO::getCount() const
{
    return m_Count;
}
void OrdersStatsItemDTO::setCount(int32_t const value)
{
    m_Count = value;
    m_CountIsSet = true;
}
bool OrdersStatsItemDTO::countIsSet() const
{
    return m_CountIsSet;
}
void OrdersStatsItemDTO::unsetCount()
{
    m_CountIsSet = false;
}
std::vector<org::openapitools::server::model::OrdersStatsPriceDTO> OrdersStatsItemDTO::getPrices() const
{
    return m_Prices;
}
void OrdersStatsItemDTO::setPrices(std::vector<org::openapitools::server::model::OrdersStatsPriceDTO> const& value)
{
    m_Prices = value;
    m_PricesIsSet = true;
}
bool OrdersStatsItemDTO::pricesIsSet() const
{
    return m_PricesIsSet;
}
void OrdersStatsItemDTO::unsetPrices()
{
    m_PricesIsSet = false;
}
org::openapitools::server::model::OrdersStatsWarehouseDTO OrdersStatsItemDTO::getWarehouse() const
{
    return m_Warehouse;
}
void OrdersStatsItemDTO::setWarehouse(org::openapitools::server::model::OrdersStatsWarehouseDTO const& value)
{
    m_Warehouse = value;
    m_WarehouseIsSet = true;
}
bool OrdersStatsItemDTO::warehouseIsSet() const
{
    return m_WarehouseIsSet;
}
void OrdersStatsItemDTO::unsetWarehouse()
{
    m_WarehouseIsSet = false;
}
std::vector<org::openapitools::server::model::OrdersStatsDetailsDTO> OrdersStatsItemDTO::getDetails() const
{
    return m_Details;
}
void OrdersStatsItemDTO::setDetails(std::vector<org::openapitools::server::model::OrdersStatsDetailsDTO> const& value)
{
    m_Details = value;
    m_DetailsIsSet = true;
}
bool OrdersStatsItemDTO::detailsIsSet() const
{
    return m_DetailsIsSet;
}
void OrdersStatsItemDTO::unsetDetails()
{
    m_DetailsIsSet = false;
}
std::vector<std::string> OrdersStatsItemDTO::getCisList() const
{
    return m_CisList;
}
void OrdersStatsItemDTO::setCisList(std::vector<std::string> const& value)
{
    m_CisList = value;
    m_CisListIsSet = true;
}
bool OrdersStatsItemDTO::cisListIsSet() const
{
    return m_CisListIsSet;
}
void OrdersStatsItemDTO::unsetCisList()
{
    m_CisListIsSet = false;
}
int32_t OrdersStatsItemDTO::getInitialCount() const
{
    return m_InitialCount;
}
void OrdersStatsItemDTO::setInitialCount(int32_t const value)
{
    m_InitialCount = value;
    m_InitialCountIsSet = true;
}
bool OrdersStatsItemDTO::initialCountIsSet() const
{
    return m_InitialCountIsSet;
}
void OrdersStatsItemDTO::unsetInitialCount()
{
    m_InitialCountIsSet = false;
}
int32_t OrdersStatsItemDTO::getBidFee() const
{
    return m_BidFee;
}
void OrdersStatsItemDTO::setBidFee(int32_t const value)
{
    m_BidFee = value;
    m_BidFeeIsSet = true;
}
bool OrdersStatsItemDTO::bidFeeIsSet() const
{
    return m_BidFeeIsSet;
}
void OrdersStatsItemDTO::unsetBidFee()
{
    m_BidFeeIsSet = false;
}
double OrdersStatsItemDTO::getCofinanceThreshold() const
{
    return m_CofinanceThreshold;
}
void OrdersStatsItemDTO::setCofinanceThreshold(double const value)
{
    m_CofinanceThreshold = value;
    m_CofinanceThresholdIsSet = true;
}
bool OrdersStatsItemDTO::cofinanceThresholdIsSet() const
{
    return m_CofinanceThresholdIsSet;
}
void OrdersStatsItemDTO::unsetCofinanceThreshold()
{
    m_CofinanceThresholdIsSet = false;
}
double OrdersStatsItemDTO::getCofinanceValue() const
{
    return m_CofinanceValue;
}
void OrdersStatsItemDTO::setCofinanceValue(double const value)
{
    m_CofinanceValue = value;
    m_CofinanceValueIsSet = true;
}
bool OrdersStatsItemDTO::cofinanceValueIsSet() const
{
    return m_CofinanceValueIsSet;
}
void OrdersStatsItemDTO::unsetCofinanceValue()
{
    m_CofinanceValueIsSet = false;
}


} // namespace org::openapitools::server::model

