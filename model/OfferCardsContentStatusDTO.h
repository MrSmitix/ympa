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
 * OfferCardsContentStatusDTO.h
 *
 * Список товаров с информацией о состоянии карточек.
 */

#ifndef OfferCardsContentStatusDTO_H_
#define OfferCardsContentStatusDTO_H_



#include "ForwardScrollingPagerDTO.h"
#include "OfferCardDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Список товаров с информацией о состоянии карточек.
/// </summary>
class  OfferCardsContentStatusDTO 
{
public:
    OfferCardsContentStatusDTO() = default;
    explicit OfferCardsContentStatusDTO(boost::property_tree::ptree const& pt);
    virtual ~OfferCardsContentStatusDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OfferCardsContentStatusDTO members

    /// <summary>
    /// Страница списка товаров с информацией о состоянии карточек.
    /// </summary>
    std::vector<std::shared_ptr<OfferCardDTO>> getOfferCards() const;
    void setOfferCards(std::vector<std::shared_ptr<OfferCardDTO>> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ForwardScrollingPagerDTO> getPaging() const;
    void setPaging(std::shared_ptr<ForwardScrollingPagerDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<OfferCardDTO>> m_OfferCards;
    std::shared_ptr<ForwardScrollingPagerDTO> m_Paging;
};

std::vector<OfferCardsContentStatusDTO> createOfferCardsContentStatusDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OfferCardsContentStatusDTO_H_ */
