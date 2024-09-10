
/*
 * GetCampaignResponse.h
 *
 * Информация о магазине к данным идентификатора кампании.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignResponse_H_
#define TINY_CPP_CLIENT_GetCampaignResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignDTO.h"

namespace Tiny {


/*! \brief Информация о магазине к данным идентификатора кампании.
 *
 *  \ingroup Models
 *
 */

class GetCampaignResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignResponse();
    GetCampaignResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignDTO getCampaign();

	/*! \brief Set 
	 */
	void setCampaign(CampaignDTO  campaign);


    private:
    CampaignDTO campaign;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignResponse_H_ */
