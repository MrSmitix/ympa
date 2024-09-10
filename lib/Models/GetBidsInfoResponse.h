
/*
 * GetBidsInfoResponse.h
 *
 * description.
 */

#ifndef TINY_CPP_CLIENT_GetBidsInfoResponse_H_
#define TINY_CPP_CLIENT_GetBidsInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetBidsInfoResponseDTO.h"

namespace Tiny {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetBidsInfoResponse();
    GetBidsInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsInfoResponse();


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
	GetBidsInfoResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBidsInfoResponseDTO  result);


    private:
    ApiResponseStatusType status;
    GetBidsInfoResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsInfoResponse_H_ */
