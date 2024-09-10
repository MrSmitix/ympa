
/*
 * GetCampaignsResponse.h
 *
 * Результаты поиска магазинов.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignsResponse_H_
#define TINY_CPP_CLIENT_GetCampaignsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignDTO.h"
#include "FlippingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Результаты поиска магазинов.
 *
 *  \ingroup Models
 *
 */

class GetCampaignsResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignsResponse();
    GetCampaignsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список с информацией по каждому магазину.
	 */
	std::list<CampaignDTO> getCampaigns();

	/*! \brief Set Список с информацией по каждому магазину.
	 */
	void setCampaigns(std::list <CampaignDTO> campaigns);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);


    private:
    std::list<CampaignDTO> campaigns;
    FlippingPagerDTO pager;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignsResponse_H_ */
