/*
 * CampaignQualityRatingDTO.h
 *
 * Информация об индексе качества магазина.
 */

#ifndef _CampaignQualityRatingDTO_H_
#define _CampaignQualityRatingDTO_H_


#include <string>
#include "QualityRatingDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об индексе качества магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignQualityRatingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignQualityRatingDTO();
	CampaignQualityRatingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignQualityRatingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор магазина.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор магазина.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Список значений индекса качества.
	 */
	std::list<QualityRatingDTO> getRatings();

	/*! \brief Set Список значений индекса качества.
	 */
	void setRatings(std::list <QualityRatingDTO> ratings);

private:
	long long campaignId;
	std::list <QualityRatingDTO>ratings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignQualityRatingDTO_H_ */
