/*
 * ChatMessageDTO.h
 *
 * Информация о сообщениях.
 */

#ifndef _ChatMessageDTO_H_
#define _ChatMessageDTO_H_


#include <string>
#include "ChatMessagePayloadDTO.h"
#include "ChatMessageSenderType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о сообщениях.
 *
 *  \ingroup Models
 *
 */

class ChatMessageDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatMessageDTO();
	ChatMessageDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatMessageDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор сообщения.
	 */
	long long getMessageId();

	/*! \brief Set Идентификатор сообщения.
	 */
	void setMessageId(long long  messageId);
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
	long long messageId;
	std::string createdAt;
	ChatMessageSenderType sender;
	std::string message;
	std::list <ChatMessagePayloadDTO>payload;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatMessageDTO_H_ */
