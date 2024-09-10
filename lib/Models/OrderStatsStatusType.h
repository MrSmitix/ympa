
/*
 * OrderStatsStatusType.h
 *
 * Текущий статус заказа:  * &#x60;CANCELLED_BEFORE_PROCESSING&#x60; — заказ отменен до начала его обработки.  * &#x60;CANCELLED_IN_DELIVERY&#x60; — заказ отменен во время его доставки.  * &#x60;CANCELLED_IN_PROCESSING&#x60; — заказ отменен во время его обработки.  * &#x60;DELIVERY&#x60; — заказ передан службе доставки.  * &#x60;DELIVERED&#x60; — заказ доставлен.  * &#x60;PARTIALLY_DELIVERED&#x60; — заказ частично доставлен.  * &#x60;PARTIALLY_RETURNED&#x60; — заказ частично возвращен покупателем.  * &#x60;PENDING&#x60; — заказ ожидает подтверждения.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт выдачи.  * &#x60;PROCESSING&#x60; — заказ в обработке.  * &#x60;RESERVED&#x60; — товар зарезервирован на складе.  * &#x60;RETURNED&#x60; — заказ полностью возвращен покупателем.  * &#x60;UNKNOWN&#x60; — неизвестный статус заказа.  * &#x60;UNPAID&#x60; — заказ от юридического лица ожидает оплаты.  * &#x60;LOST&#x60; — заказ утерян. 
 */

#ifndef TINY_CPP_CLIENT_OrderStatsStatusType_H_
#define TINY_CPP_CLIENT_OrderStatsStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
 *
 *  \ingroup Models
 *
 */

class OrderStatsStatusType{
public:

    /*! \brief Constructor.
	 */
    OrderStatsStatusType();
    OrderStatsStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderStatsStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderStatsStatusType_H_ */
