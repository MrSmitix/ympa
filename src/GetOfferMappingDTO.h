/*
 * GetOfferMappingDTO.h
 *
 * Информация о товаре.
 */

#ifndef _GetOfferMappingDTO_H_
#define _GetOfferMappingDTO_H_


#include <string>
#include "GetMappingDTO.h"
#include "GetOfferDTO.h"
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

class GetOfferMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferMappingDTO();
	GetOfferMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferMappingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	GetOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(GetOfferDTO  offer);
	/*! \brief Get 
	 */
	GetMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(GetMappingDTO  mapping);

private:
	GetOfferDTO offer;
	GetMappingDTO mapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferMappingDTO_H_ */
