/*
 * SellingProgramType.h
 *
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 */

#ifndef _SellingProgramType_H_
#define _SellingProgramType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
 *
 *  \ingroup Models
 *
 */

class SellingProgramType : public Object {
public:
	/*! \brief Constructor.
	 */
	SellingProgramType();
	SellingProgramType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SellingProgramType();

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

#endif /* _SellingProgramType_H_ */
