/*
 * OrdersStatsDetailsDTO.h
 *
 * Информация об удалении товара из заказа.
 */

#ifndef _OrdersStatsDetailsDTO_H_
#define _OrdersStatsDetailsDTO_H_


#include <string>
#include "Date.h"
#include "OrdersStatsItemStatusType.h"
#include "OrdersStatsStockType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об удалении товара из заказа.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDetailsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsDetailsDTO();
	OrdersStatsDetailsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsDetailsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrdersStatsItemStatusType getItemStatus();

	/*! \brief Set 
	 */
	void setItemStatus(OrdersStatsItemStatusType  itemStatus);
	/*! \brief Get Количество товара со статусом, указанном в параметре `itemStatus`.
	 */
	long long getItemCount();

	/*! \brief Set Количество товара со статусом, указанном в параметре `itemStatus`.
	 */
	void setItemCount(long long  itemCount);
	/*! \brief Get Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getUpdateDate();

	/*! \brief Set Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setUpdateDate(Date  updateDate);
	/*! \brief Get 
	 */
	OrdersStatsStockType getStockType();

	/*! \brief Set 
	 */
	void setStockType(OrdersStatsStockType  stockType);

private:
	OrdersStatsItemStatusType itemStatus;
	long long itemCount;
	Date updateDate;
	OrdersStatsStockType stockType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsDetailsDTO_H_ */
