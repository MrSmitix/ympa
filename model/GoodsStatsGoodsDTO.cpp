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


#include "GoodsStatsGoodsDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GoodsStatsGoodsDTO::GoodsStatsGoodsDTO()
{
    m_ShopSku = "";
    m_ShopSkuIsSet = false;
    m_MarketSku = 0L;
    m_MarketSkuIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Price = 0.0;
    m_PriceIsSet = false;
    m_CategoryId = 0L;
    m_CategoryIdIsSet = false;
    m_CategoryName = "";
    m_CategoryNameIsSet = false;
    m_WeightDimensionsIsSet = false;
    m_WarehousesIsSet = false;
    m_TariffsIsSet = false;
    m_PicturesIsSet = false;
    
}

void GoodsStatsGoodsDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GoodsStatsGoodsDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GoodsStatsGoodsDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GoodsStatsGoodsDTO" : pathPrefix;

         
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
                                 
    if (warehousesIsSet())
    {
        const std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO>& value = m_Warehouses;
        const std::string currentValuePath = _pathPrefix + ".warehouses";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::GoodsStatsWarehouseDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".warehouses") && success;
 
                i++;
            }
        }

    }
         
    if (tariffsIsSet())
    {
        const std::vector<org::openapitools::server::model::TariffDTO>& value = m_Tariffs;
        const std::string currentValuePath = _pathPrefix + ".tariffs";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::TariffDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".tariffs") && success;
 
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
    
    return success;
}

bool GoodsStatsGoodsDTO::operator==(const GoodsStatsGoodsDTO& rhs) const
{
    return
    
    
    
    ((!shopSkuIsSet() && !rhs.shopSkuIsSet()) || (shopSkuIsSet() && rhs.shopSkuIsSet() && getShopSku() == rhs.getShopSku())) &&
    
    
    ((!marketSkuIsSet() && !rhs.marketSkuIsSet()) || (marketSkuIsSet() && rhs.marketSkuIsSet() && getMarketSku() == rhs.getMarketSku())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!priceIsSet() && !rhs.priceIsSet()) || (priceIsSet() && rhs.priceIsSet() && getPrice() == rhs.getPrice())) &&
    
    
    ((!categoryIdIsSet() && !rhs.categoryIdIsSet()) || (categoryIdIsSet() && rhs.categoryIdIsSet() && getCategoryId() == rhs.getCategoryId())) &&
    
    
    ((!categoryNameIsSet() && !rhs.categoryNameIsSet()) || (categoryNameIsSet() && rhs.categoryNameIsSet() && getCategoryName() == rhs.getCategoryName())) &&
    
    
    ((!weightDimensionsIsSet() && !rhs.weightDimensionsIsSet()) || (weightDimensionsIsSet() && rhs.weightDimensionsIsSet() && getWeightDimensions() == rhs.getWeightDimensions())) &&
    
    
    ((!warehousesIsSet() && !rhs.warehousesIsSet()) || (warehousesIsSet() && rhs.warehousesIsSet() && getWarehouses() == rhs.getWarehouses())) &&
    
    
    ((!tariffsIsSet() && !rhs.tariffsIsSet()) || (tariffsIsSet() && rhs.tariffsIsSet() && getTariffs() == rhs.getTariffs())) &&
    
    
    ((!picturesIsSet() && !rhs.picturesIsSet()) || (picturesIsSet() && rhs.picturesIsSet() && getPictures() == rhs.getPictures()))
    
    ;
}

bool GoodsStatsGoodsDTO::operator!=(const GoodsStatsGoodsDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GoodsStatsGoodsDTO& o)
{
    j = nlohmann::json::object();
    if(o.shopSkuIsSet())
        j["shopSku"] = o.m_ShopSku;
    if(o.marketSkuIsSet())
        j["marketSku"] = o.m_MarketSku;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.priceIsSet())
        j["price"] = o.m_Price;
    if(o.categoryIdIsSet())
        j["categoryId"] = o.m_CategoryId;
    if(o.categoryNameIsSet())
        j["categoryName"] = o.m_CategoryName;
    if(o.weightDimensionsIsSet())
        j["weightDimensions"] = o.m_WeightDimensions;
    if(o.warehousesIsSet() || !o.m_Warehouses.empty())
        j["warehouses"] = o.m_Warehouses;
    if(o.tariffsIsSet() || !o.m_Tariffs.empty())
        j["tariffs"] = o.m_Tariffs;
    if(o.picturesIsSet() || !o.m_Pictures.empty())
        j["pictures"] = o.m_Pictures;
    
}

void from_json(const nlohmann::json& j, GoodsStatsGoodsDTO& o)
{
    if(j.find("shopSku") != j.end())
    {
        j.at("shopSku").get_to(o.m_ShopSku);
        o.m_ShopSkuIsSet = true;
    } 
    if(j.find("marketSku") != j.end())
    {
        j.at("marketSku").get_to(o.m_MarketSku);
        o.m_MarketSkuIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("price") != j.end())
    {
        j.at("price").get_to(o.m_Price);
        o.m_PriceIsSet = true;
    } 
    if(j.find("categoryId") != j.end())
    {
        j.at("categoryId").get_to(o.m_CategoryId);
        o.m_CategoryIdIsSet = true;
    } 
    if(j.find("categoryName") != j.end())
    {
        j.at("categoryName").get_to(o.m_CategoryName);
        o.m_CategoryNameIsSet = true;
    } 
    if(j.find("weightDimensions") != j.end())
    {
        j.at("weightDimensions").get_to(o.m_WeightDimensions);
        o.m_WeightDimensionsIsSet = true;
    } 
    if(j.find("warehouses") != j.end())
    {
        j.at("warehouses").get_to(o.m_Warehouses);
        o.m_WarehousesIsSet = true;
    } 
    if(j.find("tariffs") != j.end())
    {
        j.at("tariffs").get_to(o.m_Tariffs);
        o.m_TariffsIsSet = true;
    } 
    if(j.find("pictures") != j.end())
    {
        j.at("pictures").get_to(o.m_Pictures);
        o.m_PicturesIsSet = true;
    } 
    
}

std::string GoodsStatsGoodsDTO::getShopSku() const
{
    return m_ShopSku;
}
void GoodsStatsGoodsDTO::setShopSku(std::string const& value)
{
    m_ShopSku = value;
    m_ShopSkuIsSet = true;
}
bool GoodsStatsGoodsDTO::shopSkuIsSet() const
{
    return m_ShopSkuIsSet;
}
void GoodsStatsGoodsDTO::unsetShopSku()
{
    m_ShopSkuIsSet = false;
}
int64_t GoodsStatsGoodsDTO::getMarketSku() const
{
    return m_MarketSku;
}
void GoodsStatsGoodsDTO::setMarketSku(int64_t const value)
{
    m_MarketSku = value;
    m_MarketSkuIsSet = true;
}
bool GoodsStatsGoodsDTO::marketSkuIsSet() const
{
    return m_MarketSkuIsSet;
}
void GoodsStatsGoodsDTO::unsetMarketSku()
{
    m_MarketSkuIsSet = false;
}
std::string GoodsStatsGoodsDTO::getName() const
{
    return m_Name;
}
void GoodsStatsGoodsDTO::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool GoodsStatsGoodsDTO::nameIsSet() const
{
    return m_NameIsSet;
}
void GoodsStatsGoodsDTO::unsetName()
{
    m_NameIsSet = false;
}
double GoodsStatsGoodsDTO::getPrice() const
{
    return m_Price;
}
void GoodsStatsGoodsDTO::setPrice(double const value)
{
    m_Price = value;
    m_PriceIsSet = true;
}
bool GoodsStatsGoodsDTO::priceIsSet() const
{
    return m_PriceIsSet;
}
void GoodsStatsGoodsDTO::unsetPrice()
{
    m_PriceIsSet = false;
}
int64_t GoodsStatsGoodsDTO::getCategoryId() const
{
    return m_CategoryId;
}
void GoodsStatsGoodsDTO::setCategoryId(int64_t const value)
{
    m_CategoryId = value;
    m_CategoryIdIsSet = true;
}
bool GoodsStatsGoodsDTO::categoryIdIsSet() const
{
    return m_CategoryIdIsSet;
}
void GoodsStatsGoodsDTO::unsetCategoryId()
{
    m_CategoryIdIsSet = false;
}
std::string GoodsStatsGoodsDTO::getCategoryName() const
{
    return m_CategoryName;
}
void GoodsStatsGoodsDTO::setCategoryName(std::string const& value)
{
    m_CategoryName = value;
    m_CategoryNameIsSet = true;
}
bool GoodsStatsGoodsDTO::categoryNameIsSet() const
{
    return m_CategoryNameIsSet;
}
void GoodsStatsGoodsDTO::unsetCategoryName()
{
    m_CategoryNameIsSet = false;
}
org::openapitools::server::model::GoodsStatsWeightDimensionsDTO GoodsStatsGoodsDTO::getWeightDimensions() const
{
    return m_WeightDimensions;
}
void GoodsStatsGoodsDTO::setWeightDimensions(org::openapitools::server::model::GoodsStatsWeightDimensionsDTO const& value)
{
    m_WeightDimensions = value;
    m_WeightDimensionsIsSet = true;
}
bool GoodsStatsGoodsDTO::weightDimensionsIsSet() const
{
    return m_WeightDimensionsIsSet;
}
void GoodsStatsGoodsDTO::unsetWeightDimensions()
{
    m_WeightDimensionsIsSet = false;
}
std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO> GoodsStatsGoodsDTO::getWarehouses() const
{
    return m_Warehouses;
}
void GoodsStatsGoodsDTO::setWarehouses(std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO> const& value)
{
    m_Warehouses = value;
    m_WarehousesIsSet = true;
}
bool GoodsStatsGoodsDTO::warehousesIsSet() const
{
    return m_WarehousesIsSet;
}
void GoodsStatsGoodsDTO::unsetWarehouses()
{
    m_WarehousesIsSet = false;
}
std::vector<org::openapitools::server::model::TariffDTO> GoodsStatsGoodsDTO::getTariffs() const
{
    return m_Tariffs;
}
void GoodsStatsGoodsDTO::setTariffs(std::vector<org::openapitools::server::model::TariffDTO> const& value)
{
    m_Tariffs = value;
    m_TariffsIsSet = true;
}
bool GoodsStatsGoodsDTO::tariffsIsSet() const
{
    return m_TariffsIsSet;
}
void GoodsStatsGoodsDTO::unsetTariffs()
{
    m_TariffsIsSet = false;
}
std::vector<std::string> GoodsStatsGoodsDTO::getPictures() const
{
    return m_Pictures;
}
void GoodsStatsGoodsDTO::setPictures(std::vector<std::string> const& value)
{
    m_Pictures = value;
    m_PicturesIsSet = true;
}
bool GoodsStatsGoodsDTO::picturesIsSet() const
{
    return m_PicturesIsSet;
}
void GoodsStatsGoodsDTO::unsetPictures()
{
    m_PicturesIsSet = false;
}


} // namespace org::openapitools::server::model

