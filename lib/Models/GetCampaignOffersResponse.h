
/*
 * GetCampaignOffersResponse.h
 *
 * Ответ на запрос списка товаров в магазине.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignOffersResponse_H_
#define TINY_CPP_CLIENT_GetCampaignOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetCampaignOffersResultDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка товаров в магазине.
 *
 *  \ingroup Models
 *
 */

class GetCampaignOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignOffersResponse();
    GetCampaignOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignOffersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get 
	 */
	GetCampaignOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetCampaignOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetCampaignOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignOffersResponse_H_ */
