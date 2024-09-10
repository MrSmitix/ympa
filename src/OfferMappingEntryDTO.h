/*
 * OfferMappingEntryDTO.h
 *
 * Список товаров. 
 */

#ifndef _OfferMappingEntryDTO_H_
#define _OfferMappingEntryDTO_H_


#include <string>
#include "MappingsOfferDTO.h"
#include "OfferMappingDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров. 
 *
 *  \ingroup Models
 *
 */

class OfferMappingEntryDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingEntryDTO();
	OfferMappingEntryDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingEntryDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(OfferMappingDTO  mapping);
	/*! \brief Get 
	 */
	OfferMappingDTO getAwaitingModerationMapping();

	/*! \brief Set 
	 */
	void setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping);
	/*! \brief Get 
	 */
	OfferMappingDTO getRejectedMapping();

	/*! \brief Set 
	 */
	void setRejectedMapping(OfferMappingDTO  rejectedMapping);
	/*! \brief Get 
	 */
	MappingsOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(MappingsOfferDTO  offer);

private:
	OfferMappingDTO mapping;
	OfferMappingDTO awaitingModerationMapping;
	OfferMappingDTO rejectedMapping;
	MappingsOfferDTO offer;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingEntryDTO_H_ */
