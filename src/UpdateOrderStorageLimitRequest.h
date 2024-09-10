/*
 * UpdateOrderStorageLimitRequest.h
 *
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

#ifndef _UpdateOrderStorageLimitRequest_H_
#define _UpdateOrderStorageLimitRequest_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на обновление срока хранения заказа в ПВЗ.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStorageLimitRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStorageLimitRequest();
	UpdateOrderStorageLimitRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStorageLimitRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getNewDate();

	/*! \brief Set Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setNewDate(Date  newDate);

private:
	Date newDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStorageLimitRequest_H_ */
