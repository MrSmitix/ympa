
/*
 * SetOrderDeliveryDateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SetOrderDeliveryDateRequest_H_
#define TINY_CPP_CLIENT_SetOrderDeliveryDateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderDeliveryDateDTO.h"
#include "OrderDeliveryDateReasonType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderDeliveryDateRequest{
public:

    /*! \brief Constructor.
	 */
    SetOrderDeliveryDateRequest();
    SetOrderDeliveryDateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetOrderDeliveryDateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderDeliveryDateDTO getDates();

	/*! \brief Set 
	 */
	void setDates(OrderDeliveryDateDTO  dates);
	/*! \brief Get 
	 */
	OrderDeliveryDateReasonType getReason();

	/*! \brief Set 
	 */
	void setReason(OrderDeliveryDateReasonType  reason);


    private:
    OrderDeliveryDateDTO dates;
    OrderDeliveryDateReasonType reason;
};
}

#endif /* TINY_CPP_CLIENT_SetOrderDeliveryDateRequest_H_ */
