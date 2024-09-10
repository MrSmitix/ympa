/*
 * OrdersStatsPaymentDTO.h
 *
 * Информация о денежных переводах по заказу.
 */

#ifndef _OrdersStatsPaymentDTO_H_
#define _OrdersStatsPaymentDTO_H_


#include <string>
#include "Date.h"
#include "OrdersStatsPaymentOrderDTO.h"
#include "OrdersStatsPaymentSourceType.h"
#include "OrdersStatsPaymentType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о денежных переводах по заказу.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsPaymentDTO();
	OrdersStatsPaymentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsPaymentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getTotal();

	/*! \brief Set Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
	 */
	void setTotal(long long  total);
	/*! \brief Get 
	 */
	OrdersStatsPaymentOrderDTO getPaymentOrder();

	/*! \brief Set 
	 */
	void setPaymentOrder(OrdersStatsPaymentOrderDTO  paymentOrder);

private:
	std::string id;
	Date date;
	OrdersStatsPaymentType type;
	OrdersStatsPaymentSourceType source;
	long long total;
	OrdersStatsPaymentOrderDTO paymentOrder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsPaymentDTO_H_ */
