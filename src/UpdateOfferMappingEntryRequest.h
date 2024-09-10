/*
 * UpdateOfferMappingEntryRequest.h
 *
 * Запрос на обновление товаров.
 */

#ifndef _UpdateOfferMappingEntryRequest_H_
#define _UpdateOfferMappingEntryRequest_H_


#include <string>
#include "UpdateOfferMappingEntryDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на обновление товаров.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingEntryRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferMappingEntryRequest();
	UpdateOfferMappingEntryRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferMappingEntryRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Информация о товарах в каталоге.
	 */
	std::list<UpdateOfferMappingEntryDTO> getOfferMappingEntries();

	/*! \brief Set Информация о товарах в каталоге.
	 */
	void setOfferMappingEntries(std::list <UpdateOfferMappingEntryDTO> offerMappingEntries);

private:
	std::list <UpdateOfferMappingEntryDTO>offerMappingEntries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferMappingEntryRequest_H_ */
