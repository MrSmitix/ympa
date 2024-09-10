/*
 * GetOfferMappingsResultDTO.h
 *
 * Информация о товарах.
 */

#ifndef _GetOfferMappingsResultDTO_H_
#define _GetOfferMappingsResultDTO_H_


#include <string>
#include "GetOfferMappingDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товарах.
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingsResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferMappingsResultDTO();
	GetOfferMappingsResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferMappingsResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Информация о товарах.
	 */
	std::list<GetOfferMappingDTO> getOfferMappings();

	/*! \brief Set Информация о товарах.
	 */
	void setOfferMappings(std::list <GetOfferMappingDTO> offerMappings);

private:
	ScrollingPagerDTO paging;
	std::list <GetOfferMappingDTO>offerMappings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferMappingsResultDTO_H_ */
