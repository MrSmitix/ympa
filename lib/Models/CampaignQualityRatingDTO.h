
/*
 * CampaignQualityRatingDTO.h
 *
 * Информация об индексе качества магазина.
 */

#ifndef TINY_CPP_CLIENT_CampaignQualityRatingDTO_H_
#define TINY_CPP_CLIENT_CampaignQualityRatingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QualityRatingDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об индексе качества магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignQualityRatingDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignQualityRatingDTO();
    CampaignQualityRatingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignQualityRatingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор магазина.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор магазина.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Список значений индекса качества.
	 */
	std::list<QualityRatingDTO> getRatings();

	/*! \brief Set Список значений индекса качества.
	 */
	void setRatings(std::list <QualityRatingDTO> ratings);


    private:
    long campaignId{};
    std::list<QualityRatingDTO> ratings;
};
}

#endif /* TINY_CPP_CLIENT_CampaignQualityRatingDTO_H_ */
