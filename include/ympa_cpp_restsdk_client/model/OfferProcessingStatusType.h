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
 * OfferProcessingStatusType.h
 *
 * Статус публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * &#x60;IN_WORK&#x60; — товар проходит модерацию. Это занимает несколько дней. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете &#x60;marketSku&#x60; нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре &#x60;notes&#x60;. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferProcessingStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferProcessingStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OfferProcessingStatusType
    : public ModelBase
{
public:
    OfferProcessingStatusType();
    virtual ~OfferProcessingStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOfferProcessingStatusType
    {
        OfferProcessingStatusType_UNKNOWN,
        OfferProcessingStatusType_READY,
        OfferProcessingStatusType_IN_WORK,
        OfferProcessingStatusType_NEED_INFO,
        OfferProcessingStatusType_NEED_MAPPING,
        OfferProcessingStatusType_NEED_CONTENT,
        OfferProcessingStatusType_CONTENT_PROCESSING,
        OfferProcessingStatusType_SUSPENDED,
        OfferProcessingStatusType_REJECTED,
        OfferProcessingStatusType_REVIEW,
        OfferProcessingStatusType_CREATE_ERROR,
        OfferProcessingStatusType_UPDATE_ERROR,
    };

    eOfferProcessingStatusType getValue() const;
    void setValue(eOfferProcessingStatusType const value);

    protected:
        eOfferProcessingStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferProcessingStatusType_H_ */
