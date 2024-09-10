
/*
 * DeleteCampaignOffersRequest.h
 *
 * Фильтрации удаляемых товаров по offerIds. 
 */

#ifndef TINY_CPP_CLIENT_DeleteCampaignOffersRequest_H_
#define TINY_CPP_CLIENT_DeleteCampaignOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Фильтрации удаляемых товаров по offerIds. 
 *
 *  \ingroup Models
 *
 */

class DeleteCampaignOffersRequest{
public:

    /*! \brief Constructor.
	 */
    DeleteCampaignOffersRequest();
    DeleteCampaignOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteCampaignOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы товаров в каталоге.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров в каталоге.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_DeleteCampaignOffersRequest_H_ */
