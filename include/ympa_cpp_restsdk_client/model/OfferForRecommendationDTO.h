/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OfferForRecommendationDTO.h
 *
 * Информация о состоянии цены на товар.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferForRecommendationDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferForRecommendationDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/BasePriceDTO.h"
#include "ympa_cpp_restsdk_client/model/PriceCompetitivenessType.h"
#include "ympa_cpp_restsdk_client/model/GetPriceDTO.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class BasePriceDTO;
class GetPriceDTO;


/// <summary>
/// Информация о состоянии цены на товар.
/// </summary>
class  OfferForRecommendationDTO
    : public ModelBase
{
public:
    OfferForRecommendationDTO();
    virtual ~OfferForRecommendationDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OfferForRecommendationDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    utility::string_t getOfferId() const;
    bool offerIdIsSet() const;
    void unsetOfferId();

    void setOfferId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<BasePriceDTO> getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();

    void setPrice(const std::shared_ptr<BasePriceDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GetPriceDTO> getCofinancePrice() const;
    bool cofinancePriceIsSet() const;
    void unsetCofinancePrice();

    void setCofinancePrice(const std::shared_ptr<GetPriceDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PriceCompetitivenessType> getCompetitiveness() const;
    bool competitivenessIsSet() const;
    void unsetCompetitiveness();

    void setCompetitiveness(const std::shared_ptr<PriceCompetitivenessType>& value);

    /// <summary>
    /// Количество показов карточки товара за последние 7 дней.
    /// </summary>
    int64_t getShows() const;
    bool showsIsSet() const;
    void unsetShows();

    void setShows(int64_t value);


protected:
    utility::string_t m_OfferId;
    bool m_OfferIdIsSet;
    std::shared_ptr<BasePriceDTO> m_Price;
    bool m_PriceIsSet;
    std::shared_ptr<GetPriceDTO> m_CofinancePrice;
    bool m_CofinancePriceIsSet;
    std::shared_ptr<PriceCompetitivenessType> m_Competitiveness;
    bool m_CompetitivenessIsSet;
    int64_t m_Shows;
    bool m_ShowsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferForRecommendationDTO_H_ */
