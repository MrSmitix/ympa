/*
 * ApiResponseStatusType.h
 *
 * Тип ответа.
 */

#ifndef _ApiResponseStatusType_H_
#define _ApiResponseStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип ответа.
 *
 *  \ingroup Models
 *
 */

class ApiResponseStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiResponseStatusType();
	ApiResponseStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiResponseStatusType();

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

#endif /* _ApiResponseStatusType_H_ */
