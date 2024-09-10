/*
 * PriceCompetitivenessType.h
 *
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 */

#ifndef _PriceCompetitivenessType_H_
#define _PriceCompetitivenessType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 *
 *  \ingroup Models
 *
 */

class PriceCompetitivenessType : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceCompetitivenessType();
	PriceCompetitivenessType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceCompetitivenessType();

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

#endif /* _PriceCompetitivenessType_H_ */
