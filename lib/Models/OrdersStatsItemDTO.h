
/*
 * OrdersStatsItemDTO.h
 *
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsItemDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrdersStatsDetailsDTO.h"
#include "OrdersStatsPriceDTO.h"
#include "OrdersStatsWarehouseDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsItemDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsItemDTO();
    OrdersStatsItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Название товара.
	 */
	std::string getOfferName();

	/*! \brief Set Название товара.
	 */
	void setOfferName(std::string  offerName);
	/*! \brief Get SKU на Маркете.
	 */
	long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long  marketSku);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
	 */
	int getCount();

	/*! \brief Set Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
	 */
	void setCount(int  count);
	/*! \brief Get Цена или скидки на товар.
	 */
	std::list<OrdersStatsPriceDTO> getPrices();

	/*! \brief Set Цена или скидки на товар.
	 */
	void setPrices(std::list <OrdersStatsPriceDTO> prices);
	/*! \brief Get 
	 */
	OrdersStatsWarehouseDTO getWarehouse();

	/*! \brief Set 
	 */
	void setWarehouse(OrdersStatsWarehouseDTO  warehouse);
	/*! \brief Get Информация об удалении товара из заказа.
	 */
	std::list<OrdersStatsDetailsDTO> getDetails();

	/*! \brief Set Информация об удалении товара из заказа.
	 */
	void setDetails(std::list <OrdersStatsDetailsDTO> details);
	/*! \brief Get Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	std::list<std::string> getCisList();

	/*! \brief Set Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	void setCisList(std::list <std::string> cisList);
	/*! \brief Get Первоначальное количество единиц товара.
	 */
	int getInitialCount();

	/*! \brief Set Первоначальное количество единиц товара.
	 */
	void setInitialCount(int  initialCount);
	/*! \brief Get Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
	 */
	int getBidFee();

	/*! \brief Set Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
	 */
	void setBidFee(int  bidFee);
	/*! \brief Get Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
	 */
	long getCofinanceThreshold();

	/*! \brief Set Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
	 */
	void setCofinanceThreshold(long  cofinanceThreshold);
	/*! \brief Get Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
	 */
	long getCofinanceValue();

	/*! \brief Set Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
	 */
	void setCofinanceValue(long  cofinanceValue);


    private:
    std::string offerName{};
    long marketSku{};
    std::string shopSku{};
    int count{};
    std::list<OrdersStatsPriceDTO> prices;
    OrdersStatsWarehouseDTO warehouse;
    std::list<OrdersStatsDetailsDTO> details;
    std::list<std::string> cisList;
    int initialCount{};
    int bidFee{};
    long cofinanceThreshold{};
    long cofinanceValue{};
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsItemDTO_H_ */
