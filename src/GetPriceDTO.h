/*
 * GetPriceDTO.h
 *
 * Цена с указанием времени последнего обновления.
 */

#ifndef _GetPriceDTO_H_
#define _GetPriceDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Цена с указанием времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPriceDTO();
	GetPriceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPriceDTO();

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
	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	long long value;
	CurrencyType currencyId;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPriceDTO_H_ */
