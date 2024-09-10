
/*
 * OfferMappingDTO.h
 *
 * Информация о текущей карточке товара на Маркете.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingDTO_H_
#define TINY_CPP_CLIENT_OfferMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о текущей карточке товара на Маркете.
 *
 *  \ingroup Models
 *
 */

class OfferMappingDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingDTO();
    OfferMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingDTO();


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
	/*! \brief Get Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
	 */
	long getModelId();

	/*! \brief Set Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
	 */
	void setModelId(long  modelId);
	/*! \brief Get Идентификатор категории для текущей карточки товара на Маркете.
	 */
	long getCategoryId();

	/*! \brief Set Идентификатор категории для текущей карточки товара на Маркете.
	 */
	void setCategoryId(long  categoryId);


    private:
    long marketSku{};
    long modelId{};
    long categoryId{};
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingDTO_H_ */
