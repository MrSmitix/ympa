/*
 * OrderBuyerType.h
 *
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */

#ifndef _OrderBuyerType_H_
#define _OrderBuyerType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 *
 *  \ingroup Models
 *
 */

class OrderBuyerType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBuyerType();
	OrderBuyerType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBuyerType();

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

#endif /* _OrderBuyerType_H_ */
