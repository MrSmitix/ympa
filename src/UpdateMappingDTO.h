/*
 * UpdateMappingDTO.h
 *
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 */

#ifndef _UpdateMappingDTO_H_
#define _UpdateMappingDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 *
 *  \ingroup Models
 *
 */

class UpdateMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMappingDTO();
	UpdateMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMappingDTO();

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

private:
	long long marketSku;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMappingDTO_H_ */
