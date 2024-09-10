/*
 * OrderItemDetailDTO.h
 *
 * Детали по товару в заказе.
 */

#ifndef _OrderItemDetailDTO_H_
#define _OrderItemDetailDTO_H_


#include <string>
#include "OrderItemStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Детали по товару в заказе.
 *
 *  \ingroup Models
 *
 */

class OrderItemDetailDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemDetailDTO();
	OrderItemDetailDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemDetailDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество единиц товара.
	 */
	long long getItemCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setItemCount(long long  itemCount);
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
	long long itemCount;
	OrderItemStatusType itemStatus;
	std::string updateDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemDetailDTO_H_ */
