/*
 * OfferConditionDTO.h
 *
 * Состояние уцененного товара. 
 */

#ifndef _OfferConditionDTO_H_
#define _OfferConditionDTO_H_


#include <string>
#include "OfferConditionQualityType.h"
#include "OfferConditionType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Состояние уцененного товара. 
 *
 *  \ingroup Models
 *
 */

class OfferConditionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferConditionDTO();
	OfferConditionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferConditionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferConditionType getType();

	/*! \brief Set 
	 */
	void setType(OfferConditionType  type);
	/*! \brief Get 
	 */
	OfferConditionQualityType getQuality();

	/*! \brief Set 
	 */
	void setQuality(OfferConditionQualityType  quality);
	/*! \brief Get Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
	 */
	std::string getReason();

	/*! \brief Set Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
	 */
	void setReason(std::string  reason);

private:
	OfferConditionType type;
	OfferConditionQualityType quality;
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferConditionDTO_H_ */
