
/*
 * GetCampaignRegionResponse.h
 *
 * Ответ на запрос региона магазина.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignRegionResponse_H_
#define TINY_CPP_CLIENT_GetCampaignRegionResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RegionDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос региона магазина.
 *
 *  \ingroup Models
 *
 */

class GetCampaignRegionResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignRegionResponse();
    GetCampaignRegionResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignRegionResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	RegionDTO getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionDTO  region);


    private:
    RegionDTO region;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignRegionResponse_H_ */
