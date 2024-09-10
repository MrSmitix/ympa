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
 * MechanicsType.h
 *
 * Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
 */

#ifndef MechanicsType_H_
#define MechanicsType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
/// </summary>
class  MechanicsType 
{
public:
    MechanicsType() = default;
    explicit MechanicsType(boost::property_tree::ptree const& pt);
    virtual ~MechanicsType() = default;

    MechanicsType(const MechanicsType& other) = default; // copy constructor
    MechanicsType(MechanicsType&& other) noexcept = default; // move constructor

    MechanicsType& operator=(const MechanicsType& other) = default; // copy assignment
    MechanicsType& operator=(MechanicsType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// MechanicsType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_MechanicsTypeEnumValue;
};

std::vector<MechanicsType> createMechanicsTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MechanicsType>(const MechanicsType& val) {
    return val.toPropertyTree();
}

template<>
inline MechanicsType fromPt<MechanicsType>(const boost::property_tree::ptree& pt) {
    MechanicsType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MechanicsType_H_ */
