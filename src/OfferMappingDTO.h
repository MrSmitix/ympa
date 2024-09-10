/*
 * OfferMappingDTO.h
 *
 * Информация о текущей карточке товара на Маркете.
 */

#ifndef _OfferMappingDTO_H_
#define _OfferMappingDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о текущей карточке товара на Маркете.
 *
 *  \ingroup Models
 *
 */

class OfferMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingDTO();
	OfferMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get SKU на Маркете.
	 */
	long long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long long  marketSku);
	/*! \brief Get Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
	 */
	long long getModelId();

	/*! \brief Set Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
	 */
	void setModelId(long long  modelId);
	/*! \brief Get Идентификатор категории для текущей карточки товара на Маркете.
	 */
	long long getCategoryId();

	/*! \brief Set Идентификатор категории для текущей карточки товара на Маркете.
	 */
	void setCategoryId(long long  categoryId);

private:
	long long marketSku;
	long long modelId;
	long long categoryId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingDTO_H_ */
