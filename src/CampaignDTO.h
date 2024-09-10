/*
 * CampaignDTO.h
 *
 * Информация о магазине.
 */

#ifndef _CampaignDTO_H_
#define _CampaignDTO_H_


#include <string>
#include "BusinessDTO.h"
#include "PlacementType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о магазине.
 *
 *  \ingroup Models
 *
 */

class CampaignDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignDTO();
	CampaignDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get URL магазина.
	 */
	std::string getDomain();

	/*! \brief Set URL магазина.
	 */
	void setDomain(std::string  domain);
	/*! \brief Get Идентификатор кампании.
	 */
	long long getId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setId(long long  id);
	/*! \brief Get Идентификатор плательщика в Яндекс Балансе.
	 */
	long long getClientId();

	/*! \brief Set Идентификатор плательщика в Яндекс Балансе.
	 */
	void setClientId(long long  clientId);
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
	std::string domain;
	long long id;
	long long clientId;
	BusinessDTO business;
	PlacementType placementType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignDTO_H_ */
