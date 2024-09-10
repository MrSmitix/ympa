/*
 * GetChatHistoryRequest.h
 *
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */

#ifndef _GetChatHistoryRequest_H_
#define _GetChatHistoryRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Историю какого чата нужно получить — и начиная с какого сообщения. 
 *
 *  \ingroup Models
 *
 */

class GetChatHistoryRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatHistoryRequest();
	GetChatHistoryRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatHistoryRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
	 */
	long long getMessageIdFrom();

	/*! \brief Set Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
	 */
	void setMessageIdFrom(long long  messageIdFrom);

private:
	long long messageIdFrom;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatHistoryRequest_H_ */
