/*
 * OrderDeliveryDateDTO.h
 *
 * Информация о новой дате доставки заказа.
 */

#ifndef _OrderDeliveryDateDTO_H_
#define _OrderDeliveryDateDTO_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о новой дате доставки заказа.
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDateDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDeliveryDateDTO();
	OrderDeliveryDateDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDeliveryDateDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getToDate();

	/*! \brief Set Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setToDate(Date  toDate);

private:
	Date toDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderDeliveryDateDTO_H_ */
