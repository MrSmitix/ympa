/*
 * ChatType.h
 *
 * Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор. 
 */

#ifndef _ChatType_H_
#define _ChatType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
 *
 *  \ingroup Models
 *
 */

class ChatType : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatType();
	ChatType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatType();

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

#endif /* _ChatType_H_ */
