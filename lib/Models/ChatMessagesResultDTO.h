
/*
 * ChatMessagesResultDTO.h
 *
 * Информация о сообщениях.
 */

#ifndef TINY_CPP_CLIENT_ChatMessagesResultDTO_H_
#define TINY_CPP_CLIENT_ChatMessagesResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatMessageDTO.h"
#include "ForwardScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о сообщениях.
 *
 *  \ingroup Models
 *
 */

class ChatMessagesResultDTO{
public:

    /*! \brief Constructor.
	 */
    ChatMessagesResultDTO();
    ChatMessagesResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatMessagesResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long  orderId);
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
    long orderId{};
    std::list<ChatMessageDTO> messages;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_ChatMessagesResultDTO_H_ */
