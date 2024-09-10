/*
 * OrderDTO.h
 *
 * Заказ.
 */

#ifndef _OrderDTO_H_
#define _OrderDTO_H_


#include <string>
#include "CurrencyType.h"
#include "OrderBuyerDTO.h"
#include "OrderDeliveryDTO.h"
#include "OrderItemDTO.h"
#include "OrderPaymentMethodType.h"
#include "OrderPaymentType.h"
#include "OrderStatusType.h"
#include "OrderSubsidyDTO.h"
#include "OrderSubstatusType.h"
#include "OrderTaxSystemType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Заказ.
 *
 *  \ingroup Models
 *
 */

class OrderDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDTO();
	OrderDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа.
	 */
	long long getId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setId(long long  id);
	/*! \brief Get 
	 */
	OrderStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderStatusType  status);
	/*! \brief Get 
	 */
	OrderSubstatusType getSubstatus();

	/*! \brief Set 
	 */
	void setSubstatus(OrderSubstatusType  substatus);
	/*! \brief Get 
	 */
	std::string getCreationDate();

	/*! \brief Set 
	 */
	void setCreationDate(std::string  creationDate);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string  updatedAt);
	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);
	/*! \brief Get Платеж покупателя. 
	 */
	long long getItemsTotal();

	/*! \brief Set Платеж покупателя. 
	 */
	void setItemsTotal(long long  itemsTotal);
	/*! \brief Get Стоимость доставки. 
	 */
	long long getDeliveryTotal();

	/*! \brief Set Стоимость доставки. 
	 */
	void setDeliveryTotal(long long  deliveryTotal);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
	 */
	long long getBuyerItemsTotal();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
	 */
	void setBuyerItemsTotal(long long  buyerItemsTotal);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
	 */
	long long getBuyerTotal();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
	 */
	void setBuyerTotal(long long  buyerTotal);
	/*! \brief Get Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	long long getBuyerItemsTotalBeforeDiscount();

	/*! \brief Set Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	void setBuyerItemsTotalBeforeDiscount(long long  buyerItemsTotalBeforeDiscount);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
	 */
	long long getBuyerTotalBeforeDiscount();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
	 */
	void setBuyerTotalBeforeDiscount(long long  buyerTotalBeforeDiscount);
	/*! \brief Get 
	 */
	OrderPaymentType getPaymentType();

	/*! \brief Set 
	 */
	void setPaymentType(OrderPaymentType  paymentType);
	/*! \brief Get 
	 */
	OrderPaymentMethodType getPaymentMethod();

	/*! \brief Set 
	 */
	void setPaymentMethod(OrderPaymentMethodType  paymentMethod);
	/*! \brief Get Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	 */
	bool getFake();

	/*! \brief Set Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	 */
	void setFake(bool  fake);
	/*! \brief Get Список товаров в заказе.
	 */
	std::list<OrderItemDTO> getItems();

	/*! \brief Set Список товаров в заказе.
	 */
	void setItems(std::list <OrderItemDTO> items);
	/*! \brief Get Список субсидий по типам.
	 */
	std::list<OrderSubsidyDTO> getSubsidies();

	/*! \brief Set Список субсидий по типам.
	 */
	void setSubsidies(std::list <OrderSubsidyDTO> subsidies);
	/*! \brief Get 
	 */
	OrderDeliveryDTO getDelivery();

	/*! \brief Set 
	 */
	void setDelivery(OrderDeliveryDTO  delivery);
	/*! \brief Get 
	 */
	OrderBuyerDTO getBuyer();

	/*! \brief Set 
	 */
	void setBuyer(OrderBuyerDTO  buyer);
	/*! \brief Get Комментарий к заказу.
	 */
	std::string getNotes();

	/*! \brief Set Комментарий к заказу.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get 
	 */
	OrderTaxSystemType getTaxSystem();

	/*! \brief Set 
	 */
	void setTaxSystem(OrderTaxSystemType  taxSystem);
	/*! \brief Get **Только для модели DBS**  Запрошена ли отмена. 
	 */
	bool getCancelRequested();

	/*! \brief Set **Только для модели DBS**  Запрошена ли отмена. 
	 */
	void setCancelRequested(bool  cancelRequested);
	/*! \brief Get 
	 */
	std::string getExpiryDate();

	/*! \brief Set 
	 */
	void setExpiryDate(std::string  expiryDate);

private:
	long long id;
	OrderStatusType status;
	OrderSubstatusType substatus;
	std::string creationDate;
	std::string updatedAt;
	CurrencyType currency;
	long long itemsTotal;
	long long deliveryTotal;
	long long buyerItemsTotal;
	long long buyerTotal;
	long long buyerItemsTotalBeforeDiscount;
	long long buyerTotalBeforeDiscount;
	OrderPaymentType paymentType;
	OrderPaymentMethodType paymentMethod;
	bool fake;
	std::list <OrderItemDTO>items;
	std::list <OrderSubsidyDTO>subsidies;
	OrderDeliveryDTO delivery;
	OrderBuyerDTO buyer;
	std::string notes;
	OrderTaxSystemType taxSystem;
	bool cancelRequested;
	std::string expiryDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderDTO_H_ */
