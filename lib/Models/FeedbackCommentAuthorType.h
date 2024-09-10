
/*
 * FeedbackCommentAuthorType.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackCommentAuthorType_H_
#define TINY_CPP_CLIENT_FeedbackCommentAuthorType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentAuthorType{
public:

    /*! \brief Constructor.
	 */
    FeedbackCommentAuthorType();
    FeedbackCommentAuthorType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackCommentAuthorType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedbackCommentAuthorType_H_ */
