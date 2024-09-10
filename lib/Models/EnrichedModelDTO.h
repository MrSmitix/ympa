
/*
 * EnrichedModelDTO.h
 *
 * Модель товара.
 */

#ifndef TINY_CPP_CLIENT_EnrichedModelDTO_H_
#define TINY_CPP_CLIENT_EnrichedModelDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ModelOfferDTO.h"
#include "ModelPriceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Модель товара.
 *
 *  \ingroup Models
 *
 */

class EnrichedModelDTO{
public:

    /*! \brief Constructor.
	 */
    EnrichedModelDTO();
    EnrichedModelDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EnrichedModelDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор модели товара.
	 */
	long getId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setId(long  id);
	/*! \brief Get Название модели товара.
	 */
	std::string getName();

	/*! \brief Set Название модели товара.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ModelPriceDTO getPrices();

	/*! \brief Set 
	 */
	void setPrices(ModelPriceDTO  prices);
	/*! \brief Get Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
	 */
	std::list<ModelOfferDTO> getOffers();

	/*! \brief Set Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
	 */
	void setOffers(std::list <ModelOfferDTO> offers);
	/*! \brief Get Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
	 */
	int getOfflineOffers();

	/*! \brief Set Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
	 */
	void setOfflineOffers(int  offlineOffers);
	/*! \brief Get Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
	 */
	int getOnlineOffers();

	/*! \brief Set Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
	 */
	void setOnlineOffers(int  onlineOffers);


    private:
    long id{};
    std::string name{};
    ModelPriceDTO prices;
    std::list<ModelOfferDTO> offers;
    int offlineOffers{};
    int onlineOffers{};
};
}

#endif /* TINY_CPP_CLIENT_EnrichedModelDTO_H_ */
