/*
 * ProvideOrderDigitalCodesRequest.h
 *
 * Запрос на передачу ключей цифровых товаров.
 */

#ifndef _ProvideOrderDigitalCodesRequest_H_
#define _ProvideOrderDigitalCodesRequest_H_


#include <string>
#include "OrderDigitalItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на передачу ключей цифровых товаров.
 *
 *  \ingroup Models
 *
 */

class ProvideOrderDigitalCodesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProvideOrderDigitalCodesRequest();
	ProvideOrderDigitalCodesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProvideOrderDigitalCodesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
	 */
	std::list<OrderDigitalItemDTO> getItems();

	/*! \brief Set Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
	 */
	void setItems(std::list <OrderDigitalItemDTO> items);

private:
	std::list <OrderDigitalItemDTO>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProvideOrderDigitalCodesRequest_H_ */
