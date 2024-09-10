
/*
 * AcceptOrderCancellationRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AcceptOrderCancellationRequest_H_
#define TINY_CPP_CLIENT_AcceptOrderCancellationRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderCancellationReasonType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AcceptOrderCancellationRequest{
public:

    /*! \brief Constructor.
	 */
    AcceptOrderCancellationRequest();
    AcceptOrderCancellationRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AcceptOrderCancellationRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
	 */
	bool isAccepted();

	/*! \brief Set Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
	 */
	void setAccepted(bool  accepted);
	/*! \brief Get 
	 */
	OrderCancellationReasonType getReason();

	/*! \brief Set 
	 */
	void setReason(OrderCancellationReasonType  reason);


    private:
    bool accepted{};
    OrderCancellationReasonType reason;
};
}

#endif /* TINY_CPP_CLIENT_AcceptOrderCancellationRequest_H_ */
