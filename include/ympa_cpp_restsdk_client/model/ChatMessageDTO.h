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
 * ChatMessageDTO.h
 *
 * Информация о сообщениях.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ChatMessagePayloadDTO.h"
#include <cpprest/details/basic_types.h>
#include <vector>
#include "ympa_cpp_restsdk_client/model/ChatMessageSenderType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatMessagePayloadDTO;


/// <summary>
/// Информация о сообщениях.
/// </summary>
class  ChatMessageDTO
    : public ModelBase
{
public:
    ChatMessageDTO();
    virtual ~ChatMessageDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatMessageDTO members

    /// <summary>
    /// Идентификатор сообщения.
    /// </summary>
    int64_t getMessageId() const;
    bool messageIdIsSet() const;
    void unsetMessageId();

    void setMessageId(int64_t value);

    /// <summary>
    /// Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
    /// </summary>
    utility::datetime getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreatedAt();

    void setCreatedAt(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ChatMessageSenderType> getSender() const;
    bool senderIsSet() const;
    void unsetSender();

    void setSender(const std::shared_ptr<ChatMessageSenderType>& value);

    /// <summary>
    /// Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;. 
    /// </summary>
    utility::string_t getMessage() const;
    bool messageIsSet() const;
    void unsetMessage();

    void setMessage(const utility::string_t& value);

    /// <summary>
    /// Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;. 
    /// </summary>
    std::vector<std::shared_ptr<ChatMessagePayloadDTO>>& getPayload();
    bool payloadIsSet() const;
    void unsetPayload();

    void setPayload(const std::vector<std::shared_ptr<ChatMessagePayloadDTO>>& value);


protected:
    int64_t m_MessageId;
    bool m_MessageIdIsSet;
    utility::datetime m_CreatedAt;
    bool m_CreatedAtIsSet;
    std::shared_ptr<ChatMessageSenderType> m_Sender;
    bool m_SenderIsSet;
    utility::string_t m_Message;
    bool m_MessageIsSet;
    std::vector<std::shared_ptr<ChatMessagePayloadDTO>> m_Payload;
    bool m_PayloadIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatMessageDTO_H_ */
