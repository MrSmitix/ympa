
/*
 * OrderDeliveryDateReasonType.h
 *
 * Причина переноса доставки заказа. Возможные причины изменения даты:   - &#x60;&#x60;&#x60;USER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - &#x60;&#x60;&#x60;PARTNER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — магазин не может доставить заказ в срок. 
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryDateReasonType_H_
#define TINY_CPP_CLIENT_OrderDeliveryDateReasonType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDateReasonType{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryDateReasonType();
    OrderDeliveryDateReasonType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryDateReasonType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryDateReasonType_H_ */
