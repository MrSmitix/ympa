/*
 * AgeUnitType.h
 *
 * Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
 */

#ifndef _AgeUnitType_H_
#define _AgeUnitType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 *
 *  \ingroup Models
 *
 */

class AgeUnitType : public Object {
public:
	/*! \brief Constructor.
	 */
	AgeUnitType();
	AgeUnitType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AgeUnitType();

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

#endif /* _AgeUnitType_H_ */
