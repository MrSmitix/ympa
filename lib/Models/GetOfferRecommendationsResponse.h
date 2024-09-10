
/*
 * GetOfferRecommendationsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOfferRecommendationsResponse_H_
#define TINY_CPP_CLIENT_GetOfferRecommendationsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferRecommendationsResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferRecommendationsResponse{
public:

    /*! \brief Constructor.
	 */
    GetOfferRecommendationsResponse();
    GetOfferRecommendationsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferRecommendationsResponse();


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
	OfferRecommendationsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferRecommendationsResultDTO  result);


    private:
    ApiResponseStatusType status;
    OfferRecommendationsResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferRecommendationsResponse_H_ */
