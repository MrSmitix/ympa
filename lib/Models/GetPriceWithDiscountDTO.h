
/*
 * GetPriceWithDiscountDTO.h
 *
 * Цена с указанием скидки и времени последнего обновления.
 */

#ifndef TINY_CPP_CLIENT_GetPriceWithDiscountDTO_H_
#define TINY_CPP_CLIENT_GetPriceWithDiscountDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Цена с указанием скидки и времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceWithDiscountDTO{
public:

    /*! \brief Constructor.
	 */
    GetPriceWithDiscountDTO();
    GetPriceWithDiscountDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPriceWithDiscountDTO();


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
	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    long value{};
    CurrencyType currencyId;
    long discountBase{};
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_GetPriceWithDiscountDTO_H_ */
