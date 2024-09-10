/*
 * GetMappingDTO.h
 *
 * Информация о товарах в каталоге. 
 */

#ifndef _GetMappingDTO_H_
#define _GetMappingDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товарах в каталоге. 
 *
 *  \ingroup Models
 *
 */

class GetMappingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetMappingDTO();
	GetMappingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetMappingDTO();

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
	/*! \brief Get Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	std::string getMarketSkuName();

	/*! \brief Set Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketSkuName(std::string  marketSkuName);
	/*! \brief Get Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	long long getMarketModelId();

	/*! \brief Set Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketModelId(long long  marketModelId);
	/*! \brief Get Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	std::string getMarketModelName();

	/*! \brief Set Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketModelName(std::string  marketModelName);
	/*! \brief Get Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	long long getMarketCategoryId();

	/*! \brief Set Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	void setMarketCategoryId(long long  marketCategoryId);
	/*! \brief Get Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	std::string getMarketCategoryName();

	/*! \brief Set Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	void setMarketCategoryName(std::string  marketCategoryName);

private:
	long long marketSku;
	std::string marketSkuName;
	long long marketModelId;
	std::string marketModelName;
	long long marketCategoryId;
	std::string marketCategoryName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetMappingDTO_H_ */
