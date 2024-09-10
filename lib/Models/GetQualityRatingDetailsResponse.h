
/*
 * GetQualityRatingDetailsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetQualityRatingDetailsResponse_H_
#define TINY_CPP_CLIENT_GetQualityRatingDetailsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "QualityRatingDetailsDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingDetailsResponse{
public:

    /*! \brief Constructor.
	 */
    GetQualityRatingDetailsResponse();
    GetQualityRatingDetailsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetQualityRatingDetailsResponse();


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
	QualityRatingDetailsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(QualityRatingDetailsDTO  result);


    private:
    ApiResponseStatusType status;
    QualityRatingDetailsDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetQualityRatingDetailsResponse_H_ */
