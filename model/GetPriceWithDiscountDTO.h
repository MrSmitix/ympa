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
 * GetPriceWithDiscountDTO.h
 *
 * Цена с указанием скидки и времени последнего обновления.
 */

#ifndef GetPriceWithDiscountDTO_H_
#define GetPriceWithDiscountDTO_H_



#include "CurrencyType.h"
#include <string>
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
/// Цена с указанием скидки и времени последнего обновления.
/// </summary>
class  GetPriceWithDiscountDTO : public UpdatePriceWithDiscountDTO, public UpdateTimeDTO
{
public:
    GetPriceWithDiscountDTO() = default;
    explicit GetPriceWithDiscountDTO(boost::property_tree::ptree const& pt);
    virtual ~GetPriceWithDiscountDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetPriceWithDiscountDTO members

    /// <summary>
    /// Значение.
    /// </summary>
    double getValue() const;
    void setValue(double value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CurrencyType> getCurrencyId() const;
    void setCurrencyId(std::shared_ptr<CurrencyType> value);

    /// <summary>
    /// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
    /// </summary>
    double getDiscountBase() const;
    void setDiscountBase(double value);

    /// <summary>
    /// Время последнего обновления.
    /// </summary>
    std::string getUpdatedAt() const;
    void setUpdatedAt(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    double m_Value = 0.0;
    std::shared_ptr<CurrencyType> m_CurrencyId = std::make_shared<CurrencyType>();
    double m_DiscountBase = 0.0;
    std::string m_UpdatedAt = "";
};

std::vector<GetPriceWithDiscountDTO> createGetPriceWithDiscountDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetPriceWithDiscountDTO_H_ */
