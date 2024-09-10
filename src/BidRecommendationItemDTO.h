/*
 * BidRecommendationItemDTO.h
 *
 * Рекомендованная ставка и возможная доля показов.
 */

#ifndef _BidRecommendationItemDTO_H_
#define _BidRecommendationItemDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Рекомендованная ставка и возможная доля показов.
 *
 *  \ingroup Models
 *
 */

class BidRecommendationItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	BidRecommendationItemDTO();
	BidRecommendationItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidRecommendationItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Значение ставки.
	 */
	int getBid();

	/*! \brief Set Значение ставки.
	 */
	void setBid(int  bid);
	/*! \brief Get Доля показов. 
	 */
	long long getShowPercent();

	/*! \brief Set Доля показов. 
	 */
	void setShowPercent(long long  showPercent);

private:
	int bid;
	long long showPercent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidRecommendationItemDTO_H_ */
