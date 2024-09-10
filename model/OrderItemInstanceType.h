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
 * OrderItemInstanceType.h
 *
 * Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
 */

#ifndef OrderItemInstanceType_H_
#define OrderItemInstanceType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
/// </summary>
class  OrderItemInstanceType 
{
public:
    OrderItemInstanceType() = default;
    explicit OrderItemInstanceType(boost::property_tree::ptree const& pt);
    virtual ~OrderItemInstanceType() = default;

    OrderItemInstanceType(const OrderItemInstanceType& other) = default; // copy constructor
    OrderItemInstanceType(OrderItemInstanceType&& other) noexcept = default; // move constructor

    OrderItemInstanceType& operator=(const OrderItemInstanceType& other) = default; // copy assignment
    OrderItemInstanceType& operator=(OrderItemInstanceType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// OrderItemInstanceType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_OrderItemInstanceTypeEnumValue;
};

std::vector<OrderItemInstanceType> createOrderItemInstanceTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OrderItemInstanceType>(const OrderItemInstanceType& val) {
    return val.toPropertyTree();
}

template<>
inline OrderItemInstanceType fromPt<OrderItemInstanceType>(const boost::property_tree::ptree& pt) {
    OrderItemInstanceType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OrderItemInstanceType_H_ */
