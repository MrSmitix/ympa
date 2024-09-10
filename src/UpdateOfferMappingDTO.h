/*
 * UpdateOfferMappingDTO.h
 *
 * Информация о товаре.
 */

#ifndef _UpdateOfferMappingDTO_H_
#define _UpdateOfferMappingDTO_H_


#include <string>
#include "UpdateMappingDTO.h"
#include "UpdateOfferDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товаре.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferMappingDTO();
	UpdateOfferMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferMappingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	UpdateOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(UpdateOfferDTO  offer);
	/*! \brief Get 
	 */
	UpdateMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(UpdateMappingDTO  mapping);

private:
	UpdateOfferDTO offer;
	UpdateMappingDTO mapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferMappingDTO_H_ */
