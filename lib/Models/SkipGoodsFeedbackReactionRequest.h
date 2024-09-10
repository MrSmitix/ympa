
/*
 * SkipGoodsFeedbackReactionRequest.h
 *
 * Идентификаторы отзывов.
 */

#ifndef TINY_CPP_CLIENT_SkipGoodsFeedbackReactionRequest_H_
#define TINY_CPP_CLIENT_SkipGoodsFeedbackReactionRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Идентификаторы отзывов.
 *
 *  \ingroup Models
 *
 */

class SkipGoodsFeedbackReactionRequest{
public:

    /*! \brief Constructor.
	 */
    SkipGoodsFeedbackReactionRequest();
    SkipGoodsFeedbackReactionRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SkipGoodsFeedbackReactionRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список идентификаторов отзывов, на которые магазин не будет отвечать.
	 */
	Set<long> getFeedbackIds();

	/*! \brief Set Список идентификаторов отзывов, на которые магазин не будет отвечать.
	 */
	void setFeedbackIds(Set <long> feedbackIds);


    private:
    Set<long> feedbackIds;
};
}

#endif /* TINY_CPP_CLIENT_SkipGoodsFeedbackReactionRequest_H_ */
