/*
 * OfferPriceResponseDTO.h
 *
 * Информация об установленной цене на товар.
 */

#ifndef _OfferPriceResponseDTO_H_
#define _OfferPriceResponseDTO_H_


#include <string>
#include "PriceDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об установленной цене на товар.
 *
 *  \ingroup Models
 *
 */

class OfferPriceResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferPriceResponseDTO();
	OfferPriceResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferPriceResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор предложения из прайс-листа.
	 */
	std::string getId();

	/*! \brief Set Идентификатор предложения из прайс-листа.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	PriceDTO getPrice();

	/*! \brief Set 
	 */
	void setPrice(PriceDTO  price);
	/*! \brief Get SKU на Маркете.
	 */
	long long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long long  marketSku);
	/*! \brief Get Дата и время последнего обновления цены на товар.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего обновления цены на товар.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	std::string id;
	PriceDTO price;
	long long marketSku;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferPriceResponseDTO_H_ */
