
/*
 * DeleteGoodsFeedbackCommentRequest.h
 *
 * Фильтр запроса отзывов по бизнесу. 
 */

#ifndef TINY_CPP_CLIENT_DeleteGoodsFeedbackCommentRequest_H_
#define TINY_CPP_CLIENT_DeleteGoodsFeedbackCommentRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Фильтр запроса отзывов по бизнесу. 
 *
 *  \ingroup Models
 *
 */

class DeleteGoodsFeedbackCommentRequest{
public:

    /*! \brief Constructor.
	 */
    DeleteGoodsFeedbackCommentRequest();
    DeleteGoodsFeedbackCommentRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteGoodsFeedbackCommentRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long getId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setId(long  id);


    private:
    long id{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteGoodsFeedbackCommentRequest_H_ */
