
/*
 * GetSuggestedOfferMappingsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetSuggestedOfferMappingsResponse_H_
#define TINY_CPP_CLIENT_GetSuggestedOfferMappingsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetSuggestedOfferMappingsResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingsResponse{
public:

    /*! \brief Constructor.
	 */
    GetSuggestedOfferMappingsResponse();
    GetSuggestedOfferMappingsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetSuggestedOfferMappingsResponse();


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
	GetSuggestedOfferMappingsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetSuggestedOfferMappingsResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetSuggestedOfferMappingsResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetSuggestedOfferMappingsResponse_H_ */
