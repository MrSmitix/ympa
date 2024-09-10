
/*
 * ApiUnauthorizedErrorResponse.h
 *
 * В запросе не указаны авторизационные данные.
 */

#ifndef TINY_CPP_CLIENT_ApiUnauthorizedErrorResponse_H_
#define TINY_CPP_CLIENT_ApiUnauthorizedErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiErrorDTO.h"
#include "ApiResponseStatusType.h"
#include <list>

namespace Tiny {


/*! \brief В запросе не указаны авторизационные данные.
 *
 *  \ingroup Models
 *
 */

class ApiUnauthorizedErrorResponse{
public:

    /*! \brief Constructor.
	 */
    ApiUnauthorizedErrorResponse();
    ApiUnauthorizedErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiUnauthorizedErrorResponse();


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

#endif /* TINY_CPP_CLIENT_ApiUnauthorizedErrorResponse_H_ */
