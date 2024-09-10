/*
 * OfferSellingProgramStatusType.h
 *
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 */

#ifndef _OfferSellingProgramStatusType_H_
#define _OfferSellingProgramStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 *
 *  \ingroup Models
 *
 */

class OfferSellingProgramStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferSellingProgramStatusType();
	OfferSellingProgramStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferSellingProgramStatusType();

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

#endif /* _OfferSellingProgramStatusType_H_ */
