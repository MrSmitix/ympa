
/*
 * OrderDTO.h
 *
 * Заказ.
 */

#ifndef TINY_CPP_CLIENT_OrderDTO_H_
#define TINY_CPP_CLIENT_OrderDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
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

namespace Tiny {


/*! \brief Заказ.
 *
 *  \ingroup Models
 *
 */

class OrderDTO{
public:

    /*! \brief Constructor.
	 */
    OrderDTO();
    OrderDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа.
	 */
	long getId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setId(long  id);
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
	long getItemsTotal();

	/*! \brief Set Платеж покупателя. 
	 */
	void setItemsTotal(long  itemsTotal);
	/*! \brief Get Стоимость доставки. 
	 */
	long getDeliveryTotal();

	/*! \brief Set Стоимость доставки. 
	 */
	void setDeliveryTotal(long  deliveryTotal);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
	 */
	long getBuyerItemsTotal();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
	 */
	void setBuyerItemsTotal(long  buyerItemsTotal);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
	 */
	long getBuyerTotal();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
	 */
	void setBuyerTotal(long  buyerTotal);
	/*! \brief Get Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	long getBuyerItemsTotalBeforeDiscount();

	/*! \brief Set Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
	 */
	void setBuyerItemsTotalBeforeDiscount(long  buyerItemsTotalBeforeDiscount);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
	 */
	long getBuyerTotalBeforeDiscount();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
	 */
	void setBuyerTotalBeforeDiscount(long  buyerTotalBeforeDiscount);
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
	bool isFake();

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
	bool isCancelRequested();

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
    long id{};
    OrderStatusType status;
    OrderSubstatusType substatus;
    std::string creationDate{};
    std::string updatedAt{};
    CurrencyType currency;
    long itemsTotal{};
    long deliveryTotal{};
    long buyerItemsTotal{};
    long buyerTotal{};
    long buyerItemsTotalBeforeDiscount{};
    long buyerTotalBeforeDiscount{};
    OrderPaymentType paymentType;
    OrderPaymentMethodType paymentMethod;
    bool fake{};
    std::list<OrderItemDTO> items;
    std::list<OrderSubsidyDTO> subsidies;
    OrderDeliveryDTO delivery;
    OrderBuyerDTO buyer;
    std::string notes{};
    OrderTaxSystemType taxSystem;
    bool cancelRequested{};
    std::string expiryDate{};
};
}

#endif /* TINY_CPP_CLIENT_OrderDTO_H_ */
