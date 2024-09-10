
/*
 * OrderItemsModificationRequestReasonType.h
 *
 * Причина обновления состава заказа.
 */

#ifndef TINY_CPP_CLIENT_OrderItemsModificationRequestReasonType_H_
#define TINY_CPP_CLIENT_OrderItemsModificationRequestReasonType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Причина обновления состава заказа.
 *
 *  \ingroup Models
 *
 */

class OrderItemsModificationRequestReasonType{
public:

    /*! \brief Constructor.
	 */
    OrderItemsModificationRequestReasonType();
    OrderItemsModificationRequestReasonType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemsModificationRequestReasonType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderItemsModificationRequestReasonType_H_ */
