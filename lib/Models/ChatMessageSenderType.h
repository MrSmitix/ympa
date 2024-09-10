
/*
 * ChatMessageSenderType.h
 *
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */

#ifndef TINY_CPP_CLIENT_ChatMessageSenderType_H_
#define TINY_CPP_CLIENT_ChatMessageSenderType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
 *
 *  \ingroup Models
 *
 */

class ChatMessageSenderType{
public:

    /*! \brief Constructor.
	 */
    ChatMessageSenderType();
    ChatMessageSenderType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatMessageSenderType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatMessageSenderType_H_ */
