/*
 * LicenseType.h
 *
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 */

#ifndef _LicenseType_H_
#define _LicenseType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
 *
 *  \ingroup Models
 *
 */

class LicenseType : public Object {
public:
	/*! \brief Constructor.
	 */
	LicenseType();
	LicenseType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LicenseType();

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

#endif /* _LicenseType_H_ */
