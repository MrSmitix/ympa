/*
 * GetPriceWithVatDTO.h
 *
 * Цена с указанием ставки НДС и времени последнего обновления.
 */

#ifndef _GetPriceWithVatDTO_H_
#define _GetPriceWithVatDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена с указанием ставки НДС и времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceWithVatDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPriceWithVatDTO();
	GetPriceWithVatDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPriceWithVatDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Цена на товар.
	 */
	long long getValue();

	/*! \brief Set Цена на товар.
	 */
	void setValue(long long  value);
	/*! \brief Get Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	long long getDiscountBase();

	/*! \brief Set Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	void setDiscountBase(long long  discountBase);
	/*! \brief Get 
	 */
	CurrencyType getCurrencyId();

	/*! \brief Set 
	 */
	void setCurrencyId(CurrencyType  currencyId);
	/*! \brief Get Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
	 */
	int getVat();

	/*! \brief Set Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
	 */
	void setVat(int  vat);
	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	long long value;
	long long discountBase;
	CurrencyType currencyId;
	int vat;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPriceWithVatDTO_H_ */
