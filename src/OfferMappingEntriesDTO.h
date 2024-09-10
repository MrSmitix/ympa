/*
 * OfferMappingEntriesDTO.h
 *
 * Информация о товарах в каталоге.
 */

#ifndef _OfferMappingEntriesDTO_H_
#define _OfferMappingEntriesDTO_H_


#include <string>
#include "OfferMappingEntryDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товарах в каталоге.
 *
 *  \ingroup Models
 *
 */

class OfferMappingEntriesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingEntriesDTO();
	OfferMappingEntriesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingEntriesDTO();

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
	/*! \brief Get Информация о товарах в каталоге.
	 */
	std::list<OfferMappingEntryDTO> getOfferMappingEntries();

	/*! \brief Set Информация о товарах в каталоге.
	 */
	void setOfferMappingEntries(std::list <OfferMappingEntryDTO> offerMappingEntries);

private:
	ScrollingPagerDTO paging;
	std::list <OfferMappingEntryDTO>offerMappingEntries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingEntriesDTO_H_ */
