/*
 * ApiResponse.h
 *
 * Стандартная обертка для ответов сервера.
 */

#ifndef _ApiResponse_H_
#define _ApiResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Стандартная обертка для ответов сервера.
 *
 *  \ingroup Models
 *
 */

class ApiResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiResponse();
	ApiResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);

private:
	ApiResponseStatusType status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiResponse_H_ */
