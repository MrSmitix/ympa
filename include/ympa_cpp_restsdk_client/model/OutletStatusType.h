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
 * OutletStatusType.h
 *
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OutletStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OutletStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OutletStatusType
    : public ModelBase
{
public:
    OutletStatusType();
    virtual ~OutletStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOutletStatusType
    {
        OutletStatusType_AT_MODERATION,
        OutletStatusType_FAILED,
        OutletStatusType_MODERATED,
        OutletStatusType_NONMODERATED,
        OutletStatusType_UNKNOWN,
    };

    eOutletStatusType getValue() const;
    void setValue(eOutletStatusType const value);

    protected:
        eOutletStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OutletStatusType_H_ */
