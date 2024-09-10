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
 * GetOfferMappingDTO.h
 *
 * Информация о товаре.
 */

#ifndef GetOfferMappingDTO_H_
#define GetOfferMappingDTO_H_



#include "GetMappingDTO.h"
#include "GetOfferDTO.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о товаре.
/// </summary>
class  GetOfferMappingDTO 
{
public:
    GetOfferMappingDTO() = default;
    explicit GetOfferMappingDTO(boost::property_tree::ptree const& pt);
    virtual ~GetOfferMappingDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetOfferMappingDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GetOfferDTO> getOffer() const;
    void setOffer(std::shared_ptr<GetOfferDTO> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GetMappingDTO> getMapping() const;
    void setMapping(std::shared_ptr<GetMappingDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<GetOfferDTO> m_Offer;
    std::shared_ptr<GetMappingDTO> m_Mapping;
};

std::vector<GetOfferMappingDTO> createGetOfferMappingDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetOfferMappingDTO_H_ */
