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
 * ChatMessageSenderType.h
 *
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageSenderType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageSenderType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  ChatMessageSenderType
    : public ModelBase
{
public:
    ChatMessageSenderType();
    virtual ~ChatMessageSenderType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eChatMessageSenderType
    {
        ChatMessageSenderType_PARTNER,
        ChatMessageSenderType_CUSTOMER,
        ChatMessageSenderType_MARKET,
        ChatMessageSenderType_SUPPORT,
    };

    eChatMessageSenderType getValue() const;
    void setValue(eChatMessageSenderType const value);

    protected:
        eChatMessageSenderType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageSenderType_H_ */
