/*
 * EmptyApiResponse.h
 *
 * Пустой ответ сервера.
 */

#ifndef _EmptyApiResponse_H_
#define _EmptyApiResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Пустой ответ сервера.
 *
 *  \ingroup Models
 *
 */

class EmptyApiResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	EmptyApiResponse();
	EmptyApiResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EmptyApiResponse();

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

#endif /* _EmptyApiResponse_H_ */
