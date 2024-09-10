/*
 * UpdateOfferMappingEntryDTO.h
 *
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 */

#ifndef _UpdateOfferMappingEntryDTO_H_
#define _UpdateOfferMappingEntryDTO_H_


#include <string>
#include "OfferMappingDTO.h"
#include "UpdateMappingsOfferDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingEntryDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferMappingEntryDTO();
	UpdateOfferMappingEntryDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferMappingEntryDTO();

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
	UpdateMappingsOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(UpdateMappingsOfferDTO  offer);

private:
	OfferMappingDTO mapping;
	OfferMappingDTO awaitingModerationMapping;
	OfferMappingDTO rejectedMapping;
	UpdateMappingsOfferDTO offer;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferMappingEntryDTO_H_ */
