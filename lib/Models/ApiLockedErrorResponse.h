
/*
 * ApiLockedErrorResponse.h
 *
 * Ресурс из запроса заблокирован от применения к нему указанного метода.
 */

#ifndef TINY_CPP_CLIENT_ApiLockedErrorResponse_H_
#define TINY_CPP_CLIENT_ApiLockedErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiErrorDTO.h"
#include "ApiResponseStatusType.h"
#include <list>

namespace Tiny {


/*! \brief Ресурс из запроса заблокирован от применения к нему указанного метода.
 *
 *  \ingroup Models
 *
 */

class ApiLockedErrorResponse{
public:

    /*! \brief Constructor.
	 */
    ApiLockedErrorResponse();
    ApiLockedErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiLockedErrorResponse();


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

#endif /* TINY_CPP_CLIENT_ApiLockedErrorResponse_H_ */
