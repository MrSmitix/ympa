
/*
 * OrderItemDetailDTO.h
 *
 * Детали по товару в заказе.
 */

#ifndef TINY_CPP_CLIENT_OrderItemDetailDTO_H_
#define TINY_CPP_CLIENT_OrderItemDetailDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderItemStatusType.h"

namespace Tiny {


/*! \brief Детали по товару в заказе.
 *
 *  \ingroup Models
 *
 */

class OrderItemDetailDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemDetailDTO();
    OrderItemDetailDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemDetailDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество единиц товара.
	 */
	long getItemCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setItemCount(long  itemCount);
	/*! \brief Get 
	 */
	OrderItemStatusType getItemStatus();

	/*! \brief Set 
	 */
	void setItemStatus(OrderItemStatusType  itemStatus);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getUpdateDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setUpdateDate(std::string  updateDate);


    private:
    long itemCount{};
    OrderItemStatusType itemStatus;
    std::string updateDate{};
};
}

#endif /* TINY_CPP_CLIENT_OrderItemDetailDTO_H_ */
