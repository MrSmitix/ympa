/*
 * SendMessageToChatRequest.h
 *
 * В какой чат нужно отправить сообщение и текст сообщения.
 */

#ifndef _SendMessageToChatRequest_H_
#define _SendMessageToChatRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief В какой чат нужно отправить сообщение и текст сообщения.
 *
 *  \ingroup Models
 *
 */

class SendMessageToChatRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SendMessageToChatRequest();
	SendMessageToChatRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SendMessageToChatRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Текст сообщения. Максимальная длина — 4096 символа.
	 */
	std::string getMessage();

	/*! \brief Set Текст сообщения. Максимальная длина — 4096 символа.
	 */
	void setMessage(std::string  message);

private:
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SendMessageToChatRequest_H_ */
