/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BusinessSettingsDTO.h
 *
 * Настройки кабинета.
 */

#ifndef BusinessSettingsDTO_H_
#define BusinessSettingsDTO_H_



#include "CurrencyType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Настройки кабинета.
/// </summary>
class  BusinessSettingsDTO 
{
public:
    BusinessSettingsDTO() = default;
    explicit BusinessSettingsDTO(boost::property_tree::ptree const& pt);
    virtual ~BusinessSettingsDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// BusinessSettingsDTO members

    /// <summary>
    /// Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. 
    /// </summary>
    bool isOnlyDefaultPrice() const;
    void setOnlyDefaultPrice(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CurrencyType> getCurrency() const;
    void setCurrency(std::shared_ptr<CurrencyType> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    bool m_OnlyDefaultPrice = false;
    std::shared_ptr<CurrencyType> m_Currency = std::make_shared<CurrencyType>();
};

std::vector<BusinessSettingsDTO> createBusinessSettingsDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* BusinessSettingsDTO_H_ */
