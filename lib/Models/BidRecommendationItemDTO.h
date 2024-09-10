
/*
 * BidRecommendationItemDTO.h
 *
 * Рекомендованная ставка и возможная доля показов.
 */

#ifndef TINY_CPP_CLIENT_BidRecommendationItemDTO_H_
#define TINY_CPP_CLIENT_BidRecommendationItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Рекомендованная ставка и возможная доля показов.
 *
 *  \ingroup Models
 *
 */

class BidRecommendationItemDTO{
public:

    /*! \brief Constructor.
	 */
    BidRecommendationItemDTO();
    BidRecommendationItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidRecommendationItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение ставки.
	 */
	int getBid();

	/*! \brief Set Значение ставки.
	 */
	void setBid(int  bid);
	/*! \brief Get Доля показов. 
	 */
	long getShowPercent();

	/*! \brief Set Доля показов. 
	 */
	void setShowPercent(long  showPercent);


    private:
    int bid{};
    long showPercent{};
};
}

#endif /* TINY_CPP_CLIENT_BidRecommendationItemDTO_H_ */
