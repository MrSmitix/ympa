
/*
 * GetChatsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetChatsResponse_H_
#define TINY_CPP_CLIENT_GetChatsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetChatsInfoDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetChatsResponse{
public:

    /*! \brief Constructor.
	 */
    GetChatsResponse();
    GetChatsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatsResponse();


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
	GetChatsInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetChatsInfoDTO  result);


    private:
    ApiResponseStatusType status;
    GetChatsInfoDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetChatsResponse_H_ */
