
/*
 * GetPriceWithVatDTO.h
 *
 * Цена с указанием ставки НДС и времени последнего обновления.
 */

#ifndef TINY_CPP_CLIENT_GetPriceWithVatDTO_H_
#define TINY_CPP_CLIENT_GetPriceWithVatDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Цена с указанием ставки НДС и времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceWithVatDTO{
public:

    /*! \brief Constructor.
	 */
    GetPriceWithVatDTO();
    GetPriceWithVatDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPriceWithVatDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Цена на товар.
	 */
	long getValue();

	/*! \brief Set Цена на товар.
	 */
	void setValue(long  value);
	/*! \brief Get Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	long getDiscountBase();

	/*! \brief Set Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
	 */
	void setDiscountBase(long  discountBase);
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
    long value{};
    long discountBase{};
    CurrencyType currencyId;
    int vat{};
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_GetPriceWithVatDTO_H_ */
