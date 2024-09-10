/*
 * OrderStatusChangeDeliveryDTO.h
 *
 * Информация о доставке.
 */

#ifndef _OrderStatusChangeDeliveryDTO_H_
#define _OrderStatusChangeDeliveryDTO_H_


#include <string>
#include "OrderStatusChangeDeliveryDatesDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о доставке.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDeliveryDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatusChangeDeliveryDTO();
	OrderStatusChangeDeliveryDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatusChangeDeliveryDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderStatusChangeDeliveryDatesDTO getDates();

	/*! \brief Set 
	 */
	void setDates(OrderStatusChangeDeliveryDatesDTO  dates);

private:
	OrderStatusChangeDeliveryDatesDTO dates;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStatusChangeDeliveryDTO_H_ */
