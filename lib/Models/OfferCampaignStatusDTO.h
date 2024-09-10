
/*
 * OfferCampaignStatusDTO.h
 *
 * Статус товара в магазине.
 */

#ifndef TINY_CPP_CLIENT_OfferCampaignStatusDTO_H_
#define TINY_CPP_CLIENT_OfferCampaignStatusDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferCampaignStatusType.h"

namespace Tiny {


/*! \brief Статус товара в магазине.
 *
 *  \ingroup Models
 *
 */

class OfferCampaignStatusDTO{
public:

    /*! \brief Constructor.
	 */
    OfferCampaignStatusDTO();
    OfferCampaignStatusDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCampaignStatusDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании. 
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании. 
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get 
	 */
	OfferCampaignStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferCampaignStatusType  status);


    private:
    long campaignId{};
    OfferCampaignStatusType status;
};
}

#endif /* TINY_CPP_CLIENT_OfferCampaignStatusDTO_H_ */
