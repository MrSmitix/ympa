
/*
 * UpdateCampaignOfferDTO.h
 *
 * Параметры размещения товара в магазине.
 */

#ifndef TINY_CPP_CLIENT_UpdateCampaignOfferDTO_H_
#define TINY_CPP_CLIENT_UpdateCampaignOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QuantumDTO.h"

namespace Tiny {


/*! \brief Параметры размещения товара в магазине.
 *
 *  \ingroup Models
 *
 */

class UpdateCampaignOfferDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateCampaignOfferDTO();
    UpdateCampaignOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateCampaignOfferDTO();


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
	QuantumDTO getQuantum();

	/*! \brief Set 
	 */
	void setQuantum(QuantumDTO  quantum);
	/*! \brief Get Есть ли товар в продаже. 
	 */
	bool isAvailable();

	/*! \brief Set Есть ли товар в продаже. 
	 */
	void setAvailable(bool  available);
	/*! \brief Get Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
	 */
	int getVat();

	/*! \brief Set Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
	 */
	void setVat(int  vat);


    private:
    std::string offerId{};
    QuantumDTO quantum;
    bool available{};
    int vat{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateCampaignOfferDTO_H_ */
