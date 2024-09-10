
/*
 * CampaignDTO.h
 *
 * Информация о магазине.
 */

#ifndef TINY_CPP_CLIENT_CampaignDTO_H_
#define TINY_CPP_CLIENT_CampaignDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessDTO.h"
#include "PlacementType.h"

namespace Tiny {


/*! \brief Информация о магазине.
 *
 *  \ingroup Models
 *
 */

class CampaignDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignDTO();
    CampaignDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get URL магазина.
	 */
	std::string getDomain();

	/*! \brief Set URL магазина.
	 */
	void setDomain(std::string  domain);
	/*! \brief Get Идентификатор кампании.
	 */
	long getId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setId(long  id);
	/*! \brief Get Идентификатор плательщика в Яндекс Балансе.
	 */
	long getClientId();

	/*! \brief Set Идентификатор плательщика в Яндекс Балансе.
	 */
	void setClientId(long  clientId);
	/*! \brief Get 
	 */
	BusinessDTO getBusiness();

	/*! \brief Set 
	 */
	void setBusiness(BusinessDTO  business);
	/*! \brief Get 
	 */
	PlacementType getPlacementType();

	/*! \brief Set 
	 */
	void setPlacementType(PlacementType  placementType);


    private:
    std::string domain{};
    long id{};
    long clientId{};
    BusinessDTO business;
    PlacementType placementType;
};
}

#endif /* TINY_CPP_CLIENT_CampaignDTO_H_ */
