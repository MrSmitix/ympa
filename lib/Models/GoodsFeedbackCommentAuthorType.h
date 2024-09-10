
/*
 * GoodsFeedbackCommentAuthorType.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorType_H_
#define TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentAuthorType{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackCommentAuthorType();
    GoodsFeedbackCommentAuthorType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackCommentAuthorType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorType_H_ */
