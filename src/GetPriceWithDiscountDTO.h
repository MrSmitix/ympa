/*
 * GetPriceWithDiscountDTO.h
 *
 * Цена с указанием скидки и времени последнего обновления.
 */

#ifndef _GetPriceWithDiscountDTO_H_
#define _GetPriceWithDiscountDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена с указанием скидки и времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceWithDiscountDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPriceWithDiscountDTO();
	GetPriceWithDiscountDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPriceWithDiscountDTO();

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
	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	long long value;
	CurrencyType currencyId;
	long long discountBase;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPriceWithDiscountDTO_H_ */
