/*
 * OfferCardRecommendationDTO.h
 *
 * Рекомендация по заполнению карточки товара.
 */

#ifndef _OfferCardRecommendationDTO_H_
#define _OfferCardRecommendationDTO_H_


#include <string>
#include "OfferCardRecommendationType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Рекомендация по заполнению карточки товара.
 *
 *  \ingroup Models
 *
 */

class OfferCardRecommendationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferCardRecommendationDTO();
	OfferCardRecommendationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferCardRecommendationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferCardRecommendationType getType();

	/*! \brief Set 
	 */
	void setType(OfferCardRecommendationType  type);
	/*! \brief Get Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
	 */
	int getPercent();

	/*! \brief Set Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
	 */
	void setPercent(int  percent);

private:
	OfferCardRecommendationType type;
	int percent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferCardRecommendationDTO_H_ */
