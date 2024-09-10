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
 * OfferConditionQualityType.h
 *
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferConditionQualityType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferConditionQualityType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OfferConditionQualityType
    : public ModelBase
{
public:
    OfferConditionQualityType();
    virtual ~OfferConditionQualityType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOfferConditionQualityType
    {
        OfferConditionQualityType_PERFECT,
        OfferConditionQualityType_EXCELLENT,
        OfferConditionQualityType_GOOD,
        OfferConditionQualityType_NOT_SPECIFIED,
    };

    eOfferConditionQualityType getValue() const;
    void setValue(eOfferConditionQualityType const value);

    protected:
        eOfferConditionQualityType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferConditionQualityType_H_ */
