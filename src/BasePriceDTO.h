/*
 * BasePriceDTO.h
 *
 * Цена на товар.
 */

#ifndef _BasePriceDTO_H_
#define _BasePriceDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена на товар.
 *
 *  \ingroup Models
 *
 */

class BasePriceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	BasePriceDTO();
	BasePriceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BasePriceDTO();

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

private:
	long long value;
	CurrencyType currencyId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BasePriceDTO_H_ */
