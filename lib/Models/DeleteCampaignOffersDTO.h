
/*
 * DeleteCampaignOffersDTO.h
 *
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */

#ifndef TINY_CPP_CLIENT_DeleteCampaignOffersDTO_H_
#define TINY_CPP_CLIENT_DeleteCampaignOffersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 *
 *  \ingroup Models
 *
 */

class DeleteCampaignOffersDTO{
public:

    /*! \brief Constructor.
	 */
    DeleteCampaignOffersDTO();
    DeleteCampaignOffersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteCampaignOffersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список SKU.
	 */
	std::list<std::string> getNotDeletedOfferIds();

	/*! \brief Set Список SKU.
	 */
	void setNotDeletedOfferIds(std::list <std::string> notDeletedOfferIds);


    private:
    std::list<std::string> notDeletedOfferIds;
};
}

#endif /* TINY_CPP_CLIENT_DeleteCampaignOffersDTO_H_ */
