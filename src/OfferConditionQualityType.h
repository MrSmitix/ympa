/*
 * OfferConditionQualityType.h
 *
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 */

#ifndef _OfferConditionQualityType_H_
#define _OfferConditionQualityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 *
 *  \ingroup Models
 *
 */

class OfferConditionQualityType : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferConditionQualityType();
	OfferConditionQualityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferConditionQualityType();

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

#endif /* _OfferConditionQualityType_H_ */
