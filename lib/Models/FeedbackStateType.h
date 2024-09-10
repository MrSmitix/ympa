
/*
 * FeedbackStateType.h
 *
 * Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackStateType_H_
#define TINY_CPP_CLIENT_FeedbackStateType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 *
 *  \ingroup Models
 *
 */

class FeedbackStateType{
public:

    /*! \brief Constructor.
	 */
    FeedbackStateType();
    FeedbackStateType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackStateType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedbackStateType_H_ */
