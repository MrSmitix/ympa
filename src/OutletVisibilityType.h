/*
 * OutletVisibilityType.h
 *
 * Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
 */

#ifndef _OutletVisibilityType_H_
#define _OutletVisibilityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
 *
 *  \ingroup Models
 *
 */

class OutletVisibilityType : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletVisibilityType();
	OutletVisibilityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletVisibilityType();

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

#endif /* _OutletVisibilityType_H_ */
