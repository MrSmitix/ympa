
/*
 * ChatMessageDTO.h
 *
 * Информация о сообщениях.
 */

#ifndef TINY_CPP_CLIENT_ChatMessageDTO_H_
#define TINY_CPP_CLIENT_ChatMessageDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatMessagePayloadDTO.h"
#include "ChatMessageSenderType.h"
#include <list>

namespace Tiny {


/*! \brief Информация о сообщениях.
 *
 *  \ingroup Models
 *
 */

class ChatMessageDTO{
public:

    /*! \brief Constructor.
	 */
    ChatMessageDTO();
    ChatMessageDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatMessageDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор сообщения.
	 */
	long getMessageId();

	/*! \brief Set Идентификатор сообщения.
	 */
	void setMessageId(long  messageId);
	/*! \brief Get Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get 
	 */
	ChatMessageSenderType getSender();

	/*! \brief Set 
	 */
	void setSender(ChatMessageSenderType  sender);
	/*! \brief Get Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
	 */
	std::string getMessage();

	/*! \brief Set Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
	 */
	void setMessage(std::string  message);
	/*! \brief Get Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
	 */
	std::list<ChatMessagePayloadDTO> getPayload();

	/*! \brief Set Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
	 */
	void setPayload(std::list <ChatMessagePayloadDTO> payload);


    private:
    long messageId{};
    std::string createdAt{};
    ChatMessageSenderType sender;
    std::string message{};
    std::list<ChatMessagePayloadDTO> payload;
};
}

#endif /* TINY_CPP_CLIENT_ChatMessageDTO_H_ */
