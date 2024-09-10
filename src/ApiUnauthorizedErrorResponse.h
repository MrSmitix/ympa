/*
 * ApiUnauthorizedErrorResponse.h
 *
 * В запросе не указаны авторизационные данные.
 */

#ifndef _ApiUnauthorizedErrorResponse_H_
#define _ApiUnauthorizedErrorResponse_H_


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


/*! \brief В запросе не указаны авторизационные данные.
 *
 *  \ingroup Models
 *
 */

class ApiUnauthorizedErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiUnauthorizedErrorResponse();
	ApiUnauthorizedErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiUnauthorizedErrorResponse();

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

#endif /* _ApiUnauthorizedErrorResponse_H_ */
