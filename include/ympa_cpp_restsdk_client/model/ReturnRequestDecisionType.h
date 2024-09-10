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
 * ReturnRequestDecisionType.h
 *
 * Решение по возврату.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnRequestDecisionType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnRequestDecisionType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  ReturnRequestDecisionType
    : public ModelBase
{
public:
    ReturnRequestDecisionType();
    virtual ~ReturnRequestDecisionType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eReturnRequestDecisionType
    {
        ReturnRequestDecisionType_REFUND_MONEY,
        ReturnRequestDecisionType_REFUND_MONEY_INCLUDING_SHIPMENT,
        ReturnRequestDecisionType_REPAIR,
        ReturnRequestDecisionType_REPLACE,
        ReturnRequestDecisionType_SEND_TO_EXAMINATION,
        ReturnRequestDecisionType_DECLINE_REFUND,
        ReturnRequestDecisionType_OTHER_DECISION,
    };

    eReturnRequestDecisionType getValue() const;
    void setValue(eReturnRequestDecisionType const value);

    protected:
        eReturnRequestDecisionType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnRequestDecisionType_H_ */
