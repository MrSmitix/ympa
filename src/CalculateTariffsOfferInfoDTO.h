/*
 * CalculateTariffsOfferInfoDTO.h
 *
 * Стоимость услуг.
 */

#ifndef _CalculateTariffsOfferInfoDTO_H_
#define _CalculateTariffsOfferInfoDTO_H_


#include <string>
#include "CalculateTariffsOfferDTO.h"
#include "CalculatedTariffDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Стоимость услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsOfferInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsOfferInfoDTO();
	CalculateTariffsOfferInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsOfferInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CalculateTariffsOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(CalculateTariffsOfferDTO  offer);
	/*! \brief Get Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	 */
	std::list<CalculatedTariffDTO> getTariffs();

	/*! \brief Set Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	 */
	void setTariffs(std::list <CalculatedTariffDTO> tariffs);

private:
	CalculateTariffsOfferDTO offer;
	std::list <CalculatedTariffDTO>tariffs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsOfferInfoDTO_H_ */
