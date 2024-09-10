/*
 * BusinessSettingsDTO.h
 *
 * Настройки кабинета.
 */

#ifndef _BusinessSettingsDTO_H_
#define _BusinessSettingsDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Настройки кабинета.
 *
 *  \ingroup Models
 *
 */

class BusinessSettingsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessSettingsDTO();
	BusinessSettingsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessSettingsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
	 */
	bool getOnlyDefaultPrice();

	/*! \brief Set Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
	 */
	void setOnlyDefaultPrice(bool  onlyDefaultPrice);
	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);

private:
	bool onlyDefaultPrice;
	CurrencyType currency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessSettingsDTO_H_ */
