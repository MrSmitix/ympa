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
 * OfferType.h
 *
 * Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OfferType
    : public ModelBase
{
public:
    OfferType();
    virtual ~OfferType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOfferType
    {
        OfferType_DEFAULT,
        OfferType_MEDICINE,
        OfferType_BOOK,
        OfferType_AUDIOBOOK,
        OfferType_ARTIST_TITLE,
        OfferType_ON_DEMAND,
    };

    eOfferType getValue() const;
    void setValue(eOfferType const value);

    protected:
        eOfferType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferType_H_ */
