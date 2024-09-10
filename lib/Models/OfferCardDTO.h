
/*
 * OfferCardDTO.h
 *
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */

#ifndef TINY_CPP_CLIENT_OfferCardDTO_H_
#define TINY_CPP_CLIENT_OfferCardDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetMappingDTO.h"
#include "OfferCardRecommendationDTO.h"
#include "OfferCardStatusType.h"
#include "OfferErrorDTO.h"
#include "ParameterValueDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 *
 *  \ingroup Models
 *
 */

class OfferCardDTO{
public:

    /*! \brief Constructor.
	 */
    OfferCardDTO();
    OfferCardDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCardDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get 
	 */
	GetMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(GetMappingDTO  mapping);
	/*! \brief Get Список характеристик с их значениями. 
	 */
	std::list<ParameterValueDTO> getParameterValues();

	/*! \brief Set Список характеристик с их значениями. 
	 */
	void setParameterValues(std::list <ParameterValueDTO> parameterValues);
	/*! \brief Get 
	 */
	OfferCardStatusType getCardStatus();

	/*! \brief Set 
	 */
	void setCardStatus(OfferCardStatusType  cardStatus);
	/*! \brief Get Процент заполненности карточки.
	 */
	int getContentRating();

	/*! \brief Set Процент заполненности карточки.
	 */
	void setContentRating(int  contentRating);
	/*! \brief Get Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
	 */
	std::list<OfferCardRecommendationDTO> getRecommendations();

	/*! \brief Set Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
	 */
	void setRecommendations(std::list <OfferCardRecommendationDTO> recommendations);
	/*! \brief Get Ошибки в контенте, препятствующие размещению товара на витрине.
	 */
	std::list<OfferErrorDTO> getErrors();

	/*! \brief Set Ошибки в контенте, препятствующие размещению товара на витрине.
	 */
	void setErrors(std::list <OfferErrorDTO> errors);
	/*! \brief Get Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
	 */
	std::list<OfferErrorDTO> getWarnings();

	/*! \brief Set Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
	 */
	void setWarnings(std::list <OfferErrorDTO> warnings);


    private:
    std::string offerId{};
    GetMappingDTO mapping;
    std::list<ParameterValueDTO> parameterValues;
    OfferCardStatusType cardStatus;
    int contentRating{};
    std::list<OfferCardRecommendationDTO> recommendations;
    std::list<OfferErrorDTO> errors;
    std::list<OfferErrorDTO> warnings;
};
}

#endif /* TINY_CPP_CLIENT_OfferCardDTO_H_ */
