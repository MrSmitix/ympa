/*
 * OrdersStatsCommissionDTO.h
 *
 * Информация о стоимости услуг.
 */

#ifndef _OrdersStatsCommissionDTO_H_
#define _OrdersStatsCommissionDTO_H_


#include <string>
#include "OrdersStatsCommissionType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsCommissionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsCommissionDTO();
	OrdersStatsCommissionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsCommissionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrdersStatsCommissionType getType();

	/*! \brief Set 
	 */
	void setType(OrdersStatsCommissionType  type);
	/*! \brief Get Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	 */
	long long getActual();

	/*! \brief Set Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	 */
	void setActual(long long  actual);

private:
	OrdersStatsCommissionType type;
	long long actual;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsCommissionDTO_H_ */
