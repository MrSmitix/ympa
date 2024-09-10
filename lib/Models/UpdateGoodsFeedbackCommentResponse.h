
/*
 * UpdateGoodsFeedbackCommentResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentResponse_H_
#define TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackCommentDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateGoodsFeedbackCommentResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateGoodsFeedbackCommentResponse();
    UpdateGoodsFeedbackCommentResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateGoodsFeedbackCommentResponse();


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
	GoodsFeedbackCommentDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackCommentDTO  result);


    private:
    ApiResponseStatusType status;
    GoodsFeedbackCommentDTO result;
};
}

#endif /* TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentResponse_H_ */
