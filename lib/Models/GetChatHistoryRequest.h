
/*
 * GetChatHistoryRequest.h
 *
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */

#ifndef TINY_CPP_CLIENT_GetChatHistoryRequest_H_
#define TINY_CPP_CLIENT_GetChatHistoryRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Историю какого чата нужно получить — и начиная с какого сообщения. 
 *
 *  \ingroup Models
 *
 */

class GetChatHistoryRequest{
public:

    /*! \brief Constructor.
	 */
    GetChatHistoryRequest();
    GetChatHistoryRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatHistoryRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
	 */
	long getMessageIdFrom();

	/*! \brief Set Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
	 */
	void setMessageIdFrom(long  messageIdFrom);


    private:
    long messageIdFrom{};
};
}

#endif /* TINY_CPP_CLIENT_GetChatHistoryRequest_H_ */
