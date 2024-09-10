
/*
 * DeleteCampaignOffersResponse.h
 *
 * Результат удаления товаров.
 */

#ifndef TINY_CPP_CLIENT_DeleteCampaignOffersResponse_H_
#define TINY_CPP_CLIENT_DeleteCampaignOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "DeleteCampaignOffersDTO.h"

namespace Tiny {


/*! \brief Результат удаления товаров.
 *
 *  \ingroup Models
 *
 */

class DeleteCampaignOffersResponse{
public:

    /*! \brief Constructor.
	 */
    DeleteCampaignOffersResponse();
    DeleteCampaignOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteCampaignOffersResponse();


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
	DeleteCampaignOffersDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeleteCampaignOffersDTO  result);


    private:
    ApiResponseStatusType status;
    DeleteCampaignOffersDTO result;
};
}

#endif /* TINY_CPP_CLIENT_DeleteCampaignOffersResponse_H_ */
