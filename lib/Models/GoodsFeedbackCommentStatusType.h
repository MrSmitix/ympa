
/*
 * GoodsFeedbackCommentStatusType.h
 *
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackCommentStatusType_H_
#define TINY_CPP_CLIENT_GoodsFeedbackCommentStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentStatusType{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackCommentStatusType();
    GoodsFeedbackCommentStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackCommentStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackCommentStatusType_H_ */
