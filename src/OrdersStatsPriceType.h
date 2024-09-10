/*
 * OrdersStatsPriceType.h
 *
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 */

#ifndef _OrdersStatsPriceType_H_
#define _OrdersStatsPriceType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPriceType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsPriceType();
	OrdersStatsPriceType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsPriceType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsPriceType_H_ */
