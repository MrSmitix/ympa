/*
 * OrderItemSubsidyType.h
 *
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
 */

#ifndef _OrderItemSubsidyType_H_
#define _OrderItemSubsidyType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
 *
 *  \ingroup Models
 *
 */

class OrderItemSubsidyType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemSubsidyType();
	OrderItemSubsidyType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemSubsidyType();

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

#endif /* _OrderItemSubsidyType_H_ */
