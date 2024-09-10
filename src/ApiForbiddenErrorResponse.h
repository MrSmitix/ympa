/*
 * ApiForbiddenErrorResponse.h
 *
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 */

#ifndef _ApiForbiddenErrorResponse_H_
#define _ApiForbiddenErrorResponse_H_


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


/*! \brief Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 *
 *  \ingroup Models
 *
 */

class ApiForbiddenErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiForbiddenErrorResponse();
	ApiForbiddenErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiForbiddenErrorResponse();

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

#endif /* _ApiForbiddenErrorResponse_H_ */
