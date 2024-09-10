
/*
 * OrdersStatsDetailsDTO.h
 *
 * Информация об удалении товара из заказа.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsDetailsDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsDetailsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "OrdersStatsItemStatusType.h"
#include "OrdersStatsStockType.h"

namespace Tiny {


/*! \brief Информация об удалении товара из заказа.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDetailsDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsDetailsDTO();
    OrdersStatsDetailsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsDetailsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrdersStatsItemStatusType getItemStatus();

	/*! \brief Set 
	 */
	void setItemStatus(OrdersStatsItemStatusType  itemStatus);
	/*! \brief Get Количество товара со статусом, указанном в параметре `itemStatus`.
	 */
	long getItemCount();

	/*! \brief Set Количество товара со статусом, указанном в параметре `itemStatus`.
	 */
	void setItemCount(long  itemCount);
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
    long itemCount{};
    Date updateDate;
    OrdersStatsStockType stockType;
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsDetailsDTO_H_ */
