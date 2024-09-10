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
 * GetSuggestedOfferMappingEntriesRequest.h
 *
 * Запрос рекомендованных карточек товара.
 */

#ifndef GetSuggestedOfferMappingEntriesRequest_H_
#define GetSuggestedOfferMappingEntriesRequest_H_



#include "MappingsOfferDTO.h"
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
/// Запрос рекомендованных карточек товара.
/// </summary>
class  GetSuggestedOfferMappingEntriesRequest 
{
public:
    GetSuggestedOfferMappingEntriesRequest() = default;
    explicit GetSuggestedOfferMappingEntriesRequest(boost::property_tree::ptree const& pt);
    virtual ~GetSuggestedOfferMappingEntriesRequest() = default;

    GetSuggestedOfferMappingEntriesRequest(const GetSuggestedOfferMappingEntriesRequest& other) = default; // copy constructor
    GetSuggestedOfferMappingEntriesRequest(GetSuggestedOfferMappingEntriesRequest&& other) noexcept = default; // move constructor

    GetSuggestedOfferMappingEntriesRequest& operator=(const GetSuggestedOfferMappingEntriesRequest& other) = default; // copy assignment
    GetSuggestedOfferMappingEntriesRequest& operator=(GetSuggestedOfferMappingEntriesRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetSuggestedOfferMappingEntriesRequest members

    /// <summary>
    /// Список товаров.
    /// </summary>
    std::vector<MappingsOfferDTO> getOffers() const;
    void setOffers(std::vector<MappingsOfferDTO> value);

protected:
    std::vector<MappingsOfferDTO> m_Offers;
};

std::vector<GetSuggestedOfferMappingEntriesRequest> createGetSuggestedOfferMappingEntriesRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetSuggestedOfferMappingEntriesRequest>(const GetSuggestedOfferMappingEntriesRequest& val) {
    return val.toPropertyTree();
}

template<>
inline GetSuggestedOfferMappingEntriesRequest fromPt<GetSuggestedOfferMappingEntriesRequest>(const boost::property_tree::ptree& pt) {
    GetSuggestedOfferMappingEntriesRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetSuggestedOfferMappingEntriesRequest_H_ */
