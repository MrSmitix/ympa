
/*
 * FeedIndexLogsFeedDTO.h
 *
 * Информация о прайс-листе.
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsFeedDTO_H_
#define TINY_CPP_CLIENT_FeedIndexLogsFeedDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о прайс-листе.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsFeedDTO{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsFeedDTO();
    FeedIndexLogsFeedDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsFeedDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор прайс-листа.
	 */
	long getId();

	/*! \brief Set Идентификатор прайс-листа.
	 */
	void setId(long  id);


    private:
    long id{};
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsFeedDTO_H_ */
