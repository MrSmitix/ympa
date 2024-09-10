
/*
 * UpdateGoodsFeedbackCommentRequest.h
 *
 * Комментарий к отзыву.
 */

#ifndef TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentRequest_H_
#define TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateGoodsFeedbackCommentDTO.h"

namespace Tiny {


/*! \brief Комментарий к отзыву.
 *
 *  \ingroup Models
 *
 */

class UpdateGoodsFeedbackCommentRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateGoodsFeedbackCommentRequest();
    UpdateGoodsFeedbackCommentRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateGoodsFeedbackCommentRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор отзыва. 
	 */
	long getFeedbackId();

	/*! \brief Set Идентификатор отзыва. 
	 */
	void setFeedbackId(long  feedbackId);
	/*! \brief Get 
	 */
	UpdateGoodsFeedbackCommentDTO getComment();

	/*! \brief Set 
	 */
	void setComment(UpdateGoodsFeedbackCommentDTO  comment);


    private:
    long feedbackId{};
    UpdateGoodsFeedbackCommentDTO comment;
};
}

#endif /* TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentRequest_H_ */
