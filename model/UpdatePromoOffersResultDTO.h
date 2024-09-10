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
 * UpdatePromoOffersResultDTO.h
 *
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

#ifndef UpdatePromoOffersResultDTO_H_
#define UpdatePromoOffersResultDTO_H_



#include "RejectedPromoOfferUpdateDTO.h"
#include "WarningPromoOfferUpdateDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
/// </summary>
class  UpdatePromoOffersResultDTO 
{
public:
    UpdatePromoOffersResultDTO() = default;
    explicit UpdatePromoOffersResultDTO(boost::property_tree::ptree const& pt);
    virtual ~UpdatePromoOffersResultDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// UpdatePromoOffersResultDTO members

    /// <summary>
    /// Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
    /// </summary>
    std::vector<std::shared_ptr<RejectedPromoOfferUpdateDTO>> getRejectedOffers() const;
    void setRejectedOffers(std::vector<std::shared_ptr<RejectedPromoOfferUpdateDTO>> value);

    /// <summary>
    /// Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
    /// </summary>
    std::vector<std::shared_ptr<WarningPromoOfferUpdateDTO>> getWarningOffers() const;
    void setWarningOffers(std::vector<std::shared_ptr<WarningPromoOfferUpdateDTO>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<RejectedPromoOfferUpdateDTO>> m_RejectedOffers;
    std::vector<std::shared_ptr<WarningPromoOfferUpdateDTO>> m_WarningOffers;
};

std::vector<UpdatePromoOffersResultDTO> createUpdatePromoOffersResultDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* UpdatePromoOffersResultDTO_H_ */
