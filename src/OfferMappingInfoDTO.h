/*
 * OfferMappingInfoDTO.h
 *
 * Информация о карточке товара.
 */

#ifndef _OfferMappingInfoDTO_H_
#define _OfferMappingInfoDTO_H_


#include <string>
#include "OfferMappingDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о карточке товара.
 *
 *  \ingroup Models
 *
 */

class OfferMappingInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingInfoDTO();
	OfferMappingInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingInfoDTO();

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

private:
	OfferMappingDTO mapping;
	OfferMappingDTO awaitingModerationMapping;
	OfferMappingDTO rejectedMapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingInfoDTO_H_ */
