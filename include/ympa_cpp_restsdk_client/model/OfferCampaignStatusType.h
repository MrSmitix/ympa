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
 * OfferCampaignStatusType.h
 *
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCampaignStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCampaignStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OfferCampaignStatusType
    : public ModelBase
{
public:
    OfferCampaignStatusType();
    virtual ~OfferCampaignStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOfferCampaignStatusType
    {
        OfferCampaignStatusType_PUBLISHED,
        OfferCampaignStatusType_CHECKING,
        OfferCampaignStatusType_DISABLED_BY_PARTNER,
        OfferCampaignStatusType_DISABLED_AUTOMATICALLY,
        OfferCampaignStatusType_REJECTED_BY_MARKET,
        OfferCampaignStatusType_CREATING_CARD,
        OfferCampaignStatusType_NO_CARD,
        OfferCampaignStatusType_NO_STOCKS,
        OfferCampaignStatusType_ARCHIVED,
    };

    eOfferCampaignStatusType getValue() const;
    void setValue(eOfferCampaignStatusType const value);

    protected:
        eOfferCampaignStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCampaignStatusType_H_ */
