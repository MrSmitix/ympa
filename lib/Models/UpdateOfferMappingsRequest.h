
/*
 * UpdateOfferMappingsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferMappingsRequest_H_
#define TINY_CPP_CLIENT_UpdateOfferMappingsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateOfferMappingDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingsRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferMappingsRequest();
    UpdateOfferMappingsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferMappingsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Перечень товаров, которые нужно добавить или обновить.
	 */
	std::list<UpdateOfferMappingDTO> getOfferMappings();

	/*! \brief Set Перечень товаров, которые нужно добавить или обновить.
	 */
	void setOfferMappings(std::list <UpdateOfferMappingDTO> offerMappings);
	/*! \brief Get Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
	 */
	bool isOnlyPartnerMediaContent();

	/*! \brief Set Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
	 */
	void setOnlyPartnerMediaContent(bool  onlyPartnerMediaContent);


    private:
    std::list<UpdateOfferMappingDTO> offerMappings;
    bool onlyPartnerMediaContent{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferMappingsRequest_H_ */
