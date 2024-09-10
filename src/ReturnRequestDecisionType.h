/*
 * ReturnRequestDecisionType.h
 *
 * Решение по возврату.
 */

#ifndef _ReturnRequestDecisionType_H_
#define _ReturnRequestDecisionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Решение по возврату.
 *
 *  \ingroup Models
 *
 */

class ReturnRequestDecisionType : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnRequestDecisionType();
	ReturnRequestDecisionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnRequestDecisionType();

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

#endif /* _ReturnRequestDecisionType_H_ */
