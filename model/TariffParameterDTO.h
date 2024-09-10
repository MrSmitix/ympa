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
 * TariffParameterDTO.h
 *
 * Детали расчета конкретной услуги Маркета.
 */

#ifndef TariffParameterDTO_H_
#define TariffParameterDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Детали расчета конкретной услуги Маркета.
/// </summary>
class  TariffParameterDTO 
{
public:
    TariffParameterDTO() = default;
    explicit TariffParameterDTO(boost::property_tree::ptree const& pt);
    virtual ~TariffParameterDTO() = default;

    TariffParameterDTO(const TariffParameterDTO& other) = default; // copy constructor
    TariffParameterDTO(TariffParameterDTO&& other) noexcept = default; // move constructor

    TariffParameterDTO& operator=(const TariffParameterDTO& other) = default; // copy assignment
    TariffParameterDTO& operator=(TariffParameterDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// TariffParameterDTO members

    /// <summary>
    /// Название параметра.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Значение параметра.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string value);

protected:
    std::string m_Name = "";
    std::string m_Value = "";
};

std::vector<TariffParameterDTO> createTariffParameterDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<TariffParameterDTO>(const TariffParameterDTO& val) {
    return val.toPropertyTree();
}

template<>
inline TariffParameterDTO fromPt<TariffParameterDTO>(const boost::property_tree::ptree& pt) {
    TariffParameterDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* TariffParameterDTO_H_ */
