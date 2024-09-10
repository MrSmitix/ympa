/*
 * OrderStatusChangeDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef _OrderStatusChangeDeliveryDatesDTO_H_
#define _OrderStatusChangeDeliveryDatesDTO_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Диапазон дат доставки.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDeliveryDatesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatusChangeDeliveryDatesDTO();
	OrderStatusChangeDeliveryDatesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatusChangeDeliveryDatesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
	 */
	Date getRealDeliveryDate();

	/*! \brief Set **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
	 */
	void setRealDeliveryDate(Date  realDeliveryDate);

private:
	Date realDeliveryDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStatusChangeDeliveryDatesDTO_H_ */
