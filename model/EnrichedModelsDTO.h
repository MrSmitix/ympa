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
 * EnrichedModelsDTO.h
 *
 * Список моделей товаров.
 */

#ifndef EnrichedModelsDTO_H_
#define EnrichedModelsDTO_H_



#include "EnrichedModelDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Список моделей товаров.
/// </summary>
class  EnrichedModelsDTO 
{
public:
    EnrichedModelsDTO() = default;
    explicit EnrichedModelsDTO(boost::property_tree::ptree const& pt);
    virtual ~EnrichedModelsDTO() = default;

    EnrichedModelsDTO(const EnrichedModelsDTO& other) = default; // copy constructor
    EnrichedModelsDTO(EnrichedModelsDTO&& other) noexcept = default; // move constructor

    EnrichedModelsDTO& operator=(const EnrichedModelsDTO& other) = default; // copy assignment
    EnrichedModelsDTO& operator=(EnrichedModelsDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// EnrichedModelsDTO members

    /// <summary>
    /// Список моделей товаров.
    /// </summary>
    std::vector<EnrichedModelDTO> getModels() const;
    void setModels(std::vector<EnrichedModelDTO> value);

protected:
    std::vector<EnrichedModelDTO> m_Models;
};

std::vector<EnrichedModelsDTO> createEnrichedModelsDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<EnrichedModelsDTO>(const EnrichedModelsDTO& val) {
    return val.toPropertyTree();
}

template<>
inline EnrichedModelsDTO fromPt<EnrichedModelsDTO>(const boost::property_tree::ptree& pt) {
    EnrichedModelsDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* EnrichedModelsDTO_H_ */
