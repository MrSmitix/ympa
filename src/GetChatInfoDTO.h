/*
 * GetChatInfoDTO.h
 *
 * Информация о чатах.
 */

#ifndef _GetChatInfoDTO_H_
#define _GetChatInfoDTO_H_


#include <string>
#include "ChatStatusType.h"
#include "ChatType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о чатах.
 *
 *  \ingroup Models
 *
 */

class GetChatInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatInfoDTO();
	GetChatInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор чата.
	 */
	long long getChatId();

	/*! \brief Set Идентификатор чата.
	 */
	void setChatId(long long  chatId);
	/*! \brief Get Идентификатор заказа.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long long  orderId);
	/*! \brief Get 
	 */
	ChatType getType();

	/*! \brief Set 
	 */
	void setType(ChatType  type);
	/*! \brief Get 
	 */
	ChatStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ChatStatusType  status);
	/*! \brief Get Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Дата и время последнего сообщения в чате.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего сообщения в чате.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	long long chatId;
	long long orderId;
	ChatType type;
	ChatStatusType status;
	std::string createdAt;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatInfoDTO_H_ */
