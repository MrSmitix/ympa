/*
 * UpdateOrderStatusesDTO.h
 *
 * Список заказов, статус которых обновился.
 */

#ifndef _UpdateOrderStatusesDTO_H_
#define _UpdateOrderStatusesDTO_H_


#include <string>
#include "UpdateOrderStatusDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список заказов, статус которых обновился.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusesDTO();
	UpdateOrderStatusesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список с обновленными заказами.
	 */
	std::list<UpdateOrderStatusDTO> getOrders();

	/*! \brief Set Список с обновленными заказами.
	 */
	void setOrders(std::list <UpdateOrderStatusDTO> orders);

private:
	std::list <UpdateOrderStatusDTO>orders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStatusesDTO_H_ */
