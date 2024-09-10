
/*
 * GetPromosResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetPromosResponse_H_
#define TINY_CPP_CLIENT_GetPromosResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetPromosResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetPromosResponse{
public:

    /*! \brief Constructor.
	 */
    GetPromosResponse();
    GetPromosResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromosResponse();


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
	GetPromosResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetPromosResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetPromosResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetPromosResponse_H_ */
