/*
 * SuggestPricesResultDTO.h
 *
 * Результат запроса цен для продвижения.
 */

#ifndef _SuggestPricesResultDTO_H_
#define _SuggestPricesResultDTO_H_


#include <string>
#include "PriceSuggestOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат запроса цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	SuggestPricesResultDTO();
	SuggestPricesResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SuggestPricesResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров с ценами для продвижения.
	 */
	std::list<PriceSuggestOfferDTO> getOffers();

	/*! \brief Set Список товаров с ценами для продвижения.
	 */
	void setOffers(std::list <PriceSuggestOfferDTO> offers);

private:
	std::list <PriceSuggestOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SuggestPricesResultDTO_H_ */
