
/*
 * GetQualityRatingResponse.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef TINY_CPP_CLIENT_GetQualityRatingResponse_H_
#define TINY_CPP_CLIENT_GetQualityRatingResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CampaignsQualityRatingDTO.h"

namespace Tiny {


/*! \brief Информация об индексе качества магазинов.
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingResponse{
public:

    /*! \brief Constructor.
	 */
    GetQualityRatingResponse();
    GetQualityRatingResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetQualityRatingResponse();


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
	CampaignsQualityRatingDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CampaignsQualityRatingDTO  result);


    private:
    ApiResponseStatusType status;
    CampaignsQualityRatingDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetQualityRatingResponse_H_ */
