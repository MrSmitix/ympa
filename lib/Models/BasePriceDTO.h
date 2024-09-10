
/*
 * BasePriceDTO.h
 *
 * Цена на товар.
 */

#ifndef TINY_CPP_CLIENT_BasePriceDTO_H_
#define TINY_CPP_CLIENT_BasePriceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Цена на товар.
 *
 *  \ingroup Models
 *
 */

class BasePriceDTO{
public:

    /*! \brief Constructor.
	 */
    BasePriceDTO();
    BasePriceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BasePriceDTO();


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


    private:
    long value{};
    CurrencyType currencyId;
};
}

#endif /* TINY_CPP_CLIENT_BasePriceDTO_H_ */
