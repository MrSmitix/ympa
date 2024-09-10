/*
 * CampaignsQualityRatingDTO.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef _CampaignsQualityRatingDTO_H_
#define _CampaignsQualityRatingDTO_H_


#include <string>
#include "CampaignQualityRatingDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об индексе качества магазинов.
 *
 *  \ingroup Models
 *
 */

class CampaignsQualityRatingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignsQualityRatingDTO();
	CampaignsQualityRatingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignsQualityRatingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список магазинов c информацией об их индексе качества.
	 */
	std::list<CampaignQualityRatingDTO> getCampaignRatings();

	/*! \brief Set Список магазинов c информацией об их индексе качества.
	 */
	void setCampaignRatings(std::list <CampaignQualityRatingDTO> campaignRatings);

private:
	std::list <CampaignQualityRatingDTO>campaignRatings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignsQualityRatingDTO_H_ */
