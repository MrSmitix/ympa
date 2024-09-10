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
 * RejectedPromoOfferDeleteReasonType.h
 *
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RejectedPromoOfferDeleteReasonType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RejectedPromoOfferDeleteReasonType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  RejectedPromoOfferDeleteReasonType
    : public ModelBase
{
public:
    RejectedPromoOfferDeleteReasonType();
    virtual ~RejectedPromoOfferDeleteReasonType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eRejectedPromoOfferDeleteReasonType
    {
        RejectedPromoOfferDeleteReasonType_OFFER_DOES_NOT_EXIST,
    };

    eRejectedPromoOfferDeleteReasonType getValue() const;
    void setValue(eRejectedPromoOfferDeleteReasonType const value);

    protected:
        eRejectedPromoOfferDeleteReasonType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RejectedPromoOfferDeleteReasonType_H_ */
