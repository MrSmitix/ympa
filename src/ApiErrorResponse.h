/*
 * ApiErrorResponse.h
 *
 * Стандартная обертка для ошибок сервера.
 */

#ifndef _ApiErrorResponse_H_
#define _ApiErrorResponse_H_


#include <string>
#include "ApiErrorDTO.h"
#include "ApiResponseStatusType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Стандартная обертка для ошибок сервера.
 *
 *  \ingroup Models
 *
 */

class ApiErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiErrorResponse();
	ApiErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiErrorResponse();

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
	/*! \brief Get Список ошибок.
	 */
	std::list<ApiErrorDTO> getErrors();

	/*! \brief Set Список ошибок.
	 */
	void setErrors(std::list <ApiErrorDTO> errors);

private:
	ApiResponseStatusType status;
	std::list <ApiErrorDTO>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiErrorResponse_H_ */
