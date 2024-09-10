/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OfferRecommendationInfoDTO.h
 *
 * Рекомендации, касающиеся цены на товар.
 */

#ifndef OfferRecommendationInfoDTO_H_
#define OfferRecommendationInfoDTO_H_


#include "PriceCompetitivenessThresholdsDTO.h"
#include "BasePriceDTO.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Рекомендации, касающиеся цены на товар.
/// </summary>
class  OfferRecommendationInfoDTO
{
public:
    OfferRecommendationInfoDTO();
    virtual ~OfferRecommendationInfoDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const OfferRecommendationInfoDTO& rhs) const;
    bool operator!=(const OfferRecommendationInfoDTO& rhs) const;

    /////////////////////////////////////////////
    /// OfferRecommendationInfoDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string const& value);
    bool offerIdIsSet() const;
    void unsetOfferId();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::BasePriceDTO getRecommendedCofinancePrice() const;
    void setRecommendedCofinancePrice(org::openapitools::server::model::BasePriceDTO const& value);
    bool recommendedCofinancePriceIsSet() const;
    void unsetRecommendedCofinancePrice();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::PriceCompetitivenessThresholdsDTO getCompetitivenessThresholds() const;
    void setCompetitivenessThresholds(org::openapitools::server::model::PriceCompetitivenessThresholdsDTO const& value);
    bool competitivenessThresholdsIsSet() const;
    void unsetCompetitivenessThresholds();

    friend  void to_json(nlohmann::json& j, const OfferRecommendationInfoDTO& o);
    friend  void from_json(const nlohmann::json& j, OfferRecommendationInfoDTO& o);
protected:
    std::string m_OfferId;
    bool m_OfferIdIsSet;
    org::openapitools::server::model::BasePriceDTO m_RecommendedCofinancePrice;
    bool m_RecommendedCofinancePriceIsSet;
    org::openapitools::server::model::PriceCompetitivenessThresholdsDTO m_CompetitivenessThresholds;
    bool m_CompetitivenessThresholdsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OfferRecommendationInfoDTO_H_ */
