/*
 * SuggestedOfferMappingDTO.h
 *
 * Товар с соответствующей карточкой на Маркете.
 */

#ifndef _SuggestedOfferMappingDTO_H_
#define _SuggestedOfferMappingDTO_H_


#include <string>
#include "GetMappingDTO.h"
#include "SuggestedOfferDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товар с соответствующей карточкой на Маркете.
 *
 *  \ingroup Models
 *
 */

class SuggestedOfferMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	SuggestedOfferMappingDTO();
	SuggestedOfferMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SuggestedOfferMappingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	SuggestedOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(SuggestedOfferDTO  offer);
	/*! \brief Get 
	 */
	GetMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(GetMappingDTO  mapping);

private:
	SuggestedOfferDTO offer;
	GetMappingDTO mapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SuggestedOfferMappingDTO_H_ */
