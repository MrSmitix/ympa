
/*
 * OrdersStatsCommissionType.h
 *
 * Услуга:  * &#x60;FEE&#x60; — размещение товара на Маркете. * &#x60;FULFILLMENT&#x60; — складская обработка. Не возвращается с 1 января 2024 года. * &#x60;LOYALTY_PARTICIPATION_FEE&#x60; — участие в программе лояльности и отзывы за баллы. * &#x60;AUCTION_PROMOTION&#x60; — буст продаж с оплатой за продажи. * &#x60;INSTALLMENT&#x60; — рассрочка. Не возвращается с 24 февраля 2022 года. * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;EXPRESS_DELIVERY_TO_CUSTOMER&#x60; — экспресс-доставка покупателю (Экспресс). * &#x60;AGENCY&#x60; — прием платежа покупателя. * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя. * &#x60;RETURNED_ORDERS_STORAGE&#x60; — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;SORTING&#x60; — обработка заказа (FBS). * &#x60;INTAKE_SORTING&#x60; — организация забора заказов со склада продавца (FBS). * &#x60;RETURN_PROCESSING&#x60; — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;ILLIQUID_GOODS_SALE&#x60; — вознаграждение за продажу невывезенных товаров. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsCommissionType_H_
#define TINY_CPP_CLIENT_OrdersStatsCommissionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsCommissionType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsCommissionType();
    OrdersStatsCommissionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsCommissionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsCommissionType_H_ */
