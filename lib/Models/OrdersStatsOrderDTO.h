
/*
 * OrdersStatsOrderDTO.h
 *
 * Информация о заказе.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsOrderDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsOrderDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "OrderStatsStatusType.h"
#include "OrdersStatsCommissionDTO.h"
#include "OrdersStatsDeliveryRegionDTO.h"
#include "OrdersStatsItemDTO.h"
#include "OrdersStatsOrderPaymentType.h"
#include "OrdersStatsPaymentDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о заказе.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsOrderDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsOrderDTO();
    OrdersStatsOrderDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsOrderDTO();


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
	/*! \brief Get Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getCreationDate();

	/*! \brief Set Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setCreationDate(Date  creationDate);
	/*! \brief Get Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
	 */
	std::string getStatusUpdateDate();

	/*! \brief Set Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
	 */
	void setStatusUpdateDate(std::string  statusUpdateDate);
	/*! \brief Get 
	 */
	OrderStatsStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderStatsStatusType  status);
	/*! \brief Get Идентификатор заказа в информационной системе магазина.
	 */
	std::string getPartnerOrderId();

	/*! \brief Set Идентификатор заказа в информационной системе магазина.
	 */
	void setPartnerOrderId(std::string  partnerOrderId);
	/*! \brief Get 
	 */
	OrdersStatsOrderPaymentType getPaymentType();

	/*! \brief Set 
	 */
	void setPaymentType(OrdersStatsOrderPaymentType  paymentType);
	/*! \brief Get Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	 */
	bool isFake();

	/*! \brief Set Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	 */
	void setFake(bool  fake);
	/*! \brief Get 
	 */
	OrdersStatsDeliveryRegionDTO getDeliveryRegion();

	/*! \brief Set 
	 */
	void setDeliveryRegion(OrdersStatsDeliveryRegionDTO  deliveryRegion);
	/*! \brief Get Список товаров в заказе после возможных изменений.
	 */
	std::list<OrdersStatsItemDTO> getItems();

	/*! \brief Set Список товаров в заказе после возможных изменений.
	 */
	void setItems(std::list <OrdersStatsItemDTO> items);
	/*! \brief Get Список товаров в заказе до изменений.
	 */
	std::list<OrdersStatsItemDTO> getInitialItems();

	/*! \brief Set Список товаров в заказе до изменений.
	 */
	void setInitialItems(std::list <OrdersStatsItemDTO> initialItems);
	/*! \brief Get Информация о денежных переводах по заказу.
	 */
	std::list<OrdersStatsPaymentDTO> getPayments();

	/*! \brief Set Информация о денежных переводах по заказу.
	 */
	void setPayments(std::list <OrdersStatsPaymentDTO> payments);
	/*! \brief Get Информация о комиссиях за заказ.
	 */
	std::list<OrdersStatsCommissionDTO> getCommissions();

	/*! \brief Set Информация о комиссиях за заказ.
	 */
	void setCommissions(std::list <OrdersStatsCommissionDTO> commissions);


    private:
    long id{};
    Date creationDate;
    std::string statusUpdateDate{};
    OrderStatsStatusType status;
    std::string partnerOrderId{};
    OrdersStatsOrderPaymentType paymentType;
    bool fake{};
    OrdersStatsDeliveryRegionDTO deliveryRegion;
    std::list<OrdersStatsItemDTO> items;
    std::list<OrdersStatsItemDTO> initialItems;
    std::list<OrdersStatsPaymentDTO> payments;
    std::list<OrdersStatsCommissionDTO> commissions;
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsOrderDTO_H_ */
