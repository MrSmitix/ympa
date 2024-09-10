/*
 * OrderItemDTO.h
 *
 * Список товаров в заказе.
 */

#ifndef _OrderItemDTO_H_
#define _OrderItemDTO_H_


#include <string>
#include "OrderItemDetailDTO.h"
#include "OrderItemInstanceDTO.h"
#include "OrderItemInstanceType.h"
#include "OrderItemPromoDTO.h"
#include "OrderItemSubsidyDTO.h"
#include "OrderVatType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров в заказе.
 *
 *  \ingroup Models
 *
 */

class OrderItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemDTO();
	OrderItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	long long getId();

	/*! \brief Set Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	void setId(long long  id);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get Название товара.
	 */
	std::string getOfferName();

	/*! \brief Set Название товара.
	 */
	void setOfferName(std::string  offerName);
	/*! \brief Get Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
	 */
	long long getPrice();

	/*! \brief Set Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
	 */
	void setPrice(long long  price);
	/*! \brief Get Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
	 */
	long long getBuyerPrice();

	/*! \brief Set Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
	 */
	void setBuyerPrice(long long  buyerPrice);
	/*! \brief Get Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	long long getBuyerPriceBeforeDiscount();

	/*! \brief Set Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	void setBuyerPriceBeforeDiscount(long long  buyerPriceBeforeDiscount);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
	 */
	long long getPriceBeforeDiscount();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
	 */
	void setPriceBeforeDiscount(long long  priceBeforeDiscount);
	/*! \brief Get Количество единиц товара.
	 */
	int getCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	OrderVatType getVat();

	/*! \brief Set 
	 */
	void setVat(OrderVatType  vat);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
	 */
	long long getSubsidy();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
	 */
	void setSubsidy(long long  subsidy);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
	 */
	std::string getPartnerWarehouseId();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
	 */
	void setPartnerWarehouseId(std::string  partnerWarehouseId);
	/*! \brief Get Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
	 */
	std::list<OrderItemPromoDTO> getPromos();

	/*! \brief Set Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
	 */
	void setPromos(std::list <OrderItemPromoDTO> promos);
	/*! \brief Get Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
	 */
	std::list<OrderItemInstanceDTO> getInstances();

	/*! \brief Set Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
	 */
	void setInstances(std::list <OrderItemInstanceDTO> instances);
	/*! \brief Get Информация об удалении товара из заказа. 
	 */
	std::list<OrderItemDetailDTO> getDetails();

	/*! \brief Set Информация об удалении товара из заказа. 
	 */
	void setDetails(std::list <OrderItemDetailDTO> details);
	/*! \brief Get Список субсидий по типам.
	 */
	std::list<OrderItemSubsidyDTO> getSubsidies();

	/*! \brief Set Список субсидий по типам.
	 */
	void setSubsidies(std::list <OrderItemSubsidyDTO> subsidies);
	/*! \brief Get Список необходимых маркировок товара.
	 */
	std::list<OrderItemInstanceType> getRequiredInstanceTypes();

	/*! \brief Set Список необходимых маркировок товара.
	 */
	void setRequiredInstanceTypes(std::list <OrderItemInstanceType> requiredInstanceTypes);

private:
	long long id;
	std::string offerId;
	std::string offerName;
	long long price;
	long long buyerPrice;
	long long buyerPriceBeforeDiscount;
	long long priceBeforeDiscount;
	int count;
	OrderVatType vat;
	std::string shopSku;
	long long subsidy;
	std::string partnerWarehouseId;
	std::list <OrderItemPromoDTO>promos;
	std::list <OrderItemInstanceDTO>instances;
	std::list <OrderItemDetailDTO>details;
	std::list <OrderItemSubsidyDTO>subsidies;
	std::list <OrderItemInstanceType>requiredInstanceTypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemDTO_H_ */
