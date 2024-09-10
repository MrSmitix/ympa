/*
 * ChatMessagesResultDTO.h
 *
 * Информация о сообщениях.
 */

#ifndef _ChatMessagesResultDTO_H_
#define _ChatMessagesResultDTO_H_


#include <string>
#include "ChatMessageDTO.h"
#include "ForwardScrollingPagerDTO.h"
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

class ChatMessagesResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatMessagesResultDTO();
	ChatMessagesResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatMessagesResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long long  orderId);
	/*! \brief Get Информация о сообщениях.
	 */
	std::list<ChatMessageDTO> getMessages();

	/*! \brief Set Информация о сообщениях.
	 */
	void setMessages(std::list <ChatMessageDTO> messages);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	long long orderId;
	std::list <ChatMessageDTO>messages;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatMessagesResultDTO_H_ */
