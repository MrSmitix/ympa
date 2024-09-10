/*
 * OrderSubstatusType.h
 *
 * Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  * Значения для заказа в статусе &#x60;PROCESSING&#x60;:      * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать.      * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке.  * Значения для заказа в статусе &#x60;CANCELLED&#x60;:      * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.      * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.      * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.      * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.      * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.      * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.      * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.      * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.      * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * &#x60;TECHNICAL_ERROR&#x60; — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */

#ifndef _OrderSubstatusType_H_
#define _OrderSubstatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 *
 *  \ingroup Models
 *
 */

class OrderSubstatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderSubstatusType();
	OrderSubstatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderSubstatusType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderSubstatusType_H_ */
