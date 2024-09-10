
/*
 * OrdersStatsPaymentDTO.h
 *
 * Информация о денежных переводах по заказу.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPaymentDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsPaymentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "OrdersStatsPaymentOrderDTO.h"
#include "OrdersStatsPaymentSourceType.h"
#include "OrdersStatsPaymentType.h"

namespace Tiny {


/*! \brief Информация о денежных переводах по заказу.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPaymentDTO();
    OrdersStatsPaymentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPaymentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор денежного перевода.
	 */
	std::string getId();

	/*! \brief Set Идентификатор денежного перевода.
	 */
	void setId(std::string  id);
	/*! \brief Get Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getDate();

	/*! \brief Set Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setDate(Date  date);
	/*! \brief Get 
	 */
	OrdersStatsPaymentType getType();

	/*! \brief Set 
	 */
	void setType(OrdersStatsPaymentType  type);
	/*! \brief Get 
	 */
	OrdersStatsPaymentSourceType getSource();

	/*! \brief Set 
	 */
	void setSource(OrdersStatsPaymentSourceType  source);
	/*! \brief Get Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
	 */
	long getTotal();

	/*! \brief Set Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
	 */
	void setTotal(long  total);
	/*! \brief Get 
	 */
	OrdersStatsPaymentOrderDTO getPaymentOrder();

	/*! \brief Set 
	 */
	void setPaymentOrder(OrdersStatsPaymentOrderDTO  paymentOrder);


    private:
    std::string id{};
    Date date;
    OrdersStatsPaymentType type;
    OrdersStatsPaymentSourceType source;
    long total{};
    OrdersStatsPaymentOrderDTO paymentOrder;
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPaymentDTO_H_ */
