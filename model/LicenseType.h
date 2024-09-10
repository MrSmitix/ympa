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
 * LicenseType.h
 *
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 */

#ifndef LicenseType_H_
#define LicenseType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
/// </summary>
class  LicenseType 
{
public:
    LicenseType() = default;
    explicit LicenseType(boost::property_tree::ptree const& pt);
    virtual ~LicenseType() = default;

    LicenseType(const LicenseType& other) = default; // copy constructor
    LicenseType(LicenseType&& other) noexcept = default; // move constructor

    LicenseType& operator=(const LicenseType& other) = default; // copy assignment
    LicenseType& operator=(LicenseType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// LicenseType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_LicenseTypeEnumValue;
};

std::vector<LicenseType> createLicenseTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<LicenseType>(const LicenseType& val) {
    return val.toPropertyTree();
}

template<>
inline LicenseType fromPt<LicenseType>(const boost::property_tree::ptree& pt) {
    LicenseType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* LicenseType_H_ */
