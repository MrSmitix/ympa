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
 * OfferCardStatusType.h
 *
 * Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCardStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCardStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OfferCardStatusType
    : public ModelBase
{
public:
    OfferCardStatusType();
    virtual ~OfferCardStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOfferCardStatusType
    {
        OfferCardStatusType_HAS_CARD_CAN_NOT_UPDATE,
        OfferCardStatusType_HAS_CARD_CAN_UPDATE,
        OfferCardStatusType_HAS_CARD_CAN_UPDATE_ERRORS,
        OfferCardStatusType_HAS_CARD_CAN_UPDATE_PROCESSING,
        OfferCardStatusType_NO_CARD_NEED_CONTENT,
        OfferCardStatusType_NO_CARD_MARKET_WILL_CREATE,
        OfferCardStatusType_NO_CARD_ERRORS,
        OfferCardStatusType_NO_CARD_PROCESSING,
        OfferCardStatusType_NO_CARD_ADD_TO_CAMPAIGN,
    };

    eOfferCardStatusType getValue() const;
    void setValue(eOfferCardStatusType const value);

    protected:
        eOfferCardStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferCardStatusType_H_ */
