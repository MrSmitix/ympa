
/*
 * GetChatInfoDTO.h
 *
 * Информация о чатах.
 */

#ifndef TINY_CPP_CLIENT_GetChatInfoDTO_H_
#define TINY_CPP_CLIENT_GetChatInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatStatusType.h"
#include "ChatType.h"

namespace Tiny {


/*! \brief Информация о чатах.
 *
 *  \ingroup Models
 *
 */

class GetChatInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetChatInfoDTO();
    GetChatInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор чата.
	 */
	long getChatId();

	/*! \brief Set Идентификатор чата.
	 */
	void setChatId(long  chatId);
	/*! \brief Get Идентификатор заказа.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long  orderId);
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
    long chatId{};
    long orderId{};
    ChatType type;
    ChatStatusType status;
    std::string createdAt{};
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_GetChatInfoDTO_H_ */
