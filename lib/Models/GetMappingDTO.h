
/*
 * GetMappingDTO.h
 *
 * Информация о товарах в каталоге. 
 */

#ifndef TINY_CPP_CLIENT_GetMappingDTO_H_
#define TINY_CPP_CLIENT_GetMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о товарах в каталоге. 
 *
 *  \ingroup Models
 *
 */

class GetMappingDTO{
public:

    /*! \brief Constructor.
	 */
    GetMappingDTO();
    GetMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetMappingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get SKU на Маркете.
	 */
	long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long  marketSku);
	/*! \brief Get Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	std::string getMarketSkuName();

	/*! \brief Set Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketSkuName(std::string  marketSkuName);
	/*! \brief Get Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	long getMarketModelId();

	/*! \brief Set Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketModelId(long  marketModelId);
	/*! \brief Get Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	std::string getMarketModelName();

	/*! \brief Set Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	 */
	void setMarketModelName(std::string  marketModelName);
	/*! \brief Get Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	long getMarketCategoryId();

	/*! \brief Set Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	void setMarketCategoryId(long  marketCategoryId);
	/*! \brief Get Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	std::string getMarketCategoryName();

	/*! \brief Set Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	 */
	void setMarketCategoryName(std::string  marketCategoryName);


    private:
    long marketSku{};
    std::string marketSkuName{};
    long marketModelId{};
    std::string marketModelName{};
    long marketCategoryId{};
    std::string marketCategoryName{};
};
}

#endif /* TINY_CPP_CLIENT_GetMappingDTO_H_ */
