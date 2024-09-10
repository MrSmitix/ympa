/*
 * OrderStateDTO.h
 *
 * Информация по заказу.
 */

#ifndef _OrderStateDTO_H_
#define _OrderStateDTO_H_


#include <string>
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация по заказу.
 *
 *  \ingroup Models
 *
 */

class OrderStateDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStateDTO();
	OrderStateDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStateDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа.
	 */
	long long getId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setId(long long  id);
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

private:
	long long id;
	OrderStatusType status;
	OrderSubstatusType substatus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStateDTO_H_ */
