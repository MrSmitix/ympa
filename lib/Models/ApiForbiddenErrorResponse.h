
/*
 * ApiForbiddenErrorResponse.h
 *
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 */

#ifndef TINY_CPP_CLIENT_ApiForbiddenErrorResponse_H_
#define TINY_CPP_CLIENT_ApiForbiddenErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiErrorDTO.h"
#include "ApiResponseStatusType.h"
#include <list>

namespace Tiny {


/*! \brief Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 *
 *  \ingroup Models
 *
 */

class ApiForbiddenErrorResponse{
public:

    /*! \brief Constructor.
	 */
    ApiForbiddenErrorResponse();
    ApiForbiddenErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiForbiddenErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<ApiErrorDTO> errors;
};
}

#endif /* TINY_CPP_CLIENT_ApiForbiddenErrorResponse_H_ */
