
/*
 * GetGoodsFeedbackCommentsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetGoodsFeedbackCommentsResponse_H_
#define TINY_CPP_CLIENT_GetGoodsFeedbackCommentsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackCommentListDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackCommentsResponse{
public:

    /*! \brief Constructor.
	 */
    GetGoodsFeedbackCommentsResponse();
    GetGoodsFeedbackCommentsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsFeedbackCommentsResponse();


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
	GoodsFeedbackCommentListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackCommentListDTO  result);


    private:
    ApiResponseStatusType status;
    GoodsFeedbackCommentListDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsFeedbackCommentsResponse_H_ */
