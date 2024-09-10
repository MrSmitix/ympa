
/*
 * BusinessSettingsDTO.h
 *
 * Настройки кабинета.
 */

#ifndef TINY_CPP_CLIENT_BusinessSettingsDTO_H_
#define TINY_CPP_CLIENT_BusinessSettingsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Настройки кабинета.
 *
 *  \ingroup Models
 *
 */

class BusinessSettingsDTO{
public:

    /*! \brief Constructor.
	 */
    BusinessSettingsDTO();
    BusinessSettingsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessSettingsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
	 */
	bool isOnlyDefaultPrice();

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
    bool onlyDefaultPrice{};
    CurrencyType currency;
};
}

#endif /* TINY_CPP_CLIENT_BusinessSettingsDTO_H_ */
