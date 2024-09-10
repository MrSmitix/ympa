
/*
 * CreateChatRequest.h
 *
 * Заказ, для которого нужно создать чат. 
 */

#ifndef TINY_CPP_CLIENT_CreateChatRequest_H_
#define TINY_CPP_CLIENT_CreateChatRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Заказ, для которого нужно создать чат. 
 *
 *  \ingroup Models
 *
 */

class CreateChatRequest{
public:

    /*! \brief Constructor.
	 */
    CreateChatRequest();
    CreateChatRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа на Маркете.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа на Маркете.
	 */
	void setOrderId(long  orderId);


    private:
    long orderId{};
};
}

#endif /* TINY_CPP_CLIENT_CreateChatRequest_H_ */
