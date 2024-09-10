
/*
 * FeedIndexLogsOffersDTO.h
 *
 * Информация о предложениях прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsOffersDTO_H_
#define TINY_CPP_CLIENT_FeedIndexLogsOffersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о предложениях прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsOffersDTO{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsOffersDTO();
    FeedIndexLogsOffersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsOffersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	 */
	long getRejectedCount();

	/*! \brief Set Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	 */
	void setRejectedCount(long  rejectedCount);
	/*! \brief Get Количество предложений в прайс-листе.
	 */
	long getTotalCount();

	/*! \brief Set Количество предложений в прайс-листе.
	 */
	void setTotalCount(long  totalCount);


    private:
    long rejectedCount{};
    long totalCount{};
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsOffersDTO_H_ */
