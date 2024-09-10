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
 * ReturnType.h
 *
 * Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 */

#ifndef ReturnType_H_
#define ReturnType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
/// </summary>
class  ReturnType 
{
public:
    ReturnType() = default;
    explicit ReturnType(boost::property_tree::ptree const& pt);
    virtual ~ReturnType() = default;

    ReturnType(const ReturnType& other) = default; // copy constructor
    ReturnType(ReturnType&& other) noexcept = default; // move constructor

    ReturnType& operator=(const ReturnType& other) = default; // copy assignment
    ReturnType& operator=(ReturnType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// ReturnType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_ReturnTypeEnumValue;
};

std::vector<ReturnType> createReturnTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ReturnType>(const ReturnType& val) {
    return val.toPropertyTree();
}

template<>
inline ReturnType fromPt<ReturnType>(const boost::property_tree::ptree& pt) {
    ReturnType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ReturnType_H_ */
