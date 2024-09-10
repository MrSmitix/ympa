
/*
 * GetFeedResponse.h
 *
 * Ответ на запрос информации о прайс-листе.
 */

#ifndef TINY_CPP_CLIENT_GetFeedResponse_H_
#define TINY_CPP_CLIENT_GetFeedResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос информации о прайс-листе.
 *
 *  \ingroup Models
 *
 */

class GetFeedResponse{
public:

    /*! \brief Constructor.
	 */
    GetFeedResponse();
    GetFeedResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetFeedResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FeedDTO getFeed();

	/*! \brief Set 
	 */
	void setFeed(FeedDTO  feed);


    private:
    FeedDTO feed;
};
}

#endif /* TINY_CPP_CLIENT_GetFeedResponse_H_ */
