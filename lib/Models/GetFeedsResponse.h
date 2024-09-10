
/*
 * GetFeedsResponse.h
 *
 * Ответ на запрос списка прайс-листов.
 */

#ifndef TINY_CPP_CLIENT_GetFeedsResponse_H_
#define TINY_CPP_CLIENT_GetFeedsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ответ на запрос списка прайс-листов.
 *
 *  \ingroup Models
 *
 */

class GetFeedsResponse{
public:

    /*! \brief Constructor.
	 */
    GetFeedsResponse();
    GetFeedsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetFeedsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список прайс-листов.
	 */
	std::list<FeedDTO> getFeeds();

	/*! \brief Set Список прайс-листов.
	 */
	void setFeeds(std::list <FeedDTO> feeds);


    private:
    std::list<FeedDTO> feeds;
};
}

#endif /* TINY_CPP_CLIENT_GetFeedsResponse_H_ */
