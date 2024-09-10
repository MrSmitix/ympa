
/*
 * GetBidsRecommendationsResponse.h
 *
 * description.
 */

#ifndef TINY_CPP_CLIENT_GetBidsRecommendationsResponse_H_
#define TINY_CPP_CLIENT_GetBidsRecommendationsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetBidsRecommendationsResponseDTO.h"

namespace Tiny {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsRecommendationsResponse{
public:

    /*! \brief Constructor.
	 */
    GetBidsRecommendationsResponse();
    GetBidsRecommendationsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsRecommendationsResponse();


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
	GetBidsRecommendationsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBidsRecommendationsResponseDTO  result);


    private:
    ApiResponseStatusType status;
    GetBidsRecommendationsResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsRecommendationsResponse_H_ */
