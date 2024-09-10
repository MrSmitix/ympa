
/*
 * GetFeedbackListResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetFeedbackListResponse_H_
#define TINY_CPP_CLIENT_GetFeedbackListResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "FeedbackListDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetFeedbackListResponse{
public:

    /*! \brief Constructor.
	 */
    GetFeedbackListResponse();
    GetFeedbackListResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetFeedbackListResponse();


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
	FeedbackListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FeedbackListDTO  result);


    private:
    ApiResponseStatusType status;
    FeedbackListDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetFeedbackListResponse_H_ */
