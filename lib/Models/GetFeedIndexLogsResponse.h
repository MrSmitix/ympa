
/*
 * GetFeedIndexLogsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetFeedIndexLogsResponse_H_
#define TINY_CPP_CLIENT_GetFeedIndexLogsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "FeedIndexLogsResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetFeedIndexLogsResponse{
public:

    /*! \brief Constructor.
	 */
    GetFeedIndexLogsResponse();
    GetFeedIndexLogsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetFeedIndexLogsResponse();


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
	FeedIndexLogsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FeedIndexLogsResultDTO  result);


    private:
    ApiResponseStatusType status;
    FeedIndexLogsResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetFeedIndexLogsResponse_H_ */
