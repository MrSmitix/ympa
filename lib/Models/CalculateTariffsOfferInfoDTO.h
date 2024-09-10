
/*
 * CalculateTariffsOfferInfoDTO.h
 *
 * Стоимость услуг.
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsOfferInfoDTO_H_
#define TINY_CPP_CLIENT_CalculateTariffsOfferInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CalculateTariffsOfferDTO.h"
#include "CalculatedTariffDTO.h"
#include <list>

namespace Tiny {


/*! \brief Стоимость услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsOfferInfoDTO{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsOfferInfoDTO();
    CalculateTariffsOfferInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsOfferInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<CalculatedTariffDTO> tariffs;
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsOfferInfoDTO_H_ */
