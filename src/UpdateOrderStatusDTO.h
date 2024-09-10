/*
 * UpdateOrderStatusDTO.h
 *
 * Список заказов.
 */

#ifndef _UpdateOrderStatusDTO_H_
#define _UpdateOrderStatusDTO_H_


#include <string>
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"
#include "OrderUpdateStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список заказов.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusDTO();
	UpdateOrderStatusDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusDTO();

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
	/*! \brief Get 
	 */
	OrderUpdateStatusType getUpdateStatus();

	/*! \brief Set 
	 */
	void setUpdateStatus(OrderUpdateStatusType  updateStatus);
	/*! \brief Get Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
	 */
	std::string getErrorDetails();

	/*! \brief Set Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
	 */
	void setErrorDetails(std::string  errorDetails);

private:
	long long id;
	OrderStatusType status;
	OrderSubstatusType substatus;
	OrderUpdateStatusType updateStatus;
	std::string errorDetails;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStatusDTO_H_ */
