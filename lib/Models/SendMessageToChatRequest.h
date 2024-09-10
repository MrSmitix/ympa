
/*
 * SendMessageToChatRequest.h
 *
 * В какой чат нужно отправить сообщение и текст сообщения.
 */

#ifndef TINY_CPP_CLIENT_SendMessageToChatRequest_H_
#define TINY_CPP_CLIENT_SendMessageToChatRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief В какой чат нужно отправить сообщение и текст сообщения.
 *
 *  \ingroup Models
 *
 */

class SendMessageToChatRequest{
public:

    /*! \brief Constructor.
	 */
    SendMessageToChatRequest();
    SendMessageToChatRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SendMessageToChatRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Текст сообщения. Максимальная длина — 4096 символа.
	 */
	std::string getMessage();

	/*! \brief Set Текст сообщения. Максимальная длина — 4096 символа.
	 */
	void setMessage(std::string  message);


    private:
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_SendMessageToChatRequest_H_ */
