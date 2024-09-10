/*
 * LanguageType.h
 *
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 */

#ifndef _LanguageType_H_
#define _LanguageType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Язык:  * `RU` — русский.  * `EN` — английский. 
 *
 *  \ingroup Models
 *
 */

class LanguageType : public Object {
public:
	/*! \brief Constructor.
	 */
	LanguageType();
	LanguageType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LanguageType();

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

#endif /* _LanguageType_H_ */
