
/*
 * ApiResponse.h
 *
 * Стандартная обертка для ответов сервера.
 */

#ifndef TINY_CPP_CLIENT_ApiResponse_H_
#define TINY_CPP_CLIENT_ApiResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"

namespace Tiny {


/*! \brief Стандартная обертка для ответов сервера.
 *
 *  \ingroup Models
 *
 */

class ApiResponse{
public:

    /*! \brief Constructor.
	 */
    ApiResponse();
    ApiResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiResponse();


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


    private:
    ApiResponseStatusType status;
};
}

#endif /* TINY_CPP_CLIENT_ApiResponse_H_ */
