
/*
 * CampaignsQualityRatingDTO.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef TINY_CPP_CLIENT_CampaignsQualityRatingDTO_H_
#define TINY_CPP_CLIENT_CampaignsQualityRatingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignQualityRatingDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об индексе качества магазинов.
 *
 *  \ingroup Models
 *
 */

class CampaignsQualityRatingDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignsQualityRatingDTO();
    CampaignsQualityRatingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignsQualityRatingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список магазинов c информацией об их индексе качества.
	 */
	std::list<CampaignQualityRatingDTO> getCampaignRatings();

	/*! \brief Set Список магазинов c информацией об их индексе качества.
	 */
	void setCampaignRatings(std::list <CampaignQualityRatingDTO> campaignRatings);


    private:
    std::list<CampaignQualityRatingDTO> campaignRatings;
};
}

#endif /* TINY_CPP_CLIENT_CampaignsQualityRatingDTO_H_ */
