/*
 * UpdatePriceWithDiscountDTO.h
 *
 * Цена с указанием скидки.
 */

#ifndef _UpdatePriceWithDiscountDTO_H_
#define _UpdatePriceWithDiscountDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена с указанием скидки.
 *
 *  \ingroup Models
 *
 */

class UpdatePriceWithDiscountDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePriceWithDiscountDTO();
	UpdatePriceWithDiscountDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePriceWithDiscountDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Значение.
	 */
	long long getValue();

	/*! \brief Set Значение.
	 */
	void setValue(long long  value);
	/*! \brief Get 
	 */
	CurrencyType getCurrencyId();

	/*! \brief Set 
	 */
	void setCurrencyId(CurrencyType  currencyId);
	/*! \brief Get Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	long long getDiscountBase();

	/*! \brief Set Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	void setDiscountBase(long long  discountBase);

private:
	long long value;
	CurrencyType currencyId;
	long long discountBase;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePriceWithDiscountDTO_H_ */
