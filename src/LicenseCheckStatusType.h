/*
 * LicenseCheckStatusType.h
 *
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */

#ifndef _LicenseCheckStatusType_H_
#define _LicenseCheckStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 *
 *  \ingroup Models
 *
 */

class LicenseCheckStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	LicenseCheckStatusType();
	LicenseCheckStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LicenseCheckStatusType();

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

#endif /* _LicenseCheckStatusType_H_ */
