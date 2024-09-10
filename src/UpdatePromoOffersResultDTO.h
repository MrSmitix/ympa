/*
 * UpdatePromoOffersResultDTO.h
 *
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

#ifndef _UpdatePromoOffersResultDTO_H_
#define _UpdatePromoOffersResultDTO_H_


#include <string>
#include "RejectedPromoOfferUpdateDTO.h"
#include "WarningPromoOfferUpdateDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOffersResultDTO();
	UpdatePromoOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOffersResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
	 */
	std::list<RejectedPromoOfferUpdateDTO> getRejectedOffers();

	/*! \brief Set Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
	 */
	void setRejectedOffers(std::list <RejectedPromoOfferUpdateDTO> rejectedOffers);
	/*! \brief Get Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
	 */
	std::list<WarningPromoOfferUpdateDTO> getWarningOffers();

	/*! \brief Set Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
	 */
	void setWarningOffers(std::list <WarningPromoOfferUpdateDTO> warningOffers);

private:
	std::list <RejectedPromoOfferUpdateDTO>rejectedOffers;
	std::list <WarningPromoOfferUpdateDTO>warningOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOffersResultDTO_H_ */
