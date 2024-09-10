/*
 * EnrichedModelDTO.h
 *
 * Модель товара.
 */

#ifndef _EnrichedModelDTO_H_
#define _EnrichedModelDTO_H_


#include <string>
#include "ModelOfferDTO.h"
#include "ModelPriceDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Модель товара.
 *
 *  \ingroup Models
 *
 */

class EnrichedModelDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	EnrichedModelDTO();
	EnrichedModelDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnrichedModelDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор модели товара.
	 */
	long long getId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setId(long long  id);
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
	long long id;
	std::string name;
	ModelPriceDTO prices;
	std::list <ModelOfferDTO>offers;
	int offlineOffers;
	int onlineOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnrichedModelDTO_H_ */
