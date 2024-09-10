/*
 * ShowsSalesGroupingType.h
 *
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 */

#ifndef _ShowsSalesGroupingType_H_
#define _ShowsSalesGroupingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 *
 *  \ingroup Models
 *
 */

class ShowsSalesGroupingType : public Object {
public:
	/*! \brief Constructor.
	 */
	ShowsSalesGroupingType();
	ShowsSalesGroupingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ShowsSalesGroupingType();

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

#endif /* _ShowsSalesGroupingType_H_ */
