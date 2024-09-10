/*
 * OrdersStatsPriceDTO.h
 *
 * Цена или скидки на товар.
 */

#ifndef _OrdersStatsPriceDTO_H_
#define _OrdersStatsPriceDTO_H_


#include <string>
#include "OrdersStatsPriceType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена или скидки на товар.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPriceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsPriceDTO();
	OrdersStatsPriceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsPriceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrdersStatsPriceType getType();

	/*! \brief Set 
	 */
	void setType(OrdersStatsPriceType  type);
	/*! \brief Get Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	long long getCostPerItem();

	/*! \brief Set Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	void setCostPerItem(long long  costPerItem);
	/*! \brief Get Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	long long getTotal();

	/*! \brief Set Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	void setTotal(long long  total);

private:
	OrdersStatsPriceType type;
	long long costPerItem;
	long long total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsPriceDTO_H_ */
