
/*
 * GetReturnResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetReturnResponse_H_
#define TINY_CPP_CLIENT_GetReturnResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "ReturnDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetReturnResponse{
public:

    /*! \brief Constructor.
	 */
    GetReturnResponse();
    GetReturnResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetReturnResponse();


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
	/*! \brief Get 
	 */
	ReturnDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ReturnDTO  result);


    private:
    ApiResponseStatusType status;
    ReturnDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetReturnResponse_H_ */
