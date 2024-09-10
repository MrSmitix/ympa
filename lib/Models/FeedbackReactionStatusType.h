
/*
 * FeedbackReactionStatusType.h
 *
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackReactionStatusType_H_
#define TINY_CPP_CLIENT_FeedbackReactionStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
 *
 *  \ingroup Models
 *
 */

class FeedbackReactionStatusType{
public:

    /*! \brief Constructor.
	 */
    FeedbackReactionStatusType();
    FeedbackReactionStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackReactionStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedbackReactionStatusType_H_ */
