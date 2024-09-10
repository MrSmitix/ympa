
/*
 * UpdatePriceWithDiscountDTO.h
 *
 * Цена с указанием скидки.
 */

#ifndef TINY_CPP_CLIENT_UpdatePriceWithDiscountDTO_H_
#define TINY_CPP_CLIENT_UpdatePriceWithDiscountDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Цена с указанием скидки.
 *
 *  \ingroup Models
 *
 */

class UpdatePriceWithDiscountDTO{
public:

    /*! \brief Constructor.
	 */
    UpdatePriceWithDiscountDTO();
    UpdatePriceWithDiscountDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePriceWithDiscountDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение.
	 */
	long getValue();

	/*! \brief Set Значение.
	 */
	void setValue(long  value);
	/*! \brief Get 
	 */
	CurrencyType getCurrencyId();

	/*! \brief Set 
	 */
	void setCurrencyId(CurrencyType  currencyId);
	/*! \brief Get Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	long getDiscountBase();

	/*! \brief Set Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	void setDiscountBase(long  discountBase);


    private:
    long value{};
    CurrencyType currencyId;
    long discountBase{};
};
}

#endif /* TINY_CPP_CLIENT_UpdatePriceWithDiscountDTO_H_ */
