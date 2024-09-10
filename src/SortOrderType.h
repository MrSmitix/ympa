/*
 * SortOrderType.h
 *
 * Направление сортировки.  Возможные значения: - &#x60;ASC&#x60; — сортировка по возрастанию. - &#x60;DESC&#x60; — сортировка по убыванию. 
 */

#ifndef _SortOrderType_H_
#define _SortOrderType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
 *
 *  \ingroup Models
 *
 */

class SortOrderType : public Object {
public:
	/*! \brief Constructor.
	 */
	SortOrderType();
	SortOrderType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SortOrderType();

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

#endif /* _SortOrderType_H_ */
