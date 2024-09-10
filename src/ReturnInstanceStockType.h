/*
 * ReturnInstanceStockType.h
 *
 * Тип остатка на складе.
 */

#ifndef _ReturnInstanceStockType_H_
#define _ReturnInstanceStockType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип остатка на складе.
 *
 *  \ingroup Models
 *
 */

class ReturnInstanceStockType : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnInstanceStockType();
	ReturnInstanceStockType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnInstanceStockType();

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

#endif /* _ReturnInstanceStockType_H_ */
