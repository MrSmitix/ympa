
/*
 * EmptyApiResponse.h
 *
 * Пустой ответ сервера.
 */

#ifndef TINY_CPP_CLIENT_EmptyApiResponse_H_
#define TINY_CPP_CLIENT_EmptyApiResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"

namespace Tiny {


/*! \brief Пустой ответ сервера.
 *
 *  \ingroup Models
 *
 */

class EmptyApiResponse{
public:

    /*! \brief Constructor.
	 */
    EmptyApiResponse();
    EmptyApiResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmptyApiResponse();


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

#endif /* TINY_CPP_CLIENT_EmptyApiResponse_H_ */
