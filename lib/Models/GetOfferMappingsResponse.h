
/*
 * GetOfferMappingsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOfferMappingsResponse_H_
#define TINY_CPP_CLIENT_GetOfferMappingsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetOfferMappingsResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingsResponse{
public:

    /*! \brief Constructor.
	 */
    GetOfferMappingsResponse();
    GetOfferMappingsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferMappingsResponse();


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
	GetOfferMappingsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetOfferMappingsResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetOfferMappingsResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferMappingsResponse_H_ */
