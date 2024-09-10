/*
 * OrderStatusChangeDTO.h
 *
 * Заказ.
 */

#ifndef _OrderStatusChangeDTO_H_
#define _OrderStatusChangeDTO_H_


#include <string>
#include "OrderStatusChangeDeliveryDTO.h"
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Заказ.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatusChangeDTO();
	OrderStatusChangeDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatusChangeDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderStatusType  status);
	/*! \brief Get 
	 */
	OrderSubstatusType getSubstatus();

	/*! \brief Set 
	 */
	void setSubstatus(OrderSubstatusType  substatus);
	/*! \brief Get 
	 */
	OrderStatusChangeDeliveryDTO getDelivery();

	/*! \brief Set 
	 */
	void setDelivery(OrderStatusChangeDeliveryDTO  delivery);

private:
	OrderStatusType status;
	OrderSubstatusType substatus;
	OrderStatusChangeDeliveryDTO delivery;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStatusChangeDTO_H_ */
