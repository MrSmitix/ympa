/*
 * UpdateOfferMappingsRequest.h
 *
 * 
 */

#ifndef _UpdateOfferMappingsRequest_H_
#define _UpdateOfferMappingsRequest_H_


#include <string>
#include "UpdateOfferMappingDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferMappingsRequest();
	UpdateOfferMappingsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferMappingsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Перечень товаров, которые нужно добавить или обновить.
	 */
	std::list<UpdateOfferMappingDTO> getOfferMappings();

	/*! \brief Set Перечень товаров, которые нужно добавить или обновить.
	 */
	void setOfferMappings(std::list <UpdateOfferMappingDTO> offerMappings);
	/*! \brief Get Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
	 */
	bool getOnlyPartnerMediaContent();

	/*! \brief Set Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
	 */
	void setOnlyPartnerMediaContent(bool  onlyPartnerMediaContent);

private:
	std::list <UpdateOfferMappingDTO>offerMappings;
	bool onlyPartnerMediaContent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferMappingsRequest_H_ */
