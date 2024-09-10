
/*
 * ChatStatusType.h
 *
 * Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен. 
 */

#ifndef TINY_CPP_CLIENT_ChatStatusType_H_
#define TINY_CPP_CLIENT_ChatStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
 *
 *  \ingroup Models
 *
 */

class ChatStatusType{
public:

    /*! \brief Constructor.
	 */
    ChatStatusType();
    ChatStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatStatusType_H_ */
