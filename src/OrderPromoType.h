/*
 * OrderPromoType.h
 *
 * Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
 */

#ifndef _OrderPromoType_H_
#define _OrderPromoType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. 
 *
 *  \ingroup Models
 *
 */

class OrderPromoType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderPromoType();
	OrderPromoType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderPromoType();

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

#endif /* _OrderPromoType_H_ */
