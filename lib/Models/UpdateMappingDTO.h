
/*
 * UpdateMappingDTO.h
 *
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 */

#ifndef TINY_CPP_CLIENT_UpdateMappingDTO_H_
#define TINY_CPP_CLIENT_UpdateMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 *
 *  \ingroup Models
 *
 */

class UpdateMappingDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateMappingDTO();
    UpdateMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMappingDTO();


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


    private:
    long marketSku{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateMappingDTO_H_ */
