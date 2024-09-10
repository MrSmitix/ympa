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
 * AgeDTO.h
 *
 * Возраст в заданных единицах измерения.
 */

#ifndef AgeDTO_H_
#define AgeDTO_H_



#include "AgeUnitType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Возраст в заданных единицах измерения.
/// </summary>
class  AgeDTO 
{
public:
    AgeDTO() = default;
    explicit AgeDTO(boost::property_tree::ptree const& pt);
    virtual ~AgeDTO() = default;

    AgeDTO(const AgeDTO& other) = default; // copy constructor
    AgeDTO(AgeDTO&& other) noexcept = default; // move constructor

    AgeDTO& operator=(const AgeDTO& other) = default; // copy assignment
    AgeDTO& operator=(AgeDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AgeDTO members

    /// <summary>
    /// Значение. 
    /// </summary>
    double getValue() const;
    void setValue(double value);

    /// <summary>
    /// 
    /// </summary>
    AgeUnitType getAgeUnit() const;
    void setAgeUnit(AgeUnitType value);

protected:
    double m_Value = 0.0;
    AgeUnitType m_AgeUnit = AgeUnitType{};
};

std::vector<AgeDTO> createAgeDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AgeDTO>(const AgeDTO& val) {
    return val.toPropertyTree();
}

template<>
inline AgeDTO fromPt<AgeDTO>(const boost::property_tree::ptree& pt) {
    AgeDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AgeDTO_H_ */
