
/*
 * GetGoodsFeedbackCommentsRequest.h
 *
 * Фильтр запроса комментариев отзыва. 
 */

#ifndef TINY_CPP_CLIENT_GetGoodsFeedbackCommentsRequest_H_
#define TINY_CPP_CLIENT_GetGoodsFeedbackCommentsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Фильтр запроса комментариев отзыва. 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackCommentsRequest{
public:

    /*! \brief Constructor.
	 */
    GetGoodsFeedbackCommentsRequest();
    GetGoodsFeedbackCommentsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsFeedbackCommentsRequest();


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


    private:
    long feedbackId{};
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsFeedbackCommentsRequest_H_ */
