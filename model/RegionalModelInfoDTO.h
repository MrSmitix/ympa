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
 * RegionalModelInfoDTO.h
 *
 * Региональная информация.
 */

#ifndef RegionalModelInfoDTO_H_
#define RegionalModelInfoDTO_H_



#include "CurrencyType.h"
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
/// Региональная информация.
/// </summary>
class  RegionalModelInfoDTO 
{
public:
    RegionalModelInfoDTO() = default;
    explicit RegionalModelInfoDTO(boost::property_tree::ptree const& pt);
    virtual ~RegionalModelInfoDTO() = default;

    RegionalModelInfoDTO(const RegionalModelInfoDTO& other) = default; // copy constructor
    RegionalModelInfoDTO(RegionalModelInfoDTO&& other) noexcept = default; // move constructor

    RegionalModelInfoDTO& operator=(const RegionalModelInfoDTO& other) = default; // copy assignment
    RegionalModelInfoDTO& operator=(RegionalModelInfoDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RegionalModelInfoDTO members

    /// <summary>
    /// 
    /// </summary>
    CurrencyType getCurrency() const;
    void setCurrency(CurrencyType value);

    /// <summary>
    /// Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
    /// </summary>
    int64_t getRegionId() const;
    void setRegionId(int64_t value);

protected:
    CurrencyType m_Currency = CurrencyType{};
    int64_t m_RegionId = 0L;
};

std::vector<RegionalModelInfoDTO> createRegionalModelInfoDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RegionalModelInfoDTO>(const RegionalModelInfoDTO& val) {
    return val.toPropertyTree();
}

template<>
inline RegionalModelInfoDTO fromPt<RegionalModelInfoDTO>(const boost::property_tree::ptree& pt) {
    RegionalModelInfoDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RegionalModelInfoDTO_H_ */
